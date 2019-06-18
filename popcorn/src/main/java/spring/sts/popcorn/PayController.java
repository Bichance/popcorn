//package spring.sts.popcorn;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//import spring.model.pay.PayDTO;
//import spring.model.pay.PayService;
//import spring.model.payitem.PayItemService;
//import spring.model.qna.QnaDTO;
//
//@Controller
//public class PayController {
//	
//	@Autowired
//	private PayService pService;
//	@Autowired
//	private PayItemService piService;
//	
//	//CREATE
//	
//	@GetMapping("/pay/create")
//	public String create() {
//		return "/pay/create";
//	}
//	@PostMapping("/qna/create")
//	public String create(PayDTO dto, Model model, RedirectAttributes redi) {
//		boolean flag = pService.create(dto);
//		
//		if(flag) {
//			model.addAttribute("dto", dto);
//			redi.addFlashAttribute("msg","주문 생성완료");
//			return "redirect:/payitem/create";
//		}else {
//			model.addAttribute("flag", flag);
//			return "error/error";
//		}
//	}
//	
//
//	//READ
//
//	@GetMapping("/pay/read")
//	public String read(int pay_num, Model model, int nowPage, String col, String word, HttpServletRequest request) {
//		
//		PayDTO dto = pService.read(pay_num);
//		
//		model.addAttribute("dto", dto);
//		
////		 /* 댓글 관련  시작 */
////		int nPage= 1; //시작 페이지 번호는 1부터 
////		 
////		if (request.getParameter("nPage") != null) { 
////		nPage= Integer.parseInt(request.getParameter("nPage"));  
////		}
////		int recordPerPage = 3; // 한페이지당 출력할 레코드 갯수
////		 
////		int sno = ((nPage-1) * recordPerPage) + 1; // 
////		int eno = nPage * recordPerPage;
////		 
////		Map map = new HashMap();
////		map.put("sno", sno);
////		map.put("eno", eno);
////		map.put("qna_num", qna_num);
////		map.put("nPage", nPage);
////		map.put("nowPage", nowPage);
////		map.put("col", col);
////		map.put("word", word);
////		 
////		model.addAllAttributes(map);
////		 
////		
////		
////		HttpSession session = request.getSession();
////		session.setAttribute("id", "user1");
////		/* 댓글 관련 끝 */  
//		return "/pay/read";
//	}
//	
//
//	//UPDATE
//
//	@GetMapping("/pay/update")
//	public String update(int pay_num, Model model) {
//		model.addAttribute("dto", pService.read(pay_num));
//		return "/pay/update";
//	}
//	@PostMapping("/pay/update")
//	public String update(PayDTO dto, Model model, RedirectAttributes redi) {
//		//패스워드 검증
////		Map map = new HashMap();
////		map.put("qna_num", dto.getQna_num());
////		map.put("qna_pw", dto.getQna_pw());
////		
////		boolean pflag = qService.passCheck(map);
////		
//		//PASSWOR 검증 끝 -> 업데이트 처리 시작
//		boolean flag = false;
//		 
//		flag = pService.update(dto);
//		
//		if(flag) {
//			redi.addFlashAttribute("msg","결제수단 수정완료");
//			return "redirect:/pay/list";
//		}else {
//			model.addAttribute("flag",flag);
//			return "error/error";
//		}
//	}
//	
//	//DELETE
//
//		@GetMapping("/pay/delete")
//		public String delete(int pay_num, Model model) {
//			//model.addAttribute("flag", qService.refnumCheck(qna_num));
//			return "/qna/delete";
//		}
//		@PostMapping("/qna/delete")
//		public String delete(@RequestParam Map<String,String> map, Model model, RedirectAttributes redi, int qna_num) {
//			
//			boolean flag = false;
//			//PASSWORD 검증, pflag 는 비번 검증을 위한 논리형 타입
//			//boolean pflag = qService.passCheck(map);
//			
////				try {
////					if(pflag){
////						qService.delete(qna_num);
////						redi.addFlashAttribute("msg"," 게시물을 삭제했습니다.");
////						return "redirect:/qna/list";
////					}else{
////						model.addAttribute("pflag",pflag);
////						return "error/passwdError";
////					}
////				} catch (Exception e) {
////					model.addAttribute("flag",flag);
////					return "error/error";
////				} //update를 실행
//			}	
//
//}
