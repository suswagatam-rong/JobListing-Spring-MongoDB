package org.suswagatam.joblisting.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.suswagatam.joblisting.JobRepository;
import org.suswagatam.joblisting.models.JobPost;
import springfox.documentation.annotations.ApiIgnore;

import java.io.IOException;
import java.util.List;

/*
    Spring MVC - fetches all the job posts using the POST method
 */
@RestController
public class Controller {

    // Spring creates an object for you and handles the things
    @Autowired
    JobRepository repo;

    // when home directory is fetched, this will redirect it to the Swagger UI
    @ApiIgnore
    @RequestMapping(value = "/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    // Fetches all the job posts
    @GetMapping("/posts")
    public List<JobPost> getAllPosts() {
        // uses Spring Data MongoDB to fetch data
        return repo.findAll();
    }
}