package com.api.goodjobbuddy.kt.entity.embed

import jakarta.persistence.Column
import jakarta.persistence.Embeddable

@Embeddable
class Address(
    @Column(name = "ADDRESS")
    var address: String,
    @Column(name = "DETAILED_ADDRESS")
    var detailedAddress: String,
    @Column(name = "ZIPCODE")
    var zipcode: String
)