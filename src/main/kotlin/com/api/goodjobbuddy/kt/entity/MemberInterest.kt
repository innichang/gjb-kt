package com.api.goodjobbuddy.kt.entity

import jakarta.persistence.*

@Entity
@Table(name = "MEMBER_INTEREST")
class MemberInterest (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    val id: Long?,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEMBER_ID")
    var member: Member,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INTEREST_ID")
    var interest: Interest
) : BaseEntity()