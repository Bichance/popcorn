package spring.sts.popcorn;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import spring.mapper.popcorn.QnaMapper;
import spring.mapper.popcorn.QreplyMapper;
import spring.model.qna.QnaDTO;
import spring.model.qna.QnaService;
import spring.utility.popcorn.Utility;


@Controller
public class QnaController {
	
	@Autowired
	private QnaService qService;
	@Autowired
	private QnaMapper qMapper;
	@Autowired
    private QreplyMapper qReplyMapper;
	
	@PostMapping("/qna/reply")
	public String reply(QnaDTO dto, RedirectAttributes redi, Model model) {
		
		try {
			qService.reply(dto);
			redi.addFlashAttribute("msg","답변을 등록하였습니다.");
			return "redirect:/qna/list";
		}catch(Exception e){
			model.addAttribute("flag", false);
			return "error/error";
		}
	}
	
	@GetMapping("/qna/reply")
	public String reply(int qna_num, Model model) {
		model.addAttribute("dto", qMapper.readReply(qna_num));
		return "/qna/reply";
	}
	
	@PostMapping("/qna/delete")
	public String delete(@RequestParam Map<String,String> map, Model model, RedirectAttributes redi, int qna_num) {
		
		boolean flag = false;
		boolean pflag = qMapper.passCheck(map)>0;
		
			try {
				if(pflag){
					qService.delete(qna_num);
					redi.addFlashAttribute("msg"," 게시물을 삭제했습니다.");
					return "redirect:/qna/list";
				}else{
					model.addAttribute("pflag",pflag);
					return "error/passwdError";
				}
			} catch (Exception e) {
				model.addAttribute("flag",flag);
				return "error/error";
			} //update를 실행
		}	
	
	@GetMapping("/qna/delete")
	public String delete(int qna_num, Model model) {
		model.addAttribute("flag",qMapper.refnumCheck(qna_num)>0);
		return "/qna/delete";
	}
	
	@GetMapping("/qna/update")
	public String update(int qna_num, Model model) {
		model.addAttribute("dto", qMapper.read(qna_num));
		return "/qna/update";
	}
	
	@PostMapping("/qna/update")
	public String update(QnaDTO dto, Model model, RedirectAttributes redi) {
		//패스워드 검증
		Map map = new HashMap();
		map.put("qna_num", dto.getQna_num());
		map.put("qna_pw", dto.getQna_pw());
		
		boolean pflag = qMapper.passCheck(map)>0;
		//검증 끝
				
		boolean flag = false;
		if(pflag) 
			flag = qMapper.update(dto)>0;
		else {
			model.addAttribute("pflag",pflag);
			return "error/passwdError";
		}
		
		if(flag) {
			redi.addFlashAttribute("msg","게시물을 수정했습니다.");
			return "redirect:/qna/list";
		}else {
			model.addAttribute("flag",flag);
			return "error/error";
		}	
		
	}
	
	@GetMapping("/bbs/read")
	public String read(int qna_num, Model model, int nowPage, String col, String word, HttpServletRequest request) {
	
		QnaDTO dto = qMapper.read(qna_num);
		//qMapper.upViewcnt(qna_num);
		dto.setQna_content(dto.getQna_content().replaceAll("\r\n", "<br>"));
		
		model.addAttribute("dto", dto);
		 /* 댓글 관련  시작 */
		int nPage= 1; //시작 페이지 번호는 1부터 
		 
		if (request.getParameter("nPage") != null) { 
		nPage= Integer.parseInt(request.getParameter("nPage"));  
		}
		int recordPerPage = 3; // 한페이지당 출력할 레코드 갯수
		 
		int sno = ((nPage-1) * recordPerPage) + 1; // 
		int eno = nPage * recordPerPage;
		 
		Map map = new HashMap();
		map.put("sno", sno);
		map.put("eno", eno);
		map.put("qna_num", qna_num);
		map.put("nPage", nPage);
		map.put("nowPage", nowPage);
		map.put("col", col);
		map.put("word", word);
		 
		model.addAllAttributes(map);
		 
		/* 댓글 관련 끝 */  
		return "/qna/read";
	}
	
	@PostMapping("/qna/create")
	public String create(QnaDTO dto, Model model, RedirectAttributes redi) {
		boolean flag = qMapper.create(dto)>0;
		if(flag) {
			redi.addFlashAttribute("msg","게시글을 올렸습니다.");
			return "redirect:/qna/list";
		}else {
			model.addAttribute("flag", flag);
			return "error/error";
		}
	}
	
	
	@GetMapping("/qna/create")
	public String create() {
		return "/qna/create";
	}
	
	@RequestMapping("/qna/list")
	public String list(HttpServletRequest request) {
		//검색
			String col = Utility.checkNull(request.getParameter("col"));
			String word = Utility.checkNull(request.getParameter("word"));

			if(col.equals("total"))
					word="";

			//페이지관련
			int nowPage =1; //현재 보고 있는 페이지
			if(request.getParameter("nowPage")!=null){//클라이언트가 번호를 눌렀을 경우
				nowPage = Integer.parseInt(request.getParameter("nowPage"));
			}

			int recordPerPage = 5;//한페이지당 보여줄 레코드 갯수

			//DB에서 가져올 순번------계산 방법
			int sno =((nowPage-1)*recordPerPage)+1;
			int eno = nowPage * recordPerPage;


				Map map = new HashMap();
				map.put("col",col);
				map.put("word",word);
				map.put("sno",sno);
				map.put("eno",eno);
				
				int total = qMapper.total(map);

				List<QnaDTO> list = qMapper.list(map);//list()가 null을 가져가면 error!
				//페이지를 눌를 때 마다 db를 가져옴.
				
				String url = "list";
				
				String paging = Utility.paging(total, nowPage, recordPerPage, col, word, url);
				
				request.setAttribute("list", list);
				request.setAttribute("paging",paging);
				request.setAttribute("col", col);
				request.setAttribute("word", word);
				request.setAttribute("nowPage", nowPage);
				//request.setAttribute("rinter", rinter); 
		
				return "/qna/list";
	}
}
