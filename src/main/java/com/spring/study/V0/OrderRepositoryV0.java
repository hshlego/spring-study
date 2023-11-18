package com.spring.study.V0;

import lombok.RequiredArgsConstructor;

@org.springframework.stereotype.Repository
@RequiredArgsConstructor
public class OrderRepositoryV0 {

    public void save(String itemId) {
        if ("ex".equals(itemId)) {
            throw new IllegalStateException("Exception happened");
        }
        sleep(1000);
    }

    public void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
