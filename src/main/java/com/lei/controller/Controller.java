package com.lei.controller;

import com.lei.entity.LocationEvent;
import com.lei.entity.Message;
import com.lei.entity.SDKError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lei
 * @create 2022-07-06-6:54 PM
 */

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/test")
    public String test() {
        return "Hello";
    }

    @PostMapping("/events")
    public ResponseEntity getEvents(@RequestBody List<Message> messages) {

        Message message = messages.get(0);
        List<SDKError> errors = message.errorMsgs;

        for (LocationEvent event : message.payload) {
            System.out.println(event);
        }

        if (null != errors && errors.size() > 0) {

            for (SDKError errorMsg : errors) {
                // TODO
                // can get error info and save it into db or perform other operations
                System.out.println(errorMsg.toString());
            }
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
        }

        return ResponseEntity.status(HttpStatus.OK).build();
    }


}
