package com.cos.blog.util;

import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;

public class Script {
	
	public static void outText(String msg, HttpServletResponse response) {
		try {
			response.setCharacterEncoding("utf-8");
			response.setContentType("text/plain; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.print(msg);
		} catch (Exception e) {
		}
	}
	
	public static void outJson(String msg, HttpServletResponse response) {
		try {
			response.setCharacterEncoding("utf-8");
			response.setContentType("application/json; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.print(msg);
		} catch (Exception e) {
		}
	}

	public static void getMessage(String msg, HttpServletResponse response) {
		try {
			response.setCharacterEncoding("utf-8");
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();

			out.println("<h1>" + msg + "</h1>");

		} catch (Exception e) {
		}
	}

	public static void back(String msg, HttpServletResponse response) {
		try {
			response.setCharacterEncoding("utf-8");
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('" + msg + "');");
			out.println("history.back();");
			out.println("</script>");
		} catch (Exception e) {
		}
	}

	public static void href(String msg, String uri, HttpServletResponse response) {
		try {
			response.setCharacterEncoding("utf-8");
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('" + msg + "');");
			out.println("location.href='" + uri + "';");
			out.println("</script>");
		} catch (Exception e) {
		}
	}

	public static void href(String uri, HttpServletResponse response) {
		try {
			response.setCharacterEncoding("utf-8");
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("location.href='" + uri + "';");
			out.println("</script>");
		} catch (Exception e) {
		}
	}

}