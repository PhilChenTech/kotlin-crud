package com.nicenpc.kotlincrud.application.member.dao

import com.nicenpc.kotlincrud.domain.member.entity.MemberDomain
import java.util.Optional

interface MemberDao {
    fun create(memberDomain: MemberDomain): MemberDomain
    fun update(memberDomain: MemberDomain): MemberDomain
    fun delete(id: Long)
    fun findById(id: Long): Optional<MemberDomain>
    fun findByCondition(findMemberByConditionDto:FindMemberByConditionDto): List<MemberDomain>
}