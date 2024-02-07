package com.example.seisan.Controller.Form;

import com.example.seisan.Repository.Entity.ET01_Event;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class FM03_PaymentForm {
    // 支払ID
    private int id;
    // 支払タイトル
    private String title;
    // 支払金額
    private int amount;
    // 支払日
    private LocalDate date;
    // イベント
    private ET01_Event Event;
    // 削除フラグ
    private int isDeleted;
    // 作成日時
    private LocalDateTime createdDate;
    // 更新日時
    private LocalDateTime updatedDate;
}
