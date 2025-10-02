package com.app.product.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;
import com.app.dao.ProductDAO;
import com.app.vo.ProductVO;

public class ProductWriteOkController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		ProductVO productVO = new ProductVO(); 
		ProductDAO productDAO = new ProductDAO();
		String productName = null, productSeller = null;
		Integer productPrice = null;
		
		productName = req.getParameter("ncsProductName");
		productPrice = Integer.parseInt(req.getParameter("ncsProductPrice"));
		productSeller = req.getParameter("ncsProductSeller");
		
		productVO.setNcsProductName(productName);
		productVO.setNcsProductPrice(productPrice);
		productVO.setNcsProductSeller(productSeller);
		
		productDAO.insert(productVO);
		
		result.setPath("/ncs/list.product");
		result.setRedirect(true);
		
		return result;
	}

}
