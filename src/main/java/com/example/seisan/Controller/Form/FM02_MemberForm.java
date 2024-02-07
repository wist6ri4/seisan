package com.example.seisan.Controller.Form;

import com.example.seisan.Repository.Entity.ET01_Event;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * FM02_MemberForm
 */
@Getter
@Setter
public class FM02_MemberForm {
    // メンバーID
    private int id;
    // メンバー名
    private String name;
    // レート
    private float rate;
    // イベント
    private ET01_Event Event;
    // 削除フラグ
    private int isDeleted;
    // 作成日時
    private LocalDateTime createdDate;
    // 更新日時
    private LocalDateTime updatedDate;
}
