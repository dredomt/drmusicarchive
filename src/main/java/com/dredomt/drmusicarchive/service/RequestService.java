package com.dredomt.drmusicarchive.service;

import com.dredomt.drmusicarchive.model.Request;
import com.dredomt.drmusicarchive.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class RequestService {

    @Autowired
    private RequestRepository requestRepository;

    public Request saveRequest(Request request) {
        return requestRepository.save(request);
    }

    public List<Request> getAllRequests() {
        return requestRepository.findAll();
    }

    public Optional<Request> getRequestById(UUID id) {
        return requestRepository.findById(id);
    }

    public void deleteRequest(UUID id) {
        requestRepository.deleteById(id);
    }
}
