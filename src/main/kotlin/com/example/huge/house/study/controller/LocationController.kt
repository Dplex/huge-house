package com.example.huge.house.study.controller

import com.example.huge.house.study.Service.LocationService
import com.example.huge.house.study.repository.model.Location
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class LocationController(
        @Autowired val locationService: LocationService

) {

    @GetMapping("/location/{id}")
    @ResponseBody
    fun getLocation(@PathVariable("id")id: String) :ResponseEntity<Location> {
        return locationService.getLocationById(id)
    }

}