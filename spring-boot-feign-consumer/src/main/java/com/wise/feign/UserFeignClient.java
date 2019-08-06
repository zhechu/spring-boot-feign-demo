package com.wise.feign;

import com.wise.entity.User;
import feign.Logger;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 用户远程调用
 */
@FeignClient(
        name = "${application.service.spring-boot-feign-provider.name}",
        url = "${application.service.spring-boot-feign-provider.url}")
public interface UserFeignClient {

    @GetMapping("/users/{id}")
    User findById(@PathVariable("id") Long id);

}