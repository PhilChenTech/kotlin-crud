package com.nicenpc.kotlincrud.application.member.controller

import com.nicenpc.kotlincrud.application.member.controller.create.CreateMemberRequest
import com.nicenpc.kotlincrud.application.member.controller.findbycondition.FindMemberByCondition
import com.nicenpc.kotlincrud.application.member.controller.upadate.UpdateMemberRequest
import com.nicenpc.kotlincrud.application.member.service.create.CreateMemberApplicationService
import com.nicenpc.kotlincrud.application.member.service.create.CreateMemberCommand
import com.nicenpc.kotlincrud.application.member.service.findbycondition.FindMemberByConditionQuery
import com.nicenpc.kotlincrud.application.member.service.findbycondition.FindMemberByConditionService
import com.nicenpc.kotlincrud.application.member.service.update.UpdateMemberApplicationService
import com.nicenpc.kotlincrud.application.member.service.update.UpdateMemberCommand
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/member")
class MemberController {
    private lateinit var createMemberApplicationService: CreateMemberApplicationService
    private lateinit var updateMemberApplicationService: UpdateMemberApplicationService
    private lateinit var findMemberByConditionService: FindMemberByConditionService

    @PostMapping("v1")
    fun createMember(@RequestBody createMemberRequest: CreateMemberRequest) {
        createMemberApplicationService.execute(CreateMemberCommand(createMemberRequest.name, createMemberRequest.age))
    }

    @PutMapping("v1/{id}")
    fun createMember(@PathVariable id: Long, @RequestBody updateMemberRequest: UpdateMemberRequest) {
        val updateMemberCommand = UpdateMemberCommand(
            id,
            updateMemberRequest.name,
            updateMemberRequest.age
        )
        updateMemberApplicationService.execute(
            updateMemberCommand
        )
    }

    @PostMapping("v1/findByCondition")
    fun findByCondition(@RequestBody findMemberByCondition: FindMemberByCondition) {
        val findMemberByConditionQuery = FindMemberByConditionQuery(
            findMemberByCondition.id,
            findMemberByCondition.name,
            findMemberByCondition.age
        )
        findMemberByConditionService.execute(
            findMemberByConditionQuery
        )
    }

}