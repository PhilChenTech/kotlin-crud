package com.nicenpc.kotlincrud.application.member.service.findbycondition

import com.nicenpc.kotlincrud.application.member.dao.FindMemberByConditionDto
import com.nicenpc.kotlincrud.application.member.dao.MemberDao
import org.springframework.stereotype.Service
import java.util.Collections

@Service
class FindMemberByConditionServiceImpl : FindMemberByConditionService {

    lateinit var memberDao: MemberDao

    override fun execute(findMemberByConditionQuery: FindMemberByConditionQuery): FindMemberByConditionResult {
        val findMemberByConditionDto = FindMemberByConditionDto(
            id = findMemberByConditionQuery.id,
            name = findMemberByConditionQuery.name,
            age = findMemberByConditionQuery.age
        )
        val memberDomainList = memberDao.findByCondition(findMemberByConditionDto)
        return FindMemberByConditionResult(
            Collections.emptyList()
        )
    }
}