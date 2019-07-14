package com.example.huge.house.study.repository.model

import javax.persistence.*

@Entity
@Table(name = "tlocation", schema = "public")
data class Location(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "id")
        val ID: Long,

        @Column(name = "userid")
        val userId: String,

        @Column(name = "lat")
        val LAT: Float,

        @Column(name = "lon")
        val LON: Float
)