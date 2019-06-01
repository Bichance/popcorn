package spring.model.qna;

public interface QnaService {

	void delete(int qna_num) throws Exception; 
	void reply(QnaDTO dto) throws Exception;
}
