package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.TrainInfo;
import com.service.TrainService;

@RestController
@RequestMapping("/irctc-service")
public class IRCTCController {
	
	@Autowired
	private  TrainService service;
	
	@PostMapping("/")
	public ResponseEntity<TrainInfo> saveTrainInfo(@RequestBody TrainInfo trainInfo)
	{
		return new ResponseEntity<TrainInfo>(service.saveTrain(trainInfo),HttpStatus.OK);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<TrainInfo>> getAllTrains()
	{
		return new ResponseEntity<List<TrainInfo>>(service.getAllTrains(),HttpStatus.OK);
	}
	
	@GetMapping("/trainNumber/{trainNumber}")
	public ResponseEntity<TrainInfo> getTrainByNumber(@PathVariable int trainNumber)
	{
		return new ResponseEntity<TrainInfo>(service.getTrainByNumber(trainNumber),HttpStatus.OK);
	}
	
	@GetMapping("/trainName/{trainName}")
	public ResponseEntity<List<TrainInfo>> getTrainByName(@PathVariable String trainName)
	{
		return new ResponseEntity<List<TrainInfo>>(service.getTrainByName(trainName),HttpStatus.OK);
	}
	
	@GetMapping("/currentStation/{trainNumber}")
	public ResponseEntity<String> getTrainCurrentStation(@PathVariable int trainNumber)
	{
		return new ResponseEntity<String>(service.getTrainCurrentStation(trainNumber),HttpStatus.OK);
	}
	
	@PutMapping("/{stationName}/{trainNumber}")
	public ResponseEntity<TrainInfo> updateCurrentStation(@PathVariable String stationName, @PathVariable int trainNumber)
	{
		return new ResponseEntity<TrainInfo>(service.updateStation(stationName,trainNumber),HttpStatus.OK);
	}
}
