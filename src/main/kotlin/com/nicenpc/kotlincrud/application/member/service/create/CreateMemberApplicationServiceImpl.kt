package com.nicenpc.kotlincrud.application.member.service.create

import com.nicenpc.kotlincrud.domain.member.entity.MemberDomain
import io.micrometer.common.util.StringUtils
import org.springframework.stereotype.Service

@Service
class CreateMemberApplicationServiceImpl : CreateMemberApplicationService {

    override fun execute(createMemberCommand: CreateMemberCommand) {


        val age = createMemberCommand.age
        if (age< 0) {
            throw IllegalArgumentException("Age cannot be negative")
        }

        val name = createMemberCommand.name
        if (StringUtils.isEmpty(name)) {
            throw IllegalArgumentException("Name cannot be empty")
        }

        val memberDomain = MemberDomain(
            id = null, // 假設 ID 是自動生成的
            name = createMemberCommand.name,
            age = createMemberCommand.age
        )

        println(memberDomain)
    }
}