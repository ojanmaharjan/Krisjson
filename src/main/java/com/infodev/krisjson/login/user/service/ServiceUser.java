package com.infodev.krisjson.login.user.service;

import com.infodev.krisjson.login.user.validation.RegisterRequest;

/**
 * author: Ojan Maharjan
 * createdDate: 6/30/26
 * projectName: branchless-banking
 **/
public interface ServiceUser {
    String userRegister(RegisterRequest request);
}
