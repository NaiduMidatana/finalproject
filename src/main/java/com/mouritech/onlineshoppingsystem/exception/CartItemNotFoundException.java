package com.mouritech.onlineshoppingsystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CartItemNotFoundException extends RuntimeException {
	
	
		private static final long serialVersionUID = 3012878889525785180L;

		/**
		 * 
		 */
		

		public CartItemNotFoundException(String message) {
			super(message);
		}
	}


