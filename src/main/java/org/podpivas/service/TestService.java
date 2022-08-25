package org.podpivas.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.podpivas.model.TestModel;
import org.podpivas.repository.TestRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class TestService {

    private final TestRepository testRepository;
    private final List<IHandler> handlers;
    private final RestTemplate restTemplate;

    public TestModel test() {
        handlers.forEach(IHandler::handle);
        log.debug("test service");
        return testRepository.test();
    }
    @Scheduled(fixedRate = 10000)
    public void testLoadBalanced() {
        log.info("Response = " + restTemplate.getForObject("http://booking-service/test/prop", String.class));
    }
}
