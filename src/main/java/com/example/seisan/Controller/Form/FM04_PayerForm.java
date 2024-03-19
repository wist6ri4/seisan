package com.example.seisan.Controller.Form;

import com.example.seisan.Repository.Entity.ET23_Member;
import com.example.seisan.Repository.Entity.ET30_Payment;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * FM04_PayerForm
 */
@Getter
@Setter
public class FM04_PayerForm {
    // 支払者ID
    private int id;
    // 支払
    private ET30_Payment Payment;
    // 支払メンバー
    private ET23_Member Member;
    // 削除フラグ
    private int isDeleted;
    // 作成日時
    private LocalDateTime createdDate;
    // 更新日時
    private LocalDateTime updatedDate;
}
