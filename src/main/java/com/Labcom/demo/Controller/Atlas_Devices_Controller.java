package com.Labcom.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Labcom.demo.Model.Atlas_Devices;
import com.Labcom.demo.Repository.Atlas_Devices_Repository;

@RestController
public class Atlas_Devices_Controller {
	
private Atlas_Devices_Repository repository;
	
	public Atlas_Devices_Controller(Atlas_Devices_Repository repository) {
		this.repository = repository;
	}
	
	@RequestMapping(value = "/list/atlasDevive",  method = RequestMethod.GET)
	public List<Atlas_Devices> getDevice() {
		return repository.findAll();
	}

}
