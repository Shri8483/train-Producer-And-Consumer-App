package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.TrainInfo;

@Repository
public interface TrainInfoRepository extends JpaRepository<TrainInfo, Integer>
{

	List<TrainInfo> findByTrainName(String trainName);

}
