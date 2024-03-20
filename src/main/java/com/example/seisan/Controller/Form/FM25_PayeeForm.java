package com.example.seisan.Controller.Form;

import com.example.seisan.Repository.Entity.ET23_Member;
import com.example.seisan.Repository.Entity.ET30_Payment;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * db25_PayeeのForm
 */
@Getter
@Setter
public class FM25_PayeeForm extends FM00_CommonForm {
    // 支払
    private ET30_Payment payment;
    // 被支払メンバー
    private ET23_Member member;
}
