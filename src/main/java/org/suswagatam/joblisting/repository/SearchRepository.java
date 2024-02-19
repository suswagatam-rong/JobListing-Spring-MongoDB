package org.suswagatam.joblisting.repository;

import org.suswagatam.joblisting.models.JobPost;

import java.util.List;

public interface SearchRepository {
    List<JobPost> findByText(String text);
}