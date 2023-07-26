package com.reset.FarmerRegistration.api.resource;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.reset.FarmerRegistration.api.model.Farmer;
import com.reset.FarmerRegistration.api.repository.FarmerRepository;

@RestController
@RequestMapping("/farmer")
public class FarmerController {
	
	@Autowired
	private FarmerRepository farmerrepository;
	
	@Autowired
	private RestTemplate rtemplate;
	
	
	@GetMapping("/fruitsandvegiesforfarmers")
	public List<Object> getallfruitsnvegies(){
		String url="http://localhost:9091/getallfruitsorvegetables";
		Object[] objects = rtemplate.getForObject(url, Object[].class);
		return Arrays.asList(objects);
	}
	
	@PostMapping("/savefarmer")
	public String savefarmerinfo(@RequestBody Farmer farmer) {
		farmerrepository.save(farmer);
		return "Farmer added with ID: "+farmer.getFarmerid();
	}
	
	@GetMapping("/getallfarmers")
	public List<Farmer> getallfarmers(){
		return farmerrepository.findAll();
	}
	
	@GetMapping("/getfarmerbyid/{farmerid}")
	public Optional<Farmer> getfarmer(@PathVariable int farmerid){
		return farmerrepository.findById(farmerid);
	}
	
	@DeleteMapping("/deletefarmerbyid/{farmerid}")
	public String deletefarmer(@PathVariable int farmerid) {
		farmerrepository.deleteById(farmerid);
		return "Farmer with ID: "+farmerid+ " was deleted";
	}
}
