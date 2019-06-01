package spring.model.qna;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// import spring.model.reply.ReplyInter;

@Service
public class QnaServiceImpl implements QnaService {
	
	//@Autowired
	//private ReplyInter rinter;
	
	@Autowired
	private QnaInter qinter;
	
	public void delete(int qna_num) throws Exception {
		
		//자식 레코드 삭제(댓글 삭제)
		//부모 레코드 삭제(글 삭제)
		//rinter.bdelete(bbsno);
		qinter.delete(qna_num);
		
	}
	
	public void reply(QnaDTO dto) throws Exception {
		
		Map map = new HashMap();
		map.put("qna_grpno", dto.getQna_grpno());
		map.put("qna_ansnum", dto.getQna_ansnum());
		
		qinter.upAnsnum(map);
		qinter.createReply(dto);
	
	}
}
