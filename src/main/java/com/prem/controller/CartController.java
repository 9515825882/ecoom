   package com.prem.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.prem.Daoimpl.CartDaoImp;
import com.prem.Daoimpl.ProductDaoImpl;
import com.prem.model.Cart;
import com.prem.model.Products;

@Controller
public class CartController {
	

	@Autowired
	ProductDaoImpl productDaoImpl;
	
@Autowired
CartDaoImp cartDaoimp;
	@RequestMapping("/addtocart")
	public String SaveCartData(HttpServletRequest request)
	   {
		int x=Integer.parseInt(request.getParameter("p"));
		int y=Integer.parseInt(request.getParameter("q"));
        System.out.println(x);
        System.out.println(y);
        
        
		
			
		
		   Products product=productDaoImpl.getProduct(x);
	       
		   Cart cart=cartDaoimp.setCart(product,y);
		   
		 cartDaoimp.savecartdetails(cart);
		 
		 
		   return null;
	   }
	
		
	}
	


