package com.batch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;

@EnableTask
@SpringBootApplication
@EnableBatchProcessing
public class PartitionedBatchJobApplication {

	public static void main(String[] args) {
		SpringApplication.run(PartitionedBatchJobApplication.class, args);
	}
}