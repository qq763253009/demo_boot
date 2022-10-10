package com.example.demo_boot.controller;
import com.example.demo_boot.pojo.Student;
import org.springframework.web.bind.annotation.*;

/**


 */
// 返回为json格式
@RestController
public class TestController {
    @RequestMapping("/requests")
    public String index(){
        return "Hello world";
    }

    @RequestMapping("/parm")
    public String requestsParm(@RequestParam Integer num){
        num +=1;
        return "Hello world: "+num;
    }

    //post
    @PostMapping ("/post")
    public String postRequests(@RequestBody Student student){

        return "收到post参数:"+student;
    }
}
