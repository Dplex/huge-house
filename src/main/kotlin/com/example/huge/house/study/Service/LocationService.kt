package com.example.huge.house.study.Service

import com.example.huge.house.study.repository.LocationRepository
import com.example.huge.house.study.repository.model.Location
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class LocationService(
        @Autowired val locationRepository: LocationRepository
) {
    fun getLocationById(id: String): ResponseEntity<Location> {
        val location = locationRepository.findByUserId(id)

        return ResponseEntity.ok(location.get(0))
    }


}