package com.appointment.appointmentservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@RestController
@RequestMapping("/send")
public class SMSController {

	
	@GetMapping(value = "/sms")
    public ResponseEntity<String> sendSMS() {

            Twilio.init("AC1b8f6752dfd7c690fc50509dfc1b04bd", "4a9c2651c1be71367a95db026747206b");

            Message.creator(new PhoneNumber("+918421062273"),
                            new PhoneNumber("+14783129898"),"Welcome dear!!!").create();

            return new ResponseEntity<String>("Message sent successfully", HttpStatus.OK);
    }
	
}
