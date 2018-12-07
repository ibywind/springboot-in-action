package cn.bywind.boot.www;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FreemarkerController {

    @GetMapping("/getFm.do")
    public String getFm(){
        return "fm";
    }
}
