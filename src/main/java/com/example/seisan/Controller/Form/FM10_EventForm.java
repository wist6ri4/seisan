package com.example.seisan.Controller.Form;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.time.LocalDate;

/**
 * db10_eventsのForm
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

    // イベントタグ
    private List<FM12_EventRelationForm> eventRelationForms;

    // Transient Parameter
    // イベント人数
    private Long memberCount;
}
