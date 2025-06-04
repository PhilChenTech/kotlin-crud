package com.nicenpc.kotlincrud.application.member.service.create

interface CreateMemberApplicationService {

    fun execute(createMemberCommand: CreateMemberCommand)
}