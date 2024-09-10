package com.example.seisan.Controller.Form;

import lombok.Getter;
import lombok.Setter;

/**
 * db25_payeesのForm
 */
@Getter
@Setter
public class FM25_PayeeForm extends FM00_CommonForm {
    // 支払
    private FM30_PaymentForm paymentForm;

    // 被支払メンバー
    private FM23_MemberForm memberForm;
}
