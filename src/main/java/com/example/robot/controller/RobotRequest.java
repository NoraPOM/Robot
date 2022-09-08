package com.example.robot.controller;

import java.util.List;

public class RobotRequest {
    private List<List<String>> instruction;

    public RobotRequest() {
    }

    public RobotRequest(List<List<String>> instruction) {
        this.instruction = instruction;
    }

    public List<List<String>> getInstruction() {
        return instruction;
    }

    public void setInstruction(List<List<String>> instruction) {
        this.instruction = instruction;
    } 
}
