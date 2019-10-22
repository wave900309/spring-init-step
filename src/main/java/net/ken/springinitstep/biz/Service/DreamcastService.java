package net.ken.springinitstep.biz.Service;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class DreamcastService {

    @PostConstruct
    public void $(){
        System.out.println("Dreamcast construct success");
    }

    public String dreamcastHello(){
        return "Dreamcast Service";
    }
}
