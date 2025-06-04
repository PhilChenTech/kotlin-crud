package com.nicenpc.kotlincrud.application.member.dao

import org.springframework.data.jpa.repository.JpaRepository

interface MemberEntityRepository : JpaRepository<MemberEntity, Long> {
}