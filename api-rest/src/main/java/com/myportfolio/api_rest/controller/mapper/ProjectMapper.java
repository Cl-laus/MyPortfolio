package com.myportfolio.api_rest.controller.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.myportfolio.api_rest.controller.dto.ProjectBasicDTO;
import com.myportfolio.api_rest.controller.dto.ProjectDetailDTO;
import com.myportfolio.api_rest.entity.Project;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProjectMapper {

    ProjectDetailDTO toDetailDto(Project entity);

    ProjectBasicDTO toBasicDto(Project entity);

    Project toEntity(ProjectBasicDTO dto);

    Project toEntity(ProjectDetailDTO dto);

}
