package com.scm.scm.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {
    
    @Id
    private String username;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String number;
    @Column(length = 1000)
    private String profilePicture;
    @Column(length = 10000)
    private String about;
    @Column(length = 1000)
    private String address;

    private boolean enabled = false;
    private boolean emailVerified = false;
    private boolean phoneVerified = false;

    @Column(nullable = false)
    private Provider provider = Provider.SELF;
    private String providerUserId;

    @OneToMany(mappedBy = "user")
    private List<Contact> contact;
}
