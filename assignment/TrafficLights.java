package com.lionbridge.training.assignment;

public enum TrafficLights {
	RED(240),
	GREEN(300),
	YELLOW(20);
	int duration;
	TrafficLights(int duration){
		this.duration=duration;
	}
	public int getTrafficLightDuration() {
		return this.duration;
	}

}



