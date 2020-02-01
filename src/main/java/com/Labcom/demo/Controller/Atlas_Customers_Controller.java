package com.Labcom.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Labcom.demo.Model.Atlas_Customers;
import com.Labcom.demo.Repository.Atlas_Customers_Repository;

@RestController
public class Atlas_Customers_Controller {
	
	private Atlas_Customers_Repository repository;

	public Atlas_Customers_Controller(Atlas_Customers_Repository repository) {
		this.repository = repository;
	}
	
	@RequestMapping(value = "/list/atlasCustomers",  method = RequestMethod.GET)
	public List<Atlas_Customers> getCustomers() {
		return repository.findAll();
	}
	
}
