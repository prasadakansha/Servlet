package com.enroll.dao;

public class TrainingData {

	private int trainingId;
	private String trainingName;
	private int seats;
	public TrainingData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TrainingData(int trainingId, String trainingName, int seats) {
		super();
		this.trainingId = trainingId;
		this.trainingName = trainingName;
		this.seats = seats;
	}
	public int getTrainingId() {
		return trainingId;
	}
	public void setTrainingId(int trainingId) {
		this.trainingId = trainingId;
	}
	public String getTrainingName() {
		return trainingName;
	}
	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	@Override
	public String toString() {
		return "Course [trainingId=" + trainingId + ", trainingName=" + trainingName + ", seats=" + seats + "]";
	}
	
	
	
}
