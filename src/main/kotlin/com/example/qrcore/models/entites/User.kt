package com.example.qrcore.models.entites

import org.hibernate.annotations.Table
import javax.persistence.*


@Entity
@Table(appliesTo = "user")
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Int? = null
    var first_name: String? = null
    var last_name: String? = null
    var email: String? = null

    @OneToOne(cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    var queue: Queue? = null


//    @OneToOne(mappedBy = "queue", cascade = CascadeType.ALL, optional = false, fetch = FetchType.LAZY)
//    private val userDetails: UserDetails? = null
}