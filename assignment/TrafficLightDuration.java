package com.lionbridge.training.assignment;


public class TrafficLightDuration {
	

	public static void main(String[] args) {
		TrafficLights lights[]=TrafficLights.values();
		for(int i=0;i< lights.length;i++) {
			System.out.println(lights[i].name()+ " Duration Time : "+lights[i].getTrafficLightDuration()+"seconds"+"\n");
		}

	}

}
