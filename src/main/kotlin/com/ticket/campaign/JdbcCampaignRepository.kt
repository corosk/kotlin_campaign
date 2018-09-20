package com.ticket.campaign

import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.RowMapper
import org.springframework.stereotype.Repository

@Repository
class JdbcCampaignRepository(private val jdbcTemplate: JdbcTemplate) :CampaignRepository{

/*    private val rowMapper = RowMapper<Campaign> { rs, _ ->
        Campaign(rs.get("id"), rs.getArray(), rs.getBoolean("done"), rs.getBoolean("del"))
    }*/

    override fun create(id: String?,numbers: List<Ticket>?): Campaign {
        var list:List<Ticket> = mutableListOf<Ticket>()
        return Campaign("",list, false)
    }

    override fun update(campaign:Campaign): Campaign {
        var list:List<Ticket> = mutableListOf<Ticket>()
        return Campaign("",list, false)
    }

    override fun confirm(id: String): Campaign? {
        var list:List<Ticket> = mutableListOf<Ticket>()
        return Campaign("",list, false)
    }

    override fun findById(id:String): Campaign {
        var list:List<Ticket> = mutableListOf<Ticket>()
        return Campaign("",list, false)
    }

    override fun findForWinningNumber(): Winning {
        return Winning(mutableListOf<Numbers>())
    }
}