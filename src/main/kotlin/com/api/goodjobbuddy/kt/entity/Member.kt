package com.api.goodjobbuddy.kt.entity

import com.api.goodjobbuddy.kt.constant.*
import com.api.goodjobbuddy.kt.entity.embed.Address
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "MEMBER")
data class Member(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    val id: Long?,
    @Column(name = "NICKNAME")
    var nickname: String,
    @Column(name = "EMAIL")
    var email: String,
    @Column(name = "PASSWORD")
    var password: String,
    @Column(name = "PASSWORD_CHANGED_AT")
    var passwordChangeAt: LocalDateTime,
    @Column(name = "GENDER")
    @Enumerated(EnumType.STRING)
    var gender: Gender,
    @Column(name = "PROVIDER")
    @Enumerated(EnumType.STRING)
    var provider: Provider,
    @Column(name = "PHONE", length = 11)
    var phone: String,
    @Column(name = "BIRTHDAY")
    var birthday: String,
    @Embedded
    var address: Address,
    @Column(name = "MARITAL_STATUS")
    @Enumerated(EnumType.STRING)
    var maritalStatus: MaritalStatus,
    @Column(name = "LIVING_ARRANGEMENT")
    @Enumerated(EnumType.STRING)
    var livingArrangement: LivingArrangement,
    @Column(name = "BABY_STATUS")
    @Enumerated(EnumType.STRING)
    var babyStatus: BabyStatus,
    @Column(name = "RESIDENTIAL_SITUATION")
    @Enumerated(EnumType.STRING)
    var residentialSituation: ResidentialSituation,
    @Column(name = "FCM_TOKEN")
    var fcmToken: String,
    @Column(name = "BILLING_KEY")
    var billingKey: String,
    @Column(name = "DELETED_AT")
    var deletedAt: LocalDateTime,
    @OneToMany(mappedBy = "member", cascade = [CascadeType.ALL])
    var interests: MutableList<MemberInterest>? = null,

    ) : BaseEntity() {

}