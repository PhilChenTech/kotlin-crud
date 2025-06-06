package com.nicenpc.kotlincrud.application.member.controller

import com.nicenpc.kotlincrud.application.member.controller.create.CreateMemberRequest
import com.nicenpc.kotlincrud.application.member.controller.upadate.UpdateMemberRequest
import com.nicenpc.kotlincrud.application.member.service.update.UpdateMemberApplicationService
import com.nicenpc.kotlincrud.application.member.service.create.CreateMemberApplicationService
import com.nicenpc.kotlincrud.application.member.service.create.CreateMemberCommand
import com.nicenpc.kotlincrud.application.member.service.update.UpdateMemberCommand
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/member")
class MemberController {
    private lateinit var createMemberApplicationService: CreateMemberApplicationService
    private lateinit var updateMemberApplicationService: UpdateMemberApplicationService

    @PostMapping
    fun createMember(@RequestBody createMemberRequest: CreateMemberRequest) {
        createMemberApplicationService.execute(CreateMemberCommand(createMemberRequest.name, createMemberRequest.age))
    }

    @PutMapping("{id}")
    fun createMember(@PathVariable id: Long, @RequestBody updateMemberRequest: UpdateMemberRequest) {
        updateMemberApplicationService.execute(
            UpdateMemberCommand(
                id,
                updateMemberRequest.name,
                updateMemberRequest.age
            )
        )
    }

}