package com.nicenpc.kotlincrud.application.member.dao

import com.nicenpc.kotlincrud.domain.member.entity.MemberDomain
import org.springframework.stereotype.Repository
import java.util.Optional

@Repository
class MemberDaoImpl : MemberDao {

    lateinit var memberRepository: MemberEntityRepository


    override fun create(memberDomain: MemberDomain): MemberDomain {
        val entity = convert(memberDomain)
        val save = memberRepository.save(entity)
        return convert(save)
    }

    override fun update(memberDomain: MemberDomain): MemberDomain {
        val entity = convert(memberDomain)
        val save = memberRepository.save(entity)
        return convert(save)
    }

    override fun delete(id: Long) {
        memberRepository.deleteById(id)
    }

    override fun findById(id: Long): Optional<MemberDomain> {
        return memberRepository.findById(id).map { entity ->
            convert(entity)
        }
    }

    fun convert(memberDomain: MemberDomain): MemberEntity {
        return MemberEntity(
            id = memberDomain.id,
            name = memberDomain.name,
            age = memberDomain.age
        )
    }

fun convert(entity: MemberEntity): MemberDomain {
    return MemberDomain(
        id = entity.id,
        name = entity.name,
        age = entity.age
    )
}

}