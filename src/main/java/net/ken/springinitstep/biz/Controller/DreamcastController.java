package net.ken.springinitstep.biz.Controller;

import net.ken.springinitstep.biz.Service.DreamcastService;
import net.ken.springinitstep.biz.model.Console;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by Yang, Haiqiang on 2019/10/16.
 */
@RestController
public class DreamcastController {

    private final DreamcastService dreamcastService;

    public DreamcastController(DreamcastService dreamcastService) {
        this.dreamcastService = dreamcastService;
    }

    @RequestMapping("/dc")
    @ResponseBody
    public Object dc() {
        System.out.println(dreamcastService.dreamcastHello());
        return Arrays.asList(new Console("SEGA", "Dreamcast", new Date()),
                new Console("SONY", "PlayStation 2", new Date()));
    }
}
