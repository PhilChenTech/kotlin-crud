package com.nicenpc.kotlincrud.application.member.service.update

class UpdateMemberCommand {
    val id: Long
    val name: String
    val age: Int

    constructor(id: Long, name: String, age: Int) {
        this.id = id
        this.name = name
        this.age = age
    }

}
