package com.ticket.campaign

import org.springframework.http.HttpStatus
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping("campaign")
class CampaignController(private val campaignRepository: CampaignRepository) {

    @GetMapping("input")
    fun input(form: TicketCreateForm,
              model: Model): String {
        val campaign :Campaign = campaignRepository.create(form.id,form.numbers)
        model.addAttribute("campaign", campaign)
        return "campaign/index"
    }

    @GetMapping("update")
    fun update(form: TicketUpdateForm,
              model: Model): String {
        val updateCampaign :Campaign = Campaign(form.id,form.numbers,false)
        val campaign : Campaign = campaignRepository.update(updateCampaign)
        return "campaign/index"
    }

    @GetMapping("confirm")
    fun confirm(form: TicketConfirmForm,
                model: Model): String {
        val campaign : Campaign? = campaignRepository.confirm(form.id)
        return "campaign/index"
    }

    @GetMapping("list")
    fun list(model: Model): String {
        val winning : Winning = campaignRepository.findForWinningNumber()
        return "campaign/list"
    }

    @ExceptionHandler(NotFoundException::class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    fun handleNotFoundException(): String = "campaing/not_found"
}