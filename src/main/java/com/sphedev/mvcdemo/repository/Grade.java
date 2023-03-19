package com.sphedev.mvcdemo.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;
@Data
@AllArgsConstructor
public class Grade {
    private String name;
    private String subject;
    private String score;
    private  String id;


    public Grade() {
        this.id = UUID.randomUUID().toString();
    }

}
