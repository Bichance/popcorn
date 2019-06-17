package spring.sts.popcorn;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import spring.mapper.popcorn.PayMapper;
import spring.model.pay.PayDTO;


@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
		"file:src/main/webapp/WEB-INF/spring/root-context.xml"})

public class PayInterTest {

	private static final Logger logger = LoggerFactory.getLogger(PayInterTest.class);
	
	@Autowired
	private PayMapper payMapper;
	
	//COMPLETE
	//CREATE
	@Test
	@Ignore
	public void testCreate() {
		
		PayDTO dto = new PayDTO();
		
		dto.setPay_num(2);
		dto.setId("user1");
		dto.setPay_sum(69700);
		dto.setPay_way("CreditCard");
		dto.setPay_date("sysdate");
		
		assertTrue(payMapper.create(dto)>0);
		
	}
	
	//COMPLETE
	//READ
	@Test
	@Ignore
	public void testRead() {
		PayDTO dto = payMapper.read(1);
		logger.info("dto: "+dto);
	}
	
	//COMPLETE
	//UPDATE
	@Test
	@Ignore
	public void testUpdate() {
		PayDTO dto = new PayDTO();
		
		dto.setPay_num(1);
		dto.setPay_way("카카오페이");
		
		assertTrue(payMapper.update(dto)>0);
		
	}
	
	//COMPLETE
	//DELETE
	@Test
	@Ignore
	public void testDelete() {
		int pay_num = 10;
		assertTrue(payMapper.delete(pay_num)>0);
	}
	
	//COMPLETE
	//LIST
	@Test
	@Ignore
	public void testList() {
		Map map = new HashMap();
		
		List<PayDTO> list = payMapper.list(map);
		System.out.println(list);
	}

}
