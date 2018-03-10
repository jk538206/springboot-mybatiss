package org.spring.springboot.hessian.inter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.caucho.HessianServiceExporter;

@SpringBootApplication
public class HessianServerApplication {

    @Autowired
    private RemoteService remoteService;

    public static void main(String[] args) {
        SpringApplication.run(HessianServerApplication.class, args);
    }

//发布服务
    @Bean(name = "/HelloWorldService")
    public HessianServiceExporter accountService() {
        HessianServiceExporter exporter = new HessianServiceExporter();
        exporter.setService(remoteService);
        exporter.setServiceInterface(RemoteService.class);
        return exporter;
    }
}