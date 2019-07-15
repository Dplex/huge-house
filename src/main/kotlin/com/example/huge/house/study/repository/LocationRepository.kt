package com.example.huge.house.study.repository

import com.example.huge.house.study.repository.model.LocationVo
import org.springframework.data.repository.CrudRepository

interface LocationRepository: CrudRepository<LocationVo, Long>{

    fun findByUserId(userId : String): List<LocationVo>

}


