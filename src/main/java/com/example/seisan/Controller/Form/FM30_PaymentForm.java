package com.example.seisan.Controller.Form;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * db30_paymentsのForm
 */
@Getter
@Setter
public class FM30_PaymentForm extends FM00_CommonForm {
    // 支払タイトル
    private String title;

    // 支払金額
    private Integer amount;

    // 支払日
    private LocalDate date;

    // イベント
    private FM10_EventForm eventForm;
}
