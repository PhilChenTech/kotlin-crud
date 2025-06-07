package com.nicenpc.kotlincrud.application.member.service.findbycondition

interface FindMemberByConditionService {

    fun execute(findMemberByConditionQuery: FindMemberByConditionQuery): FindMemberByConditionResult

}