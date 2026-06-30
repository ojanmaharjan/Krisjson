package com.infodev.krisjson.login.user;

import com.infodev.krisjson.login.user.role.Role;
import jakarta.persistence.*;
import lombok.*;

/**
 * author: Ojan Maharjan
 * createdDate: 6/29/26
 * projectName: branchless-banking
 **/
@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false , unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role = Role.USER;
}
