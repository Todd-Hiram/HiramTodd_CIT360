package org.techzoo.aqsa;

import java.util.Map;

public class View {
	
	private Map<String, ?> model;
	private String forward;
	
	public View(String forward) {
		this.setForward(forward);
	}
	
	public View(String forward, Map<String, ?> data) {
		this.setForward(forward);
		if (data != null) {
			this.model = data;
		}
	}

	public void clean() {
		this.model = null;
	}

	public Map<String, ?> getModel() {
		return model;
	}

	public void setModel(Map<String, Object> model) {
		this.model = model;
	}

	public String getForward() {
		return forward;
	}

	public void setForward(String forward) {
		this.forward = forward;
	}
}
