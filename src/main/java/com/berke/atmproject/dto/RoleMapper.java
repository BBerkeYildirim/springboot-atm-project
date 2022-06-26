package com.berke.atmproject.dto;


import com.berke.atmproject.model.Role;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    RoleMapper INSTANCE = Mappers.getMapper(RoleMapper.class);

    RoleDto roleToRoleDto(Role role);

    Role roleDtoToRole(RoleDto roleDto);
}
