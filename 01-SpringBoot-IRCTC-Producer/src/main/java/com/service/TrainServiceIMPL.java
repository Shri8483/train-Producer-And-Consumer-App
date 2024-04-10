package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.TrainInfo;
import com.repository.TrainInfoRepository;

@Service
public class TrainServiceIMPL implements TrainService
{
	@Autowired
	private TrainInfoRepository repo;

	@Override
	public TrainInfo saveTrain(TrainInfo trainInfo) 
	{
		return repo.save(trainInfo);
	}

	@Override
	public List<TrainInfo> getAllTrains() 
	{
		return repo.findAll();
	}

	@Override
	public TrainInfo getTrainByNumber(int trainNumber) 
	{
		return repo.findById(trainNumber).get();
	}

	@Override
	public List<TrainInfo> getTrainByName(String trainName) 
	{
		return repo.findByTrainName(trainName);
	}

	@Override
	public String getTrainCurrentStation(int trainNumber) 
	{
	
	if(repo.existsById(trainNumber))
	{
		return repo.findById(trainNumber).get().getCurrentStation();
	}
	else
	{
		return "No Station Found....!";
	}
}

	@Override
	public TrainInfo updateStation(String stationName, int trainNumber)
	{
		TrainInfo info= repo.findById(trainNumber).get();
		info.setCurrentStation(stationName);
		return repo.save(info);
	}
	

}
