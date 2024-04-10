package com.service;

import java.util.List;
import org.springframework.http.HttpStatus;
import com.model.TrainInfo;

public interface TrainService {

	TrainInfo saveTrain(TrainInfo trainInfo);

	List<TrainInfo> getAllTrains();

	TrainInfo getTrainByNumber(int trainNumber);

	List<TrainInfo> getTrainByName(String trainName);

	String getTrainCurrentStation(int trainNumber);

	TrainInfo updateStation(String stationName, int trainNumber);

	

	

	

}
