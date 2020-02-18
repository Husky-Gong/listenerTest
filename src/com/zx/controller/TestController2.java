package com.zx.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/test2.do")
public class TestController2 extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6768549685407138508L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//create session
		HttpSession session = req.getSession();
		// add session attribute
		session.setAttribute("me", "I'm alive");
		//change session attribute
		session.setAttribute("me","I have changed");
		
		// add one more session attribute
		session.setAttribute("age", 18);
		// change session attribute
		session.setAttribute("age", 20);
		
		// remove session attribute
		session.removeAttribute("me");
		
		System.out.println("what is session invalidate?");
		session.invalidate();
	}
	
}
