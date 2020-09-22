package org.zerock.club.controller;


import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
@RequestMapping("/sample/")
public class SampleController {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/all")
    public void exAll(){

        log.info("exAll.........." + passwordEncoder );

    }

    @GetMapping("/member")
    public void exMember(){
        log.info("exMember..........");
    }

    @GetMapping("/admin")
    public void exAdmin(){
        log.info("exAdmin..........");
    }

}
