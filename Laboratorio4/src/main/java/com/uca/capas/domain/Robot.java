package com.uca.capas.domain;

import javax.validation.constraints.AssertTrue;

public class Robot {

	@AssertTrue(message="No puedes ingresar el producto porque eres un robot")
	private Boolean soyRobot;

	public Boolean getSoyRobot() {
		return soyRobot;
	}

	public void setSoyRobot(Boolean soyRobot) {
		this.soyRobot = soyRobot;
	}
	
	
}
