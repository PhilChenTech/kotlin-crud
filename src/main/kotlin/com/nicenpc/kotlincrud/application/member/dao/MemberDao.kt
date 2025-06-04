package com.nicenpc.kotlincrud.application.member.dao

import com.nicenpc.kotlincrud.domain.member.entity.MemberDomain

interface MemberDao {
    fun create(memberDomain: MemberDomain)
    fun update(memberDomain: MemberDomain)
    fun delete(id: Long)
    fun findById(id: Long): MemberDomain?
}