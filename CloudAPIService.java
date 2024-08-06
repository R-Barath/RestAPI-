package com.thinkconstructive.restinti.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkconstructive.restinti.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")

public class CloudAPIService {

	
	CloudVendor  cloudvendor;
	
	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendor (String vendorId) {
	
		
		return cloudvendor;
//				("c1","vendor1", "Address",
//				"Phonenumber");
		
	}
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudvendor) {
		this.cloudvendor=cloudvendor;
		return "Cloud Vendor  created successfully";
		
	}
	@PutMapping
	public String updatecreateCloudVendorDetails(@RequestBody CloudVendor cloudvendor) {
		this.cloudvendor=cloudvendor;
		return "Cloud Vendor  updated successfully";
		
	}
	@DeleteMapping
	public String deletecreateCloudVendorDetails(String vendorId) {
	this.cloudvendor=null;
		return "Cloud Vendor  deleted successfully";
		
	}
	
}
//from 17
