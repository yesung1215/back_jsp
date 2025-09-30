package com.app.product.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import com.app.Action;
import com.app.Result;
import com.app.dao.ProductDAO;
import com.app.exception.ProductNotFoundException;
import com.app.vo.ProductVO;

public class ProductReadController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		ProductDAO productDAO = new ProductDAO();
		Long id = Long.parseLong(req.getParameter("id"));
		ProductVO product = null;
		
		try {
			product = productDAO.select(id).orElseThrow(ProductNotFoundException::new);
			req.setAttribute("product", product);
			req.setAttribute("productJSON", new JSONObject(product));
		} catch (ProductNotFoundException e) {
			req.setAttribute("message", "상품을 찾을 수 없습니다");
			result.setPath("/error.jsp");
		}
		
		result.setPath("/read.jsp");
		return result;
	}

}
