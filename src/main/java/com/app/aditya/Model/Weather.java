package com.app.aditya.Model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties
public class Weather {

    public String loc;

//    int id;
//
//    String name;
//
//    String address;
//
//    String email;
//
//    int age;


}
