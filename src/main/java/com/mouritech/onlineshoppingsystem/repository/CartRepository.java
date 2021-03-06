package com.mouritech.onlineshoppingsystem.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.onlineshoppingsystem.entity.Cart;
import com.mouritech.onlineshoppingsystem.exception.CustomerNotFoundException;


@Repository
public interface CartRepository extends JpaRepository<Cart, Long>{

	

	Optional<Cart> findByCartId(String cartId);



	Optional<Cart> findByCustomer_CustId(String custId)throws CustomerNotFoundException;
	
	
//	
//	List<Cart> findByProduct(String productId);
}
