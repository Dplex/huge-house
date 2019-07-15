package com.example.huge.house.study.service

import com.example.huge.house.study.converter.LocationConverter
import com.example.huge.house.study.repository.LocationRepository
import com.example.huge.house.study.repository.model.LocationVo
import com.example.huge.house.study.rest.request.LocationRequest
import com.example.huge.house.study.rest.response.SimpleResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class LocationService(
        @Autowired val locationRepository: LocationRepository
) {
    fun getLocationById(id: String): ResponseEntity<LocationVo> {
        val location = locationRepository.findByUserId(id)

        return ResponseEntity.ok(location.get(0))
    }

    fun saveLocation(locationRequest: LocationRequest): ResponseEntity<SimpleResponse> {

        val locationVo = LocationConverter.convertRequestToVo(locationRequest)

        val vo = locationRepository.save(locationVo)

        return ResponseEntity.ok(SimpleResponse(vo.ID!!, "SUCCESS"))
    }


}