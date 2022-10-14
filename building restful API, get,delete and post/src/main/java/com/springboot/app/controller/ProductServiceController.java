package com.springboot.app.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.productsy.Products;

/**
 *  ProductServiceController - it implements the GETAPI , POST API, DELETE API
 * put is use to set value before you can get api
 * We use hashmap to get the products 
 * post API: 
 *
 */
@RestController
public class ProductServiceController {
	private static Map<String, Products> productList = new HashMap<>();
	
	static {
		Products honey = new Products();
		honey.setId("1");
		honey.setName("Honey");
		productList.put(honey.getid(), honey);
		
		Products almond = new Products();
		almond.setId("2");
		almond.setName("Almond");
		productList.put(almond.getid(), almond);
		
		Products butter = new Products();
		butter.setId("3");
		butter.setName("Butter");
		productList.put(butter.getid(), butter);
	}
	
	//using the getAPI
	
	@RequestMapping(value="/GettingOurProductUsingGetAPI")
	public ResponseEntity<Object> getProducts(){
		return (new ResponseEntity<>(productList.values(), HttpStatus.OK));
	}
	
	//using the postAPI: using the same mapping or getAPI URL will allow you to update existing ones and create a new ones
	@RequestMapping(value="/GettingOurProductUsingGetAPI/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Object> updateProduct(@PathVariable("id") String id, @RequestBody Products products){
		productList.remove(id);
		products.setId(id);
		productList.put(id, products);
		return (new ResponseEntity<>("Product is updated successfully", HttpStatus.OK));
	}
	
	//Delete API //using the postAPI: using the same mapping or getAPI will allow us to delete existing resources
	@RequestMapping(value="/GettingOurProductUsingGetAPI/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> deleteProduct(@PathVariable("id") String id, @RequestBody Products products){
		productList.remove(id);
		return new ResponseEntity<>("Product/ resource have been deleted successfully", HttpStatus.OK);
	}
	

}
