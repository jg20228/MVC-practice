package com.cos.blog.action.board;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cos.blog.action.Action;
import com.cos.blog.model.Board;
import com.cos.blog.repository.BoardRepository;
import com.cos.blog.util.HtmlParser;

public class BoardHomeAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int page = Integer.parseInt(request.getParameter("page"));

		BoardRepository boardRepository = BoardRepository.getInstance();
		//List<Board> boards = boardRepository.findAll();
		
		List<Board> boards = boardRepository.findAll(page);
		
		for (Board board : boards) {
			String preview = HtmlParser.getContentPreview(board.getContent());
			board.setContent(preview);
		}
		
		request.setAttribute("boards", boards);
		
		int count = boardRepository.count();
		int lastPage = (count-1)/3;
		
		//현재 페이지 스크롤
		double currentPercent = (double)(page)/(lastPage)*100;
		
		request.setAttribute("lastPage", lastPage);
		request.setAttribute("currentPercent", currentPercent);
		
		HttpSession session = request.getSession();
		session.setAttribute("backPage", page);
		session.setAttribute("backKeyword", null);
		
		RequestDispatcher dis = request.getRequestDispatcher("home.jsp");
		dis.forward(request, response);
	}
}
