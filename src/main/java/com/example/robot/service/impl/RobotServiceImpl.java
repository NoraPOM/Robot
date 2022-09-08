package com.example.robot.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.robot.controller.RobotRequest;
import com.example.robot.controller.RobotResponse;
import com.example.robot.service.RobotService;

@Service
public class RobotServiceImpl implements RobotService {
    @Override
    public RobotResponse solution(RobotRequest instructions) {

        List<Integer> response = new ArrayList<Integer>();

        for (int i = 0; i < instructions.getInstruction().size(); i++) {

            Integer temporal = 0;

            for (int j = 0; j < instructions.getInstruction().get(i).size(); j++) {

                String instruction = instructions.getInstruction().get(i).get(j);

                if (instruction.equals("LEFT")) {

                    temporal = temporal - 1;

                } else if (instruction.equals("RIGHT")) {

                    temporal = temporal + 1;

                } else {
                    String[] position = instruction.split(" ");
                    // ["SAME","AS","4"]
                    Integer positionNumber = Integer.parseInt(position[2]);

                    Boolean flag = false;

                    // ["LEFT","SAME AS 1","SAME AS 2","SAME AS 1","SAME AS 4"]

                    while(!flag){
                        if(instructions.getInstruction().get(i).get(positionNumber - 1).contains("SAME AS")){
                            Integer nextPosition = Integer.parseInt(instructions.getInstruction().get(i).get(positionNumber - 1).split(" ")[2]);
                            flag = true;
                            if(instructions.getInstruction().get(i).get(nextPosition - 1).equals("RIGHT")){
                                temporal = temporal + 1;
                            }else {
                                temporal = temporal - 1;
                            }
                        }
                        else{
                            flag = true;
                            if(instructions.getInstruction().get(i).get(positionNumber - 1).equals("RIGHT")){
                                temporal = temporal + 1;
                            }else{
                                temporal = temporal - 1;
                            }
                        }
                    }



                }
            }
            response.add(temporal);

        }

        return new RobotResponse(response);
    }

}