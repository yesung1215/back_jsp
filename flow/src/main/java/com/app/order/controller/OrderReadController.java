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

public class OrderReadController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		OrderDAO orderDAO = new OrderDAO();
		OrderDTO orderDTO = new OrderDTO();
		MemberDAO memberDAO = new MemberDAO();
		HttpSession session = req.getSession();
		String memberEmail = null ;
		Long orderId, memberId = null;

		memberEmail = (String)session.getAttribute("memberEmail");
		
		orderId = Long.parseLong(req.getParameter("id"));
		memberId = memberDAO.selectIdByMemberEmail(memberEmail);
		
		orderDTO.setId(orderId);
		orderDTO.setMemberId(memberId);
		orderDAO.select(orderDTO).ifPresent((order) -> {
			req.setAttribute("order", new JSONObject(order));
		});
		
		result.setPath("/order/read.jsp");
		return result;
	}

}
