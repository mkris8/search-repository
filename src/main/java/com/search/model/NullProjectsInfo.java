package com.search.model;

import org.springframework.stereotype.Component;
import com.search.model.ProjectsInfo;

@Component("nullProjectsInfo")
public class NullProjectsInfo extends ProjectsInfo{
	private String message;
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "NullProjectsInfo [message=" + message + "]";
	}

}