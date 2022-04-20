package com.example.qrcore.models.entites

import org.hibernate.annotations.Table
import org.springframework.format.annotation.DateTimeFormat
import java.util.*
import javax.persistence.*

@Entity
@Table(appliesTo = "queue")
class Queue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Int? = null
    @Column(name = "room_id")
    var roomId: Int = 0
    @Column(name = "department_id")
    var departmentId: Int = 0
    @Column(name = "user_id")
    var userId: Int = 0
    var description: String? = null

    @Column(name = "created_at")
    var createdAt: Date? = null


//    relations
    @OneToOne(cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    @JoinColumn(name = "id", referencedColumnName = "user_id")
    var user: User? = null

    @OneToOne(cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    @JoinColumn(name = "id", referencedColumnName = "room_id")
    var room: Room? = null

    @OneToOne(cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    @JoinColumn(name = "id", referencedColumnName = "department_id")
    var department: Department? = null
}