package org.podpivas.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.podpivas.model.TestModel;
import org.podpivas.repository.TestRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class TestService {

    private final TestRepository testRepository;
    private final List<IHandler> handlers;

    public TestModel test() {
        handlers.forEach(IHandler::handle);
        log.debug("test service");
        return testRepository.test();
    }
}
