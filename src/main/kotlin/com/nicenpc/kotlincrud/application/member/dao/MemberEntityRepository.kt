package com.nicenpc.kotlincrud.application.member.dao

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface MemberEntityRepository: JpaRepository<MemberEntity, Long> , JpaSpecificationExecutor<MemberEntity> {
}