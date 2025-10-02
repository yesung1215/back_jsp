package com.app.product;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import com.app.Action;
import com.app.Result;
import com.app.dao.ProductDAO;
import com.app.vo.ProductVO;

public class ProductListController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		ProductDAO productDAO = new ProductDAO();
		JSONArray products = new JSONArray();
		
		List<ProductVO> productList = productDAO.selectAll();
		req.setAttribute("products", productList);
		
		productDAO.selectAll().stream().map(JSONObject::new).forEach(products::put);
		req.setAttribute("productJSON", products);
		
		result.setPath("/list.jsp");
		return result;
	}

}
