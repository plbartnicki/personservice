package com.klb.service;

import org.springframework.stereotype.Service;

@Service
public class ComputingServiceImpl implements ComputingService {

    @Override
    public boolean isPrime(int n) {
        for(int k = 2; k <= Math.sqrt(n); k++) {
            if(n % k == 0) {
                return false;
            }
        }

        return true;
    }
}
