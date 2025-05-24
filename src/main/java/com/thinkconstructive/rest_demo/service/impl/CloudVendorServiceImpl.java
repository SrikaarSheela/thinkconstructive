package com.thinkconstructive.rest_demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.thinkconstructive.rest_demo.model.CloudVendor;
import com.thinkconstructive.rest_demo.repository.CloudVendorRepository;
import com.thinkconstructive.rest_demo.service.CloudVendorService;

@Service
public class CloudVendorServiceImpl implements CloudVendorService
{
	CloudVendorRepository cloudVendorRepository;

	
	public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) 
	{
		this.cloudVendorRepository = cloudVendorRepository;
	}

	@Override
	public String createCloudVendor(CloudVendor cloudVendor) 
	{
		// More Business Logic Here
		cloudVendorRepository.save(cloudVendor);
		return "Success";
	}

	@Override
	public String updateCloudVendor(CloudVendor cloudVendor) 
	{
		// More Business Logic Here
		cloudVendorRepository.save(cloudVendor);
		return "Success";
	}

	@Override
	public String deleteCloudVendor(String cloudVendorId) 
	{
		// More Business Logic Here
		cloudVendorRepository.deleteById(cloudVendorId);
		return "Success";
	}

	@Override
	public CloudVendor getCloudVendor(String cloudVendorId) 
	{
		// More Business Logic Here
		return cloudVendorRepository.findById(cloudVendorId).get();
	}

	@Override
	public List<CloudVendor> getAllCloudVendors() 
	{
		// More Business Logic Here
		return cloudVendorRepository.findAll();
	}

}
