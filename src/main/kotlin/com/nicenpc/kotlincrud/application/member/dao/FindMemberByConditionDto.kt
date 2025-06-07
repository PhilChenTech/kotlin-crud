package com.nicenpc.kotlincrud.application.member.dao

data class FindMemberByConditionDto(
    val id: Long? = null,
    val name: String? = null,
    val age: Int? = null
)
