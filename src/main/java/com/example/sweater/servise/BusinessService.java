package com.example.sweater.servise;

import com.example.sweater.db.SweaterRepository;
import com.example.sweater.model.Business;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class BusinessService {
    private SweaterRepository repository;

    public BusinessService(SweaterRepository repository) {
        this.repository = repository;
    }

    public Collection<Business> getBusiness() {
        return repository.getBusiness();
    }
}
