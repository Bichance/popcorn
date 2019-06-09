package spring.model.qna;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.mapper.popcorn.QnaMapper;
import spring.mapper.popcorn.QreplyMapper;

// import spring.model.reply.ReplyInter;

@Service
public class QnaServiceImpl implements QnaService {
	
	//@Autowired
	//private ReplyInter rinter;
	
	@Autowired
	private QnaMapper qMapper;
	
	@Autowired
	private QreplyMapper qrMapper;
	
//	@Autowired
//	private QnaService qService;
	
	
	//C.R.U.D

	//CREATE
	
	@Override
	public boolean create(QnaDTO dto) {
		boolean flag = false;
		flag = qMapper.create(dto)>0;
				
		return flag;
	}
	
	//READ
	
	@Override
	public QnaDTO read(int qna_num) {
		QnaDTO dto = qMapper.read(qna_num);
		qMapper.upViewcnt(qna_num);
		dto.setQna_content(dto.getQna_content().replaceAll("\r\n", "<br>"));
		
		//model.addAttribute("dto", dto);
		return dto;
	}

	//UPDATE
	
	@Override
	public boolean update(QnaDTO dto) {
		boolean flag = false;
		
		flag = qMapper.update(dto)>0;
		
		return flag;
	}
	
	//DELETE 트렌젝션
	
	@Override
	public void delete(int qna_num) throws Exception {
		
		//자식 레코드 삭제(댓글 삭제)
		//부모 레코드 삭제(글 삭제)
		qrMapper.bdelete(qna_num);
		qMapper.delete(qna_num);
		
	}
	
	//목록, 페이징 관련
	
	//LIST

	@Override
	public List<QnaDTO> list(Map map) {
		// TODO Auto-generated method stub
		
		return qMapper.list(map);
	}
	
	//TOTAL
	@Override
	public int total(Map map) {
		
		int total = qMapper.total(map);
		
		return total;
	}
	
	//답변글 관련
	
	//REPLY 트렌젝션
	
	@Override
	public void reply(QnaDTO dto) throws Exception {
		
		Map map = new HashMap();
		map.put("qna_grpno", dto.getQna_grpno());
		map.put("qna_ansnum", dto.getQna_ansnum());
		
		qMapper.upAnsnum(map);
		System.out.println("===============================");
		System.out.println("===============================");
System.out.println(dto);
		System.out.println("===============================");
		System.out.println("===============================");
		System.out.println("===============================");
		
		qMapper.createReply(dto);
	
	}
	
	//REPLY READ
	@Override
	public QnaDTO readReply(int qna_num) {
		QnaDTO dto = qMapper.read(qna_num);
		qMapper.upViewcnt(qna_num);
		dto.setQna_content(dto.getQna_content().replaceAll("\r\n", "<br>"));
		
		//model.addAttribute("dto", dto);
		return dto;
	}
	
	//PASSWORD CHECK

	@Override
	public boolean passCheck(Map map) {
		boolean pflag = false;
		
		if(qMapper.passCheck(map)>0)
			pflag = true;
		
		return pflag;
	}
	
	//답변 삭제 할 때 부모글 체크 할 용도
	//REF NUMBER CHECK

	@Override
	public boolean refnumCheck(int qna_num) {
		boolean flag = false;
		if(qMapper.refnumCheck(qna_num)>0)
			flag = true;
		
		return flag;
	}
	
	//UP VIEW COUNT

	@Override
	public void upViewcnt(int qna_num) {
		qMapper.upViewcnt(qna_num);
	}

	//UP ANSWER NUMBER
	
	@Override
	public void upAnsnum(Map map) {
		qMapper.upAnsnum(map);
	}
	

	
	


	
}
