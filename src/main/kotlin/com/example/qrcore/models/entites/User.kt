package com.example.qrcore.models.entites

import org.hibernate.annotations.Table
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


@Entity
@Table(appliesTo = "user")
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Int? = null
    var first_name: String? = null
    var last_name: String? = null
    var email: String? = null
}