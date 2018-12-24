package cn.bywind.boot.www;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/pass")
    @ResponseBody
    public String pass(){
        return "pass";
    }

    @RequestMapping("/fail")
    @ResponseBody
    public String fail(){
        return "fail";
    }

    @RequestMapping("/exe")
    @ResponseBody
    public String exe(){
        throw new RuntimeException("this is not found");
    }
}
