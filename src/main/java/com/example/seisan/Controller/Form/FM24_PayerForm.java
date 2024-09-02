package com.example.seisan.Controller.Form;

import com.example.seisan.Repository.Entity.ET23_Member;
import com.example.seisan.Repository.Entity.ET30_Payment;
import lombok.Getter;
import lombok.Setter;

/**
 * db24_PayerのForm
 */
@Getter
@Setter
public class FM24_PayerForm extends FM00_CommonForm {
    // 支払
    private ET30_Payment payment;
    // 支払メンバー
    private ET23_Member member;
}
