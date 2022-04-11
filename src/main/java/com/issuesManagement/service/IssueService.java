package com.issuesManagement.service;
import com.issuesManagement.dto.IssueDto;
import com.issuesManagement.util.TPage;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;


public interface IssueService {

    IssueDto save(IssueDto issue);

    IssueDto getById(Long id);

    TPage<IssueDto> getAllPageable(Pageable pageable);

    Boolean delete(IssueDto issue);
}
