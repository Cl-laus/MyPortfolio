package com.myportfolio.api_rest.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.myportfolio.api_rest.controller.dto.ProjectBasicDTO;
import com.myportfolio.api_rest.controller.dto.ProjectDetailDTO;
import com.myportfolio.api_rest.controller.mapper.ProjectMapper;
import com.myportfolio.api_rest.entity.Project;
import com.myportfolio.api_rest.repository.ProjectRepository;

@RestController
@RequestMapping("api/project")
public class ProjetController {

    private ProjectRepository repo;
    private ProjectMapper mapper;

    public ProjetController(ProjectRepository repo, ProjectMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    /////// --------------------------UTILITIES-------------------------- ///////

    private Project getOrNotFound(Integer id) {
        return repo.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Project not found"));

    }

    /////// --------------------------READ-------------------------- ///////
    @GetMapping("")
    public List<ProjectBasicDTO> getAllProject() {
        List<ProjectBasicDTO> projects = repo.findAll()
                .stream()
                .map(mapper::toBasicDto)
                .collect(Collectors.toList());
        return projects;

    }

    @GetMapping("/{id}")
    public ProjectDetailDTO getProjectById(@PathVariable Integer id) {
        Project project = getOrNotFound(id);
        return mapper.toDetailDto(project);
    }

}
