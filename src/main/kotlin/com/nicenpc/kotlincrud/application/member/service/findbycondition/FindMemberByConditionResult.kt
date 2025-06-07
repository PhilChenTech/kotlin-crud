package com.nicenpc.kotlincrud.application.member.service.findbycondition

data class FindMemberByConditionResult(
    val memberItemList: List<MemberItem>
) {
    data class MemberItem(
        val id: Long,
        val name: String,
        val age: Int)
}
