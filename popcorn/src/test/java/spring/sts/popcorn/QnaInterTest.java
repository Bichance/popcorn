package spring.sts.popcorn;


import static org.junit.Assert.assertTrue;

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

import spring.model.qna.QnaDTO;
import spring.model.qna.QnaInter;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
		"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class QnaInterTest {
	
	private static final Logger logger = LoggerFactory.getLogger(QnaInterTest.class);
	
	@Autowired
	private QnaInter inter;
	

	@Test
	//@Ignore
	public void testMapper() {
	logger.info("mapper:"+inter.getClass().getName());	 
	}

	@Test
	@Ignore
	public void testCreate() {
		QnaDTO dto = new QnaDTO();
		
		//dto.setQna_num(6);
		dto.setQna_title("테스트");
		//dto.setQna_date("sysdate");
		dto.setQna_content("내용");
		dto.setQna_type("테슷");
		dto.setQna_pw("1234");
		//dto.setQna_grpno(6);
		dto.setId("user1");
		
		assertTrue(inter.create(dto)>0);
	}

	//완료
	@Test
	@Ignore
	public void testRead() {
		QnaDTO dto = inter.read(1);
		logger.info("dto: "+dto);
	}

	//완료
	@Test
	@Ignore
	public void testUpdate() {
		QnaDTO dto = new QnaDTO();
		dto.setQna_num(2);
		dto.setQna_title("변경");
		dto.setQna_content("e댓글 2로 변경");
		dto.setQna_type("변경");
		
		assertTrue(inter.update(dto)>0);
	}

	//완료
	@Test
	@Ignore
	public void testDelete() {
		int Qna_num = 1;
		assertTrue(inter.delete(Qna_num)>0);
	}

	//완료
	@Test
	@Ignore
	public void testList() {
		
		Map map = new HashMap();
		
		map.put("bbsno", 2);
		map.put("sno", 1);
		map.put("eno", 5);
		
		List<QnaDTO> list = inter.list(map);
		logger.info("list: "+list);
	}

	//완료???
	@Test
	@Ignore
	public void testTotal() {
		
		Map map = new HashMap();
		
		map.put("Qna_num", 3);
		//글 번호
		int cnt = inter.total(map);
		logger.info("total: "+cnt);
	}

//	@Test
//	@Ignore
//	public void testRcount() {
//		int bbsno = 2; //글 번호
//		int cnt = inter.rcount(bbsno);
//		logger.info("rcount: "+cnt);
//	}

}
