package com.issuesManagement.service.impl;

import com.issuesManagement.entity.Project;
import com.issuesManagement.repositroy.ProjectRepositroy;
import com.issuesManagement.service.ProjectService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import java.awt.print.Pageable;
import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepositroy projectRepositroy;

    public ProjectServiceImpl(ProjectRepositroy projectRepositroy){
        this.projectRepositroy = projectRepositroy;
    }

    @Override
    public Project save(Project project) {
        if (project.getProjectCode() == null){
            throw new IllegalArgumentException("Project code cannot be null");
        }
        return projectRepositroy.save(project);
    }

    @Override
    public Project getById(Long id) {

        return projectRepositroy.getOne(id);
    }

    @Override
    public List<Project> getByProjectCode(String projectCode) {
        return null;
    }

    @Override
    public List<Project> getByProjectCodeContains(String projectCode) {
        return null;
    }

    @Override
    public Page<Project> getAllPageable(Pageable pageable) {

        return projectRepositroy.findAll(pageable);
    }

    @Override
    public Boolean delete(Project project) {
        return null;
    }
}
