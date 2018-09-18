package com.ticket.campaign

interface TaskRepository {

    fun create(content: String): Task

    fun delete(id: String)

    fun update(task: Task)

    fun findAll(): List<Task>

    fun findAllForDelete(): List<Task>

    fun findById(id: Long): Task?

    fun findMatchInKeyword(keyword: String): List<Task>
}