package com.project.issuemanagement.repository;

import com.project.issuemanagement.entity.IssueHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface IssueHistoryRepository extends JpaRepository<IssueHistory, Long> {

    List<IssueHistory> getByIssueIdOrderById(Long id);
}
