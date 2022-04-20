package com.example.qrcore.models.entites

import org.hibernate.annotations.Table
import javax.persistence.*

@Entity
@Table(appliesTo = "department")
class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Int? = null
    var name: String? = null
    var description: String? = null

    @OneToOne(cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id", referencedColumnName = "id")
    var queue: Queue? = null
}