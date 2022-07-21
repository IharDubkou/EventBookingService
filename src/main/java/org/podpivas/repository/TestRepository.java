package org.podpivas.repository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jeasy.random.EasyRandom;
import org.podpivas.model.TestModel;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
@RequiredArgsConstructor
public class TestRepository {

    private final EasyRandom generator;

    public TestModel test() {
        log.debug("test repository");
        return generator.nextObject(TestModel.class);
    }
}
