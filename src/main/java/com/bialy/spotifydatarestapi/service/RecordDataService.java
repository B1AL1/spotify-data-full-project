package com.bialy.spotifydatarestapi.service;

import com.bialy.spotifydatarestapi.model.RecordData;
import com.bialy.spotifydatarestapi.repository.RecordDataRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RecordDataService {
    private final RecordDataRepository recordDataRepository;


    public List<RecordData> getAllRecordData() {
        return recordDataRepository.findAll();
    }
}
