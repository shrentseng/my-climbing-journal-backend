package com.shrentseng.myclimbingjournal.TrainingLog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/training-logs")
public class TrainingLogController {

    private final TrainingLogService trainingLogService;

    @Autowired
    public TrainingLogController(TrainingLogService trainingLogService) {
        this.trainingLogService = trainingLogService;
    }

    @GetMapping("/{trainingLogId}")
    public TrainingLog getTrainingLogById(@PathVariable("trainingLogId") Long trainingLogId) {
        return trainingLogService.getTrainingLogById(trainingLogId);
    }

    @PostMapping("")
    public void createTrainingLog(@RequestBody TrainingLog trainingLog) {
        trainingLogService.saveTrainingLog(trainingLog);
    }

    
}
