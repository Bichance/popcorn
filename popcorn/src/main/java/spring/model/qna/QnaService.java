package spring.model.qna;

public interface QnaService {

	void delete(int bbsno) throws Exception; 
	void reply(QnaDTO dto) throws Exception;
}
