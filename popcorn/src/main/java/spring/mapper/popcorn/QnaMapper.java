package spring.mapper.popcorn;

import java.util.List;
import java.util.Map;

import spring.model.qna.QnaDTO;

public interface QnaMapper {
	
	//CREATE
	int create(QnaDTO dto);
	
	//READ
	QnaDTO read(int qna_num);
	
	//UPDATE
	int update(QnaDTO dto);
	
	//DELETE
	int delete(int qna_num);
	
	//LIST
	List<QnaDTO> list(Map map);
	
	//TOTAL
	int total(Map map);
	
	//REPLY CREATE
	int createReply(QnaDTO dto);
	
	//REPLY READ
	QnaDTO readReply(int qna_num);
	
	//REPLY UP ANSWER NUMBER
	void upAnsnum(Map map);
	
	//UP VIEW COUNT (조회수 증가)
	void upViewcnt(int qna_num);
	
	//PASSWORD CHECK
	int passCheck(Map map);
	
	//REF NUMBER CHECK 부모글인지 확인 할 때
	int refnumCheck(int qna_num);


}
