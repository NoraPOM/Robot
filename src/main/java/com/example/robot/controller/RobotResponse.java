package com.example.robot.controller;

import java.util.List;

public class RobotResponse {
    private List<Integer> respuesta;

    //List<Integer> respuesta = new ArrayList<Integer>();

    public RobotResponse(List<Integer> respuesta) {
        this.respuesta = respuesta;
    }

    public List<Integer> getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(List<Integer> respuesta) {
        this.respuesta = respuesta;
    }
}
