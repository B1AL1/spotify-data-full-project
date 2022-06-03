package com.bialy.spotifydatarestapi.repository;

import com.bialy.spotifydatarestapi.model.RecordData;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecordDataRepository extends MongoRepository<RecordData, String> {
}
