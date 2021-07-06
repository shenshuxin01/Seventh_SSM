package ssx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ssx.service.ServiceG;

import javax.annotation.Resource;
import java.util.Map;

@Controller
public class ControllerG {

    @Resource(name = "serviceG")
    ServiceG serviceG;

    @RequestMapping(value = "jj/addname.do",method = RequestMethod.POST)
    @ResponseBody
    public Map  fun(@RequestBody Map requestMap){
        String name = (String) requestMap.get("name");
        return serviceG.add(name);
    }
}
