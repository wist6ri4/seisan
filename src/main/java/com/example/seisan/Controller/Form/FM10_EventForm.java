package com.example.seisan.Controller.Form;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * db10_EventのForm
 */
@Getter
@Setter
public class FM10_EventForm extends FM00_CommonForm {
    // イベントタイトル
    private String title;
    // イベント概要
    private String description;
    // 日付
    private LocalDate date;
    // Notionリンク
    private String notionLink;
}
