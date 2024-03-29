package org.suswagatam.joblisting.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.suswagatam.joblisting.models.JobPost;

// takes care of the CRUD operations for our MongoDB database
public interface JobRepository extends MongoRepository<JobPost, String> {

}