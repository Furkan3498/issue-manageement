package com.project.issuemanagement.repository;

import com.project.issuemanagement.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IssueRepository extends JpaRepository<Issue, Long> {

}
