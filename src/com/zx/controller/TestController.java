package com.zx.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test.do")
public class TestController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2951706533547550413L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// add new attribute
		req.setAttribute("name", "韩梅梅");
		// set attribute
		req.setAttribute("sex", "1");// set 1 as sex value
		//get value
		System.out.println("sex value is: "+req.getAttribute("sex"));// "male"
		// delete attribute
		req.removeAttribute("sex");
	}
	
}
