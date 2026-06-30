package com.infodev.krisjson.login.user.serviceImp;

import com.infodev.krisjson.login.user.User;
import com.infodev.krisjson.login.user.repo.UserRepo;
import com.infodev.krisjson.login.user.role.Role;
import com.infodev.krisjson.login.user.service.ServiceUser;
import com.infodev.krisjson.login.user.validation.RegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * author: Ojan Maharjan
 * createdDate: 6/30/26
 * projectName: branchless-banking
 **/
@Service
@RequiredArgsConstructor
public class UserImp implements ServiceUser {
    private final UserRepo user;

    @Override
    public String userRegister(RegisterRequest request){

        User userBuild =User.builder()
                .username(request.getUsername())
                .email(request.getEmail())
                .password(request.getPassword())
                .role(Role.USER)
                .build();

        user.save(userBuild);
        return "sucessful";
    }
}
