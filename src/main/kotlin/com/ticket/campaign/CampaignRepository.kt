package com.ticket.campaign

interface CampaignRepository {

    fun create(id: String?,numbers: List<Ticket>?): Campaign

    fun update(campaign: Campaign): Campaign

    fun confirm(id: String): Campaign?

    fun findById(id: String): Campaign?

    fun findForWinningNumber(): Winning
}