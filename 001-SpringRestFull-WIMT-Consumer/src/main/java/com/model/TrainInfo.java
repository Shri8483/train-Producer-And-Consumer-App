package com.model;


public class TrainInfo {
	
	private int trainNo;
	private String trainName;
	private String trainSource;
	private String trainDesignation;
	private String currentStation;
	private double time;
	
	public int getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getTrainSource() {
		return trainSource;
	}
	public void setTrainSource(String trainSource) {
		this.trainSource = trainSource;
	}
	public String getTrainDesignation() {
		return trainDesignation;
	}
	public void setTrainDesignation(String trainDesignation) {
		this.trainDesignation = trainDesignation;
	}
	public String getCurrentStation() {
		return currentStation;
	}
	public void setCurrentStation(String currentStation) {
		this.currentStation = currentStation;
	}
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "TrainInfo [trainNo=" + trainNo + ", trainName=" + trainName + ", trainSource=" + trainSource
				+ ", trainDesignation=" + trainDesignation + ", currentStation=" + currentStation + ", time=" + time
				+ "]";
	}
	

}