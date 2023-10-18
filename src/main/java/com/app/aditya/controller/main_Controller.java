package com.app.aditya.controller;


import com.app.aditya.Model.Root;
import com.app.aditya.Model.Weather;
import com.app.aditya.Service.DepartmentService;
import com.app.aditya.Service.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

@RestController
@RequestMapping("/employees")
@Slf4j
public class main_Controller {

    @Autowired
    DepartmentService departmentService;

    @Autowired
    Employee employee1;

    @PostMapping("/post")
    public Root test(@RequestBody @NotNull Weather weather) {

//        https://api.weatherapi.com/v1/current.json?q=Mumbai&key=e51d64e8900f457999f164911230810

// Create a neat value object to hold the URL
        URL url = null;
        InputStream responseStream;
        try {
            url = new URL("http://api.weatherapi.com/v1/current.json?key=e51d64e8900f457999f164911230810&q=" + weather.getLoc() + "&aqi=no");


// Open a connection(?) on the URL(??) and cast the response(???)
            HttpURLConnection connection = null;

            connection = (HttpURLConnection) url.openConnection();


// Now it's "open", we can set the request method, headers etc.
            connection.setRequestProperty("accept", "application/json");

// This line makes the request

            responseStream = connection.getInputStream();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String text = new BufferedReader(
                new InputStreamReader(responseStream, StandardCharsets.UTF_8))
                .lines()
                .collect(joining("\n"));
        System.out.println(text);

        Root convertedObject = new Gson().fromJson(text, Root.class);

// Finally we have the response
        System.out.println(convertedObject);


        employee1=new Employee(employee.getId()+1,"Mr. "+employee.getName()
        , employee.getAddress(), employee.getEmail(), employee.getAge());
//log.info(employee.toString());
        return convertedObject;
    }

    @GetMapping("get/{name}")
    public  String testget(@PathVariable @NotNull String name){


        departmentService.toString();


        return name;
    }



}
