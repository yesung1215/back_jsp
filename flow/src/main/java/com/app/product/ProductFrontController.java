package com.app.product;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Result;
import com.app.member.controller.MemberJoinController;
import com.app.member.controller.MemberJoinOkController;
import com.app.member.controller.MemberLoginController;
import com.app.member.controller.MemberLoginOkController;
import com.app.product.controller.ProductAddController;
import com.app.product.controller.ProductAddOkController;
import com.app.product.controller.ProductDeleteOkController;
import com.app.product.controller.ProductEditController;
import com.app.product.controller.ProductEditOkController;
import com.app.product.controller.ProductListController;
import com.app.product.controller.ProductReadController;

public class ProductFrontController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		String target =  req.getRequestURI().replace(req.getContextPath() + "/", "").split("\\.")[0];
		Result result = null;
		
		
		if(target.equals("add")) {
			result = new ProductAddController().execute(req, resp);
		}else if(target.equals("add-ok")) {
			result = new ProductAddOkController().execute(req, resp);
		}else if(target.equals("list")) {
			result = new ProductListController().execute(req, resp);
		}else if(target.equals("edit")) {
			result = new ProductEditController().execute(req, resp);
		}else if(target.equals("edit-ok")) {
			result = new ProductEditOkController().execute(req, resp);
		}else if(target.equals("read")) { 
			result = new ProductReadController().execute(req, resp);
		}else if(target.equals("delete-ok")) {
			result = new ProductDeleteOkController().execute(req, resp);
		}else {
		}
		
		if(result != null) {
			if(result.isRedirect()) {
				resp.sendRedirect(result.getPath());
			}else {
				req.getRequestDispatcher(result.getPath()).forward(req, resp);
			}
		}
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
