package com.backwebmvc.backwebmvc.tym;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SampleController {

    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("name" , "kim");
        return "hello";
    }
    @GetMapping("/except")
    public String except(){
        throw  new SampleException();
    }

/*    @ExceptionHandler(SampleException.class)
    public @ResponseBody AppError sampleError(SampleException e){
        AppError appError = new AppError();
        appError.setMessage("error.app.key");
        appError.setReason("IDK IDK");
        return appError;
    }*/
}
