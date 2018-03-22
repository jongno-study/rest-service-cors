package hello.service;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@EnableConfigurationProperties(ServiceProperties.class)
public class MyService {

    private final ServiceProperties serviceProperies;

    public MyService(ServiceProperties serviceProperties){
        this.serviceProperies=serviceProperties;
    }

    public String message(){
        return this.serviceProperies.getMessage();
    }
}
