package com.scm.scm.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class RegisterForm {
    private String name;
    private String email;
    private String password;
    private String number;
    private String about;
}
