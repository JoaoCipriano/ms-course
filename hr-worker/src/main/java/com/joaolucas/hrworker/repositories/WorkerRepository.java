package com.joaolucas.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaolucas.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
