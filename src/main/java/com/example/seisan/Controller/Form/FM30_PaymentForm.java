package com.example.seisan.Controller.Form;

import com.example.seisan.Repository.Entity.ET10_Event;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * db30_PaymentのForm
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
    private ET10_Event event;
}
