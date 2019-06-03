package spring.mapper.popcorn;

import java.util.List;
import java.util.Map;

import spring.model.qna.QnaDTO;

public interface QnaMapper {
	
	int create(QnaDTO dto);
	QnaDTO read(int bbsno);
	int update(QnaDTO dto);
	int delete(int qna_num);
	List<QnaDTO> list(Map map);
	int total(Map map);
	QnaDTO readReply(int qna_num);
	void upAnsnum(Map map);
	int createReply(QnaDTO dto);
	//int passCheck(Map map);
	//int refnumCheck(int bbsno);
	//void upViewcnt(int bbsno);
	
	

}
