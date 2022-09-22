package com.waa.waalabthree.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    private String email;
    private String password;
    private String firstname;
    private String lastname;


//    @OneToMany
//    @JoinColumn(name = "user")
//    private List<Review> reviews;
//
//    @OneToOne
//    @JoinColumn
//    private Address address;





}
