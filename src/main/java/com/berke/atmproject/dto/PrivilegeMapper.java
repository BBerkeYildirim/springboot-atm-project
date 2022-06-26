package com.berke.atmproject.dto;

import com.berke.atmproject.model.Privilege;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PrivilegeMapper {

    PrivilegeMapper INSTANCE = Mappers.getMapper(PrivilegeMapper.class);

    PrivilegeDto privilegeToPrivilegeDto(Privilege privilege);

    Privilege privilegeDtoToPrivilege(PrivilegeDto privilegeDto);
}
