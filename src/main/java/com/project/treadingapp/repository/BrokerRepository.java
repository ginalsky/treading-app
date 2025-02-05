package com.project.treadingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.treadingapp.model.Broker;

@Repository
public interface BrokerRepository extends JpaRepository<Broker, Long> {

}
