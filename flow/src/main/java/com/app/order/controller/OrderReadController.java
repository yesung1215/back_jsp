package com.app.order.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;

import com.app.Action;
import com.app.Result;
import com.app.dao.MemberDAO;
import com.app.dao.OrderDAO;
import com.app.dto.OrderDTO;
import com.app.exception.OrderNotFoundException;

public class OrderReadController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		Long orderId, memberId = null;
		MemberDAO memberDAO = new MemberDAO();
		OrderDAO orderDAO = new OrderDAO();
		OrderDTO orderDTO = new OrderDTO();
		HttpSession session = req.getSession();
		String memberEmail = null;
		
		memberEmail = (String)session.getAttribute("memberEmail");
		orderId = Long.parseLong(req.getParameter("id"));
		memberId = memberDAO.selectIdByMemberEmail(memberEmail);
		
			order = orderDAO.select(id).orElseThrow(OrderNotFoundException::new);
			req.setAttribute("orderJSON", new JSONObject(order));
		
		
		result.setPath("/order/read.jsp");
		return result;
	}

}
