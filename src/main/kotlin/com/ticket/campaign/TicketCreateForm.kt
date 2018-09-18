package com.ticket.campaign

import org.hibernate.validator.constraints.NotBlank
import javax.validation.constraints.Size

class TicketCreateForm {
    @NotBlank
    var id: String? = null

    @NotBlank
    var numbers: List<Ticket>? = null
}