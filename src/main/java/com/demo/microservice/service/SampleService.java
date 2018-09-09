package com.demo.microservice.service;

import java.util.List;
import java.util.Optional;

import com.demo.microservice.model.SampleModel;


public interface SampleService {
	
	public List<SampleModel> getAllSampleData();
	
	public Optional<SampleModel> getSampleData(int id);
	
	public void addSampleData(SampleModel sampleData);

}
