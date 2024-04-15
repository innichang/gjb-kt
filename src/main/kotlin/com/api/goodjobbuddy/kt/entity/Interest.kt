package com.api.goodjobbuddy.kt.entity

import jakarta.persistence.*

@Entity
@Table(name = "INTEREST")
class Interest (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    val id: Long?,
    @Column(name = "TOPIC")
    val topic: String,
) : BaseEntity()