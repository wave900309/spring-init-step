package net.ken.springinitstep.biz.Controller;

import net.ken.springinitstep.biz.Service.DreamcastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yang, Haiqiang on 2019/10/16.
 */
@RestController
public class DreamcastController {

    @Autowired
    private DreamcastService dreamcastService;

    @RequestMapping("/dc")
    @ResponseBody
    public String dc(){
        System.out.println(dreamcastService.dreamcastHello());
        return "Dreamcast";
    }
}
