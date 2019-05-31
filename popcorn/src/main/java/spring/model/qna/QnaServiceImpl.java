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
	private QnaInter binter;
	
	public void delete(int bbsno) throws Exception {
		
		//자식 레코드 삭제(댓글 삭제)
		//부모 레코드 삭제(글 삭제)
		//rinter.bdelete(bbsno);
		binter.delete(bbsno);
		
	}
	
	public void reply(QnaDTO dto) throws Exception {
		
		Map map = new HashMap();
		map.put("grpno", dto.getGrpno());
		map.put("ansnum", dto.getAnsnum());
		
		binter.upAnsnum(map);
		binter.createReply(dto);
	
	}
}
