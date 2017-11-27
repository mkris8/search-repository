package com.search.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.search.model.NullProjectsInfo;
import com.search.model.ProjectsInfo;
import com.search.model.pojo.json.Item;
import com.search.model.pojo.json.Projects;

@Service ("searchManager")
public class SearchManagerImpl implements SearchManager {

	@Autowired
	ProjectsInfo projectsInfo;
	
	@Autowired
	NullProjectsInfo nullProjectsInfo;
	
	private List<ProjectsInfo> projectsInfoList;
	private final String endpointURI = "https://api.github.com/search/repositories?q=";
	
	@Override
	public List<ProjectsInfo> getAllProjects(String input) {
		
		projectsInfoList = new ArrayList<ProjectsInfo>();
		
		RestTemplate restTemplate = new RestTemplate();
        Projects projects = (Projects) restTemplate.getForObject( endpointURI +input, Projects.class);

        List<Item> items = projects.getItems();
		
        if(items.isEmpty()) {
        	nullProjectsInfo.setMessage("Not Available");
        	projectsInfoList.add(nullProjectsInfo);
        }
        
        items.forEach(item->{
        	projectsInfo = new ProjectsInfo();
        	projectsInfo.setId(item.getId());
        	projectsInfo.setName(item.getName());
        	projectsInfo.setUrl(item.getUrl());
        	projectsInfo.setOwnerLogin(item.getOwner().getLogin());
        	projectsInfoList.add(projectsInfo);
        });
	
		return projectsInfoList;
	}

}