package com.application.trainingVer1.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.application.trainingVer1.board.dto.BoardDTO;
import com.application.trainingVer1.board.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/addBoard")
	public ModelAndView addBoard() {
		return new ModelAndView("board/addBoard");
	}
	
	@PostMapping("/addBoard")
	@ResponseBody
	public String addBoard(@ModelAttribute BoardDTO boardDTO) {
		
		// 단위 테스트
		//System.out.println(boardDTO);
		
		boardService.addBoard(boardDTO);
		
		String jsScript ="<script>";
				jsScript += "alert('Post Added');";
				jsScript += "location.href='addBoard';";
				jsScript += "</script>";
		
		return jsScript;
	}
	
	@GetMapping("/boardList")
	public ModelAndView boardList() {
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("board/boardList"); // view
		mv.addObject("boardList", boardService.getBoardList()); // model
		
		return mv;
	}
	
	@GetMapping("/boardDetail")
	public ModelAndView boardDetail(@RequestParam("boardId") long boardId) {
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("board/boardDetail");
		mv.addObject("boardDTO", boardService.getBoardDetail(boardId));
		
		return mv;
	}
	
	
	
	
	
	
	
	

}
