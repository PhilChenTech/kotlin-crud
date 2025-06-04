package com.nicenpc.kotlincrud.domain.member.entity

class MemberDomain(
    private var id: Long?,
    private var name: String,
    private var age: Int?
) {
    fun getId(): Long? = id
    fun setId(value: Long?) { id = value }

    fun getName(): String = name
    fun setName(value: String) { name = value }

    fun getAge(): Int? = age
    fun setAge(value: Int?) { age = value }
}