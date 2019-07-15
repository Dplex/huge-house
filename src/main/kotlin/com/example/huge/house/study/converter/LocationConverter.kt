package com.example.huge.house.study.converter

import com.example.huge.house.study.repository.model.LocationVo
import com.example.huge.house.study.rest.request.LocationRequest

class LocationConverter {
    companion object {
        fun convertRequestToVo(locationRequest: LocationRequest): LocationVo {
            return LocationVo(null, locationRequest.userId, locationRequest.latitude, locationRequest.longitude)
        }
    }
}