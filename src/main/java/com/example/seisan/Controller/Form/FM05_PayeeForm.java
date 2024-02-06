package com.example.seisan.Controller.Form;

import com.example.seisan.Repository.Entity.ET02_Member;
import com.example.seisan.Repository.Entity.ET03_Payment;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class FM05_PayeeForm {
    // 被支払者ID
    private int id;

    // 支払
    private ET03_Payment Payment;

    // 被支払メンバー
    private ET02_Member Member;

    // 削除フラグ
    private int isDeleted;

    // 作成日時
    private LocalDateTime createdDate;

    // 更新日時
    private LocalDateTime updatedDate;
}
