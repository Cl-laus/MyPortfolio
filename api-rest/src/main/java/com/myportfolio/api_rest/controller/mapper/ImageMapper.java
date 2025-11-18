package com.myportfolio.api_rest.controller.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.myportfolio.api_rest.controller.dto.ImageDTO;
import com.myportfolio.api_rest.entity.Image;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ImageMapper {
    ImageDTO toDto(Image entity);

    Image toEntity(ImageDTO dto);
}
