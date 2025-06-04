package com.nicenpc.kotlincrud.application.member.dao

import com.nicenpc.kotlincrud.domain.member.entity.MemberDomain
import org.springframework.stereotype.Repository

@Repository
class MemberDaoImpl : MemberDao {

    lateinit var memberRepository: MemberEntityRepository


    override fun create(memberDomain: MemberDomain) {
        val memberEntity = MemberEntity()
        memberEntity.name = memberDomain.name
        memberEntity.age = memberDomain.age
        memberRepository.save(memberEntity)
    }

    override fun update(memberDomain: MemberDomain) {
        TODO("Not yet implemented")
    }

    override fun delete(id: Long) {
        TODO("Not yet implemented")
    }

    override fun findById(id: Long): MemberDomain? {
        TODO("Not yet implemented")
    }
}