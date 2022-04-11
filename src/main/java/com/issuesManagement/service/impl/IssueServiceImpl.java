package com.issuesManagement.service.impl;

import com.issuesManagement.dto.IssueDto;
import com.issuesManagement.entity.Issue;
import com.issuesManagement.repository.IssueRepository;
import com.issuesManagement.service.IssueService;
import com.issuesManagement.util.TPage;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Arrays;


@Service
public class  IssueServiceImpl implements IssueService {

    private final IssueRepository issueRepository;
    private final ModelMapper modelMapper;

    public IssueServiceImpl(IssueRepository issueRepository){
        this.issueRepository = issueRepository;
        this.modelMapper= new ModelMapper();
    }


    @Override
    public IssueDto save(IssueDto issue) {

        if (issue.getDate()==null)
            throw new IllegalArgumentException("Issue Date cannot be null");
        Issue issuedb = modelMapper.map(issue, Issue.class);

        issuedb = issueRepository.save(issuedb);
        return modelMapper.map(issuedb,IssueDto.class);
    }

    @Override
    public IssueDto getById(Long id) {
        return null;
    }

    @Override
    public TPage<IssueDto> getAllPageable(Pageable pageable) {
        Page<Issue> data = issueRepository.findAll((Pageable) pageable);
        TPage page=new TPage<IssueDto>();
        IssueDto[] dtos = modelMapper.map(data.getContent(),IssueDto[].class);
        page.setStat(data, Arrays.asList(dtos));
        return page;
    }



    @Override
    public Boolean delete(IssueDto issue) {
        return null;
    }
}
