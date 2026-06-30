package com.infodev.krisjson.login.user.validation;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


/**
 * author: Ojan Maharjan
 * createdDate: 6/29/26
 * projectName: branchless-banking
 **/

@Getter
@Setter
public class LoginRequest {

    @NotBlank(message = "Email format is wrong")
    @Email(message = "email ")
    private String email;

    @NotBlank(message = "password is required")
    @Size(min = 5, max = 10, message = "password is required")
    private String password;
}
