package org.podpivas.api.rest;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.podpivas.model.TestModel;
import org.podpivas.service.TestService;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;

@RestController
@RequestMapping("/test")
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@Slf4j
@RequiredArgsConstructor
public class TestLoggingController {

    private final TestService testService;
    private final Environment environment;

    @GetMapping
    public TestModel test() {
        log.debug("test controller");
        return testService.test();
    }

    @GetMapping("/prop")
    public String testProp() {
        return String.join(",", environment.getActiveProfiles());
    }
}
