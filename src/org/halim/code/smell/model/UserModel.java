package org.halim.code.smell.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class UserModel {

    private String id;
    private String name;
    private DepartmentModel department;

}
