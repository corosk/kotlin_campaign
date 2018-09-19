package com.ticket.campaign

interface CampaignRepository {

    fun create(id: String?,numbers: List<Ticket>?): Campaign

    fun update(campaign: Campaign): Campaign

    fun findById(id: String): Campaign?
}