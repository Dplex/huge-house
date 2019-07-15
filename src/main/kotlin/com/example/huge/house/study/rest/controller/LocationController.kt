package com.example.huge.house.study.rest.controller

import com.example.huge.house.study.service.LocationService
import com.example.huge.house.study.repository.model.LocationVo
import com.example.huge.house.study.rest.request.LocationRequest
import com.example.huge.house.study.rest.response.SimpleResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class LocationController(
        @Autowired val locationService: LocationService

) {

    @GetMapping("/location/{id}")
    @ResponseBody
    fun getLocation(@PathVariable("id")id: String) :ResponseEntity<LocationVo> {
        return locationService.getLocationById(id)
    }

    @PostMapping("location")
    @ResponseBody
    fun insertLocation(@RequestBody locationRequest: LocationRequest) :ResponseEntity<SimpleResponse> {
        return locationService.saveLocation(locationRequest)
    }

}