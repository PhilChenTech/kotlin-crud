package com.nicenpc.kotlincrud.application.member.controller

import com.nicenpc.kotlincrud.application.member.controller.create.CreateMemberRequest
import com.nicenpc.kotlincrud.application.member.service.create.CreateMemberApplicationService
import com.nicenpc.kotlincrud.application.member.service.create.CreateMemberCommand
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping


@RequestMapping("/member")
class MemberController {


    private lateinit var createMemberApplicationService: CreateMemberApplicationService

    @PostMapping
    fun createMember(@RequestBody createMemberRequest: CreateMemberRequest) {
        createMemberApplicationService.execute(CreateMemberCommand(createMemberRequest.name, createMemberRequest.age))
    }

}