package edu.kosmo.ysy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import edu.kosmo.ysy.service.BoardService;
import edu.kosmo.ysy.vo.BoardVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@AllArgsConstructor
@RestController
@RequestMapping("/rest/*")
public class RestBoardController {

	@Autowired
	private BoardService boardService;

	// 1. list(처음 진입 화면이므로 화면이 깜박여도 상관없으므로
	// @Controller방식으로 접근 - view(화면)를 리턴


	
	@GetMapping("/board/ajaxList")
	   public ModelAndView ajaxList(ModelAndView mav) {
	      mav.setViewName("rest/ajaxList");
	   
	      return mav;
	   }
	@GetMapping("/board/list")
	   public List<BoardVO> boardList() {
		
	     log.info("board/list");
	     List<BoardVO> list = boardService.getList();
	     
	     return list;
	   }

}
