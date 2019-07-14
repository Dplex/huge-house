package com.example.huge.house.study

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EntityScan(basePackages = ["com.example.huge.house.study.repository.model"])
@EnableJpaRepositories(basePackages = ["com.example.huge.house.study.repository"])
class StudyApplication

fun main(args: Array<String>) {
	runApplication<StudyApplication>(*args)
}
