package com.cmbchina.controller;

import com.cmbchina.domain.Greeting;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created with IntelliJ IDEA.
 * com.cmbchina.domain.Users: ZhongYu Rong
 * Date: 2017/11/18
 * Time: 21:38
 */
@RestController
public class SampleController {
    private static Logger log = LogManager.getLogger(SampleController.class);


    @RequestMapping("/login")
    @ResponseBody
    public String home() {
        log.info("Hello world");
        return "Hello World!";
    }

    @RequestMapping("/logout")
    @ResponseBody
    public String logout() {
        return "Good!";
    }

    @RequestMapping("/log")
    @ResponseBody
    public String log() {
        return "logg!";
    }

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/greeting",method = RequestMethod.GET)
    @ResponseBody
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @RequestMapping(value = "/greeting/{name}")
    @ResponseBody
    public Greeting greeting1(@PathVariable(value="name") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

}
