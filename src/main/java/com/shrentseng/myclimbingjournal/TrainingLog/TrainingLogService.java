package com.shrentseng.myclimbingjournal.TrainingLog;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainingLogService {


    private TrainingLogRepository trainingLogRepository;

    @Autowired
    public TrainingLogService(TrainingLogRepository trainingLogRepository) {
        this.trainingLogRepository = trainingLogRepository;
    }


    public TrainingLog getTrainingLogById(Long id) {
        Optional<TrainingLog> dbTrainingLog =  trainingLogRepository.findById(id);

        if (dbTrainingLog.isPresent()) {
            return dbTrainingLog.get();
        }
        return null;
    }
    
    public void saveTrainingLog(TrainingLog trainingLog) {
        trainingLogRepository.save(trainingLog);
    }
}
