package com.app.order.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONArray;
import org.json.JSONObject;

import com.app.Action;
import com.app.Result;
import com.app.dao.MemberDAO;
import com.app.dao.OrderDAO;

public class OrderListController implements Action {

   @Override
   public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
      Result result = new Result();
      OrderDAO orderDAO = new OrderDAO();
      MemberDAO memberDAO = new MemberDAO();
      JSONArray orderList = new JSONArray();
      HttpSession session = req.getSession();
      
      req.setAttribute("orderList", orderList);
      
      Long id = memberDAO.selectIdByMemberEmail((String)session.getAttribute("memberEmail"));
      
      orderDAO.selectAll(id).stream().map(JSONObject::new).forEach(orderList::put);
      result.setPath("/order/list.jsp");
      return result;
   }
}
