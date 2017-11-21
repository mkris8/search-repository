package com.search.model;

import org.springframework.stereotype.Component;

@Component("projectsInfo")
public class ProjectsInfo {

	private int id;
	private String name;
	private String url;
	private String ownerLogin;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getOwnerLogin() {
		return ownerLogin;
	}

	public void setOwnerLogin(String ownerLogin) {
		this.ownerLogin = ownerLogin;
	}

	@Override
	public String toString() {
		return "ProjectsInfo [id=" + id + ", name=" + name + ", url=" + url + ", ownerLogin=" + ownerLogin + "]";
	}
}
