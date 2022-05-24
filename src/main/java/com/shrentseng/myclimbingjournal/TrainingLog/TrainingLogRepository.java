package com.shrentseng.myclimbingjournal.TrainingLog;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * TrainingLogRepository
 */
@Repository
public interface TrainingLogRepository extends JpaRepository<TrainingLog, Long> {
    
    
    Optional<TrainingLog> findById(Long id);
    
}