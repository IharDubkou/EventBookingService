package org.podpivas.service;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(5)
public class SecondHandler implements IHandler {
}
