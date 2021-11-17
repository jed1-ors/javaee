package com.senlainc.servlet.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@Builder
@ToString
public class Student implements Serializable {
    private String firstName;
    private String lastName;
    private String middleName;
    private LocalDate birthday;
}