package com.issuesManagement.service;
import com.issuesManagement.dto.IssueDto;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;


public interface IssueService {

    IssueDto save(IssueDto issue);

    IssueDto getById(Long id);

    Page<IssueDto> getAllPageable(Pageable pageable);

    Boolean delete(IssueDto issue);
}
