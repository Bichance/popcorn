package spring.mapper.popcorn;

import java.util.List;
import java.util.Map;

import spring.model.qreply.QreplyDTO;

public interface QreplyMapper {
	
		int create(QreplyDTO dto);
		QreplyDTO read(int qreply_num);
		int update(QreplyDTO dto);
		int delete(int qreply_num);
		List<QreplyDTO> list(Map map);
		int total(int qna_num);
		int rcount(int qna_num);
		int bdelete(int qna_num);

}
