package com.example.robot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.robot.service.RobotService;

@RestController
@RequestMapping( "/robot" )
public class RobotController {
    private final RobotService robotService;
    public RobotController ( @Autowired RobotService x){
        this.robotService = x;
    }
    @PostMapping
    public ResponseEntity<RobotResponse> solucion(@RequestBody RobotRequest robotRequest){
        return ResponseEntity.ok(robotService.solution(robotRequest));
    }
}