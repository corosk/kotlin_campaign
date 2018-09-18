package com.ticket.campaign

import org.hibernate.validator.constraints.NotBlank
import javax.validation.constraints.Size

class TaskSearchForm {
    @NotBlank
    var keyword: String? = null
}