package spring.mapper.popcorn;

import java.util.List;
import java.util.Map;

import spring.model.pay.PayDTO;

public interface PayMapper {
	
	//CREATE
	int create(PayDTO dto);
	
	//READ
	PayDTO read(int pay_num);
	
	//UPDATE
	int update(PayDTO dto);
	
	//DELETE
	int delete(int pay_num);
	
	//LIST
	List<PayDTO> list(Map map);
	
}
