package com.Labcom.demo.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.Labcom.demo.Model.Atlas_Orders;
import com.Labcom.demo.Repository.Atlas_Orders_Repository;

@RestController
public class Atlas_Orders_Controller {

	private Atlas_Orders_Repository repository;

	public Atlas_Orders_Controller(Atlas_Orders_Repository repository) {
		this.repository = repository;
	}

	@RequestMapping(value = "/list/atlasOrders",  method = RequestMethod.GET)
	public List<Atlas_Orders> getOrders() {
		return repository.findAll();
	}

	//	@PutMapping("/list/approved")
	//	public Atlas_Orders updateRecord(@RequestBody Atlas_Orders order) {
	//		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	//		order.setCreation_date(new Date());
	//		return repository.save(order);
	//	}

	@PutMapping("/list/{order_id}")
	public ResponseEntity<Atlas_Orders> getOrders(@PathVariable("order_id") Long order_id, @RequestBody Atlas_Orders orders){

		orders = repository.findById(order_id).get();
		orders.setAction_status("Approved");
		repository.save(orders);


		return ResponseEntity.ok(orders);
	}





}
