package com.search.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.search.model.ProjectsInfo;
import com.search.service.SearchManager;

@RestController
public class SearchController {

	@Autowired
	SearchManager searchManager;

	@RequestMapping(value = "/projects/{input}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<ProjectsInfo> getAllProjects(@PathVariable("input") String input) {

		return searchManager.getAllProjects(input);

	}

}
