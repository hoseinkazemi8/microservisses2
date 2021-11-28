package com.customer.customer;


import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@FeignClient(name="employee", url="localhost:8070/handshake/sayhello")
@FeignClient(name="employee")
@LoadBalancerClient(name = "employee",
        configuration= LoadBalancerConfiguration.class)
//@Component
public interface CustomerExchangeProxy {
    //@GetMapping("/currency-exchange/from/{from}/to/{to}")
/*        @GetMapping("/currency-exchange-service/currency-exchange/from/{from}/to/{to}")
        public CustomerConversionBean retrieveExchangeValue
        (@PathVariable("from") String from, @PathVariable("to") String to);*/

    @GetMapping("handshake/sayhello")
    public String haha();
}
