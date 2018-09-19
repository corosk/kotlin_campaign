package com.ticket.campaign

import org.hibernate.validator.constraints.NotBlank
import javax.validation.constraints.Size

class TicketConfirmForm {
    @NotBlank
    var id: String = ""
}