package com.issuesManagement.service.impl;

import com.issuesManagement.dto.IssueDto;
import com.issuesManagement.entity.Issue;
import com.issuesManagement.repositroy.IssueRepositroy;
import com.issuesManagement.service.IssueService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import java.awt.print.Pageable;


@Service
public class  IssueServiceImpl implements IssueService {

    private final IssueRepositroy issueRepositroy;
    private final ModelMapper modelMapper;

    public IssueServiceImpl(IssueRepositroy issueRepositroy){
        this.issueRepositroy=issueRepositroy;
        this.modelMapper=new ModelMapper();
    }


    @Override
    public IssueDto save(IssueDto issue) {

        if (issue.getDate()==null)
            throw new IllegalArgumentException("Issue Date cannot be null");
        Issue issuedb = modelMapper.map(issue, Issue.class);

        issuedb = issueRepositroy.save(issuedb);
        return modelMapper.map(issuedb,IssueDto.class);
    }

    @Override
    public IssueDto getById(Long id) {
        return null;
    }

    @Override
    public Page<IssueDto> getAllPageable(Pageable pageable) {
        return null;
    }

    @Override
    public Boolean delete(IssueDto issue) {
        return null;
    }
}
