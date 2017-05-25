package com.eccom.demo.user.feign;

import com.eccom.demo.user.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "microservice-user")
public interface UserFeignClient {
  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  User findById(@PathVariable("id") Long id);

  /*@RequestMapping(value = "/get", method = RequestMethod.GET)
  User get1(@RequestParam("id") Long id, @RequestParam("username") String username);*/
}
