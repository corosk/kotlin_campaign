package com.ticket.campaign

data class Task(val id: Long,
                val content: String,
                val done: Boolean,
                val del: Boolean)