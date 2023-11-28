package com.vectordemo;

public class Trainer {
	
	String trainer_name;
	int experience;
	String graduation;
	
	public Trainer()
	{
		
	}
	
	public Trainer(String trainer_name, int experience, String graduation) {
		super();
		this.trainer_name = trainer_name;
		this.experience = experience;
		this.graduation = graduation;
	}

	public String getTrainer_name() {
		return trainer_name;
	}

	public void setTrainer_name(String trainer_name) {
		this.trainer_name = trainer_name;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getGraduation() {
		return graduation;
	}

	public void setGraduation(String graduation) {
		this.graduation = graduation;
	}

	@Override
	public String toString() {
		return "Trainer [trainer_name=" + trainer_name + ", experience=" + experience + ", graduation=" + graduation
				+ "]";
	}

	
	
	

}
