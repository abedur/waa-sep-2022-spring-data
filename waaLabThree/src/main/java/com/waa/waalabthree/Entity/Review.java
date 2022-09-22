package com.waa.waalabthree.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Review {
    @Id
    @GeneratedValue
    private Integer id;
    private String comment;

    @ManyToOne
    private User user;
}
