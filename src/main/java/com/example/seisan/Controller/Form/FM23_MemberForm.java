package com.example.seisan.Controller.Form;

import com.example.seisan.Repository.Entity.ET10_Event;
import lombok.Getter;
import lombok.Setter;

/**
 * db23_membersのForm
 */
@Getter
@Setter
public class FM23_MemberForm extends FM00_CommonForm {
    // レート
    private float rate;

    // 金額固定フラグ
    private Integer isAmountFixed;

    // 実支払金額
    private Integer amount;

    // イベント
    private ET10_Event event;

    // グローバルメンバー
    private FM20_GlobalMemberForm globalMemberForm;
}
