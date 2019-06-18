package spring.model.pay;

import java.util.List;
import java.util.Map;

public interface PayService {
	
	//CREATE
	boolean create(PayDTO dto);
	
	//READ
	PayDTO read(int pay_num);
	
	//UPDATE
	boolean update(PayDTO dto);
	
	//DELETE
	void delete(int pay_num) throws Exception;
	
	//LIST
	List<PayDTO> list(Map map);
	

}
