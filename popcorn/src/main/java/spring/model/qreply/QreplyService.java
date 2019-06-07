package spring.model.qreply;

import java.util.List;
import java.util.Map;

import spring.model.qreply.QreplyDTO;

public interface QreplyService {
	
	int create(QreplyDTO dto);

	int rcount(int qna_num);
	


}
