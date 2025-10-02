package com.app.product.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import com.app.Action;
import com.app.Result;
import com.app.dao.ProductDAO;

public class ProductEditController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		Long id = null;
		id = Long.parseLong(req.getParameter("id"));
		ProductDAO productDAO = new ProductDAO();
		
		productDAO.select(id).ifPresent((product) -> {
			req.setAttribute("product", product);
			req.setAttribute("productJSON", new JSONObject(product));
		});
		
		result.setPath("/product/edit.jsp");
		return result;
	}

}
