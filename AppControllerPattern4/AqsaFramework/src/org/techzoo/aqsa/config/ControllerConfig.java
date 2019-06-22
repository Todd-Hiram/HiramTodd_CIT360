package org.techzoo.aqsa.config;

import static java.lang.Class.forName;

import org.techzoo.aqsa.Controller;

public class ControllerConfig {

	private String action;
	private String controllerClass;

	public ControllerConfig(String action, String controllerClass) {
		super();
		this.action = action;
		this.controllerClass = controllerClass;
	}

	public Controller invokeController() {
		Controller controller = null;
		if (controllerClass != null && !controllerClass.isEmpty()) {
			try {
				controller = (Controller)forName(controllerClass).newInstance();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return controller;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public void setControllerClass(String controllerClass) {
		this.controllerClass = controllerClass;
	}

	public String getAction() {
		return action;
	}

	public String getControllerClass() {
		return controllerClass;
	}
}
