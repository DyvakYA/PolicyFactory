package com.providna.model;

public class Main {

	public static void main(String[] args) {

		PolicyHolder holder = new PolicyHolder();
		AbstractPolicy policy = holder.findPolicy("index");
		policy.createUser();
		policy.createVehicle();
	}

}
