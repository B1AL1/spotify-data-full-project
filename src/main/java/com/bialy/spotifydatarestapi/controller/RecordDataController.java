package com.bialy.spotifydatarestapi.controller;

import com.bialy.spotifydatarestapi.model.RecordData;
import com.bialy.spotifydatarestapi.service.RecordDataService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/data")
@AllArgsConstructor
public class RecordDataController {
    private final RecordDataService recordDataService;

    @GetMapping
    public List<RecordData> fetchAllRecordData(){
        return recordDataService.getAllRecordData();
    }
}
