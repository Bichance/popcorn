package spring.model.qna;

import java.util.List;
import java.util.Map;

public interface QnaService {

	//CREATE
	boolean create(QnaDTO dto);
	
	//READ
	QnaDTO read(int qna_num);
	
	//UPDATE
	boolean update(QnaDTO dto);
	
	//DELETE
	void delete(int qna_num) throws Exception;
	
	//LIST
	List<QnaDTO> list(Map map);
	
	//REPLY
	//이 안에서 CREATE REPLY 메소드가 호출되는 방식 (with upAnsnum)
	void reply(QnaDTO dto) throws Exception;
	
	//REPLY 는 update, delete가 필요없다. 어차피 글 삭제하는것 뿐이니까.
	//근데 REPLY create는 단지 indent 해서 들여쓰기된 모습으로 보여주기  위해서 
	//쓰는 것 뿐임.
	
	//REPLY READ
	QnaDTO readReply(int qna_num);
	
	//PASSWORD CHECK
	boolean passCheck(Map map);
	
	//REF NUMBER CHECK
	//부모글이 있는지 체크하기 위함
	boolean refnumCheck(int qna_num);
	
	//UP VIEW COUNT
	void upViewcnt(int qna_num);
	
	//TOTAL
	int total(Map map);
	
}
