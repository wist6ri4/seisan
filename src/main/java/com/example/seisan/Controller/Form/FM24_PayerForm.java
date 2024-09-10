package com.example.seisan.Controller.Form;

import lombok.Getter;
import lombok.Setter;

/**
 * db24_payersのForm
 */
@Getter
@Setter
public class FM24_PayerForm extends FM00_CommonForm {
    // 支払
    private FM30_PaymentForm paymentForm;

    // 支払メンバー
    private FM23_MemberForm memberForm;
}
