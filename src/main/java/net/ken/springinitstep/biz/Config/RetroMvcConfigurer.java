package net.ken.springinitstep.biz.Config;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.PostConstruct;

/**
 * Created by Yang, Haiqiang on 2019/10/22.
 */
@Component
public class RetroMvcConfigurer implements WebMvcConfigurer {

    @PostConstruct
    public void $() {
        System.out.println("RetroMvcConfigurer initialed");
    }

    /*@Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        FastJsonHttpMessageConverter mc =  new FastJsonHttpMessageConverter();
        FastJsonConfig config = new FastJsonConfig();
        config.setDateFormat("dd/MM/yy");
        mc.setFastJsonConfig(config);
        converters.add(0, mc);
    }*/

    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.favorPathExtension(true).favorParameter(false).defaultContentType(MediaType.APPLICATION_JSON)
                .mediaType("xml", MediaType.APPLICATION_XML).
                mediaType("json", MediaType.APPLICATION_JSON);
    }
}
