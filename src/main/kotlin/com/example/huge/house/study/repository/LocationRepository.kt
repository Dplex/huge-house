package com.example.huge.house.study.repository

import com.example.huge.house.study.repository.model.Location
import org.springframework.data.repository.CrudRepository

interface LocationRepository: CrudRepository<Location, Long>{

    fun findByUserId(userId : String) : List<Location>

}


