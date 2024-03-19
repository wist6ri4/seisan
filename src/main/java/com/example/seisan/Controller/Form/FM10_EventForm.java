package com.example.seisan.Controller.Form;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * FM10_EventForm
 */
@Getter
@Setter
public class FM10_EventForm {
    // イベントID
    private int id;
    // イベントタイトル
    private String title;
    // イベント概要
    private String description;
    // 日付
    private LocalDate date;
    // Notionリンク
    private String notionLink;
    // 削除フラグ
    private int isDeleted;
    // 作成日時
    private LocalDateTime createdDate;
    // 更新日時
    private LocalDateTime updatedDate;
}
