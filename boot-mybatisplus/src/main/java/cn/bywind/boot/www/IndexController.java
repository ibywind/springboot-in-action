package cn.bywind.boot.www;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @GetMapping("index")
    public @ResponseBody String index(){
        return "hello world";
    }
}
