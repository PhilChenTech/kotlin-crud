package com.nicenpc.kotlincrud.application.member.service.update

import com.nicenpc.kotlincrud.application.member.dao.MemberDao
import com.nicenpc.kotlincrud.domain.member.entity.MemberDomain
import jakarta.persistence.EntityNotFoundException
import org.springframework.stereotype.Service

@Service
class UpdateMemberApplicationServiceImpl : UpdateMemberApplicationService {

    lateinit var memberDao: MemberDao

    override fun execute(updateMemberCommand: UpdateMemberCommand) {
        val memberDomain = findMemberOrThrow(updateMemberCommand.id)
        memberDomain.age = updateMemberCommand.age
        memberDomain.name = updateMemberCommand.name
        memberDao.update(memberDomain)
    }

    private fun findMemberOrThrow(id: Long): MemberDomain {
        return memberDao.findById(id)
            .orElseThrow { EntityNotFoundException("找不到 ID 為 $id 的成員") }
    }

}