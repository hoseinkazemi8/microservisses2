package com.customer.customer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
@RestController
@RequestMapping("/customer")
public class CustomerConversionController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CustomerExchangeProxy proxy;

  /*  @GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
    public CustomerConversionBean convertCurrency(@PathVariable String from, @PathVariable String to,
                                                  @PathVariable BigDecimal quantity) {

        // Feign - Problem 1
        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("from", from);
        uriVariables.put("to", to);

        ResponseEntity<CustomerConversionBean> responseEntity = new RestTemplate().getForEntity(
                "http://localhost:8000/currency-exchange/from/{from}/to/{to}", CustomerConversionBean.class,
                uriVariables);

        CustomerConversionBean                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    response = responseEntity.getBody();

        return new CustomerConversionBean(response.getId(), from, to, response.getConversionMultiple(), quantity,
                quantity.multiply(response.getConversionMultiple()), response.getPort());
    }*/
    /*
       @GetMapping("/currency-converter-feign/from/{from}/to/{to}/quantity/{quantity}")
        public CustomerConversionBean convertCurrencyFeign(@PathVariable String from, @PathVariable String to,
                                                           @PathVariable BigDecimal quantity) {



            logger.info("{}", response);

            return new CustomerConversionBean(response.getId(), from, to, response.getConversionMultiple(), quantity,
                    quantity.multiply(response.getConversionMultiple()), response.getPort());
        }    */
    @GetMapping("/haha")
    public String haha() {
        System.out.println(proxy.haha());
        return "hi every body";
    }
}
