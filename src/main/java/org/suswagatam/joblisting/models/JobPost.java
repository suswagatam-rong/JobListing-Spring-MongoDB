package org.suswagatam.joblisting.models;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "jobLists")
public class JobPost {
    private String jobProfile;
    private String jobDescription;
    private int requiredExp;
    private String[] skills;

    public JobPost() {

    }

    public String getJobProfile() {
        return jobProfile;
    }

    public void setJobProfile(String jobProfile) {
        this.jobProfile = jobProfile;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public int getRequiredExp() {
        return requiredExp;
    }

    public void setRequiredExp(int requiredExp) {
        this.requiredExp = requiredExp;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "JobPost{" +
                "jobProfile='" + jobProfile + '\'' +
                ", jobDescription='" + jobDescription + '\'' +
                ", requiredExp=" + requiredExp +
                ", skills=" + Arrays.toString(skills) +
                '}';
    }
}