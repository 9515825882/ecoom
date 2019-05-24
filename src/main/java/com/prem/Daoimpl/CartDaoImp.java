package com.prem.Daoimpl;

import javax.persistence.Transient;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.prem.model.Cart;
import com.prem.model.Products;
@Component
public class CartDaoImp {
@Autowired
SessionFactory factory;

@Autowired
ProductDaoImpl productDaoImpl;

public void savecartdetails(Cart cart)
{
	Session session=factory.openSession();
	
    session.save(cart);
    Transaction transaction=session.beginTransaction();
    transaction.commit();
    session.close();
	
	
	}
public Cart setCart(Products product,int q)
{
	Cart cart=new Cart();
	   
	   
	   cart.setCartdId((int)(Math.random()*10000));
	   cart.setProductId(product.getProductID());
	   cart.setProductName(product.getProductName());
	   
	   cart.setProductprice(product.getProductPrice());
	   cart.setProductSuppllier(product.getProductSupplier());
	   cart.setProductQuantity(q);
	   cart.setTotalprice(cart.getProductprice()*q);
	  
		
	   return cart;
	   
	}

}
