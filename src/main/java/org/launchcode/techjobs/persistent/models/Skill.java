package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Skill extends AbstractEntity {

    @NotBlank
    @Size(max = 250)
    private String description;

    @ManyToMany(mappedBy = "skills")
    private final List<Job> jobs = new ArrayList<>();

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    public List<Job> getJobs () {return jobs;}

    public void setJobs (List<Job> someJobs) {
        jobs.addAll(someJobs);
    }

    public Skill () {}
}
