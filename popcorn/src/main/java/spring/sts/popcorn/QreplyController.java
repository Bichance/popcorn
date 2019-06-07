package spring.sts.popcorn;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import spring.mapper.popcorn.QreplyMapper;
import spring.model.qreply.QreplyDTO;
import spring.model.qreply.QreplyService;
//import spring.model.reply.ReplyDTO;
//import spring.model.reply.ReplyInter;
import spring.utility.popcorn.Utility;

@RestController
public class QreplyController {

	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private QreplyMapper qrMapper;
	@Autowired
	private QreplyService qrService;
	
	//REPLY CREATE
	
	@PostMapping("/qna/reply/create")
	public ResponseEntity<String> create(@RequestBody QreplyDTO vo) {

		log.info("QreplyDTO1: " + vo.getQreply_content());
		log.info("QreplyDTO1: " + vo.getId());
		log.info("QreplyDTO1: " + vo.getQna_num());

		vo.setQreply_content(vo.getQreply_content().replaceAll("/n/r", "<br>"));

		int flag = qrService.create(vo);

		log.info("QReply INSERT flag: " + flag);

		return flag == 1 ? new ResponseEntity<>("success", HttpStatus.OK)
				: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	//REPLY LIST
	
		@GetMapping("/qna/reply/list/{qna_num}/{sno}/{eno}")
		public ResponseEntity<List<QreplyDTO>> getList(@PathVariable("qna_num") int qna_num, @PathVariable("sno") int sno,
				@PathVariable("eno") int eno) {

			Map map = new HashMap();
			map.put("sno", sno);
			map.put("eno", eno);
			map.put("qna_num", qna_num);

			return new ResponseEntity<List<QreplyDTO>>(qrMapper.list(map), HttpStatus.OK);
		}

	// REPLY UPATE(MODIFY)
	
	@PutMapping("/qna/reply/{qreply_num}")
	public ResponseEntity<String> modify(
	@RequestBody QreplyDTO vo, @PathVariable("qreply_num") int qreply_num) {
	 
	log.info("qreply_num: " + qreply_num);
	log.info("modify: " + vo);
	 
	return qrMapper.update(vo) == 1
	? new ResponseEntity<>("success", HttpStatus.OK)
	: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	 
	}
	
	
	//REPLY DELETE(REMOVE)
	
	@DeleteMapping("/qna/reply/{qreply_num}")
	public ResponseEntity<String> remove(@PathVariable("qreply_num") int qreply_num) {
	 
	log.info("remove: " + qreply_num);
	 
	return qrMapper.delete(qreply_num) == 1
	? new ResponseEntity<>("success", HttpStatus.OK)
	: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	 
	}	
	
	@GetMapping("/qna/reply/{qreply_num}")
	public ResponseEntity<QreplyDTO> get(@PathVariable("qreply_num") int qreply_num) {
	 
	log.info("get: " + qreply_num);
	 
	return new ResponseEntity<>(qrMapper.read(qreply_num), HttpStatus.OK);
	}
	
	@GetMapping("/qna/reply/page") public ResponseEntity<String> getPage(
	@RequestParam("nPage") int nPage,
	@RequestParam("nowPage") int nowPage,
	@RequestParam("qna_num") int qna_num,
	@RequestParam("col") String col,
	@RequestParam("word") String word
	) {
	 
	 
	 int total = qrMapper.total(qna_num);
	 String url = "read";
	 
	 int recordPerPage = 3; // 한페이지당 출력할 레코드 갯수
	 
	 String fk = "&qna_num=";
	 
	 String paging = Utility.rpaging(total, nowPage, recordPerPage, col, word, url, nPage, fk, qna_num);

	return new ResponseEntity<>(paging, HttpStatus.OK);
	 
	}

}
