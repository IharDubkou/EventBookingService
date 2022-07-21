package org.podpivas.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.podpivas.model.TestModel;
import org.podpivas.repository.TestRepository;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class TestService {

    private final TestRepository testRepository;

    public TestModel test() {
        log.debug("test service");
        return testRepository.test();
    }
}
