package com.example.seisan.Controller.Form;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * Formのスーパークラス
 */
@Getter
@Setter
public class FM00_CommonForm {
    // ID
    private int id;

    // 削除フラグ
    private int isDeleted;

    // 作成日時
    private LocalDateTime createdDate;
    
    // 更新日時
    private LocalDateTime updatedDate;
}
