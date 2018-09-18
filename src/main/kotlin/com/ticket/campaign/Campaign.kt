package com.ticket.campaign

data class Campaign(val id: Long,
                    val numbers: List<Ticket>,
                    val del: Boolean)