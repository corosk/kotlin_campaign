package com.ticket.campaign

import org.hibernate.validator.constraints.NotBlank
import javax.validation.constraints.Size

class TicketUpdateForm {
    @NotBlank
    var id: String? = null

    @NotBlank
    var numbers: List<Ticket>? = null
}