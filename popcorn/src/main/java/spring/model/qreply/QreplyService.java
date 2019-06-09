package spring.model.qreply;

import java.util.List;
import java.util.Map;

import spring.model.qreply.QreplyDTO;

public interface QreplyService {
	
	//CREATE
	public int create(QreplyDTO dto);

	//READ
	public QreplyDTO read(int qreply_num);
	
	//UPDATE
	public int update(QreplyDTO dto);
	
	//DELETE
	public int delete(int qreply_num);
	
	//LIST
	public List<QreplyDTO> list(Map map);
	
	//TOTAL
	public int total(int qna_num);
	
	//REPLY COUNT
	public int rcount(int qna_num);
	
	
	

}
