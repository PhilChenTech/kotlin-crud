package com.nicenpc.kotlincrud.application.member.dao

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     var id: Long? = null
     var name: String? = null
     var age: Int? = null

    override fun toString(): String {
        return "MemberEntity(id=$id, name=$name, age=$age)"
    }
}