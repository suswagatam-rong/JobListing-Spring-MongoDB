package org.suswagatam.joblisting.controller;

import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.io.IOException;

/*
    Spring MVC - fetches all the job posts using the POST method
 */
@RestController
public class Controller {

    // when home directory is fetched, this will redirect it to the Swagger UI
    @ApiIgnore
    @RequestMapping(value = "/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    // Fetches all the job posts
    //public List<Post>
}