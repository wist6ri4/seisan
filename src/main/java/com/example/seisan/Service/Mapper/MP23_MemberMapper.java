package com.example.seisan.Service.Mapper;

import com.example.seisan.Controller.Form.FM23_MemberForm;
import com.example.seisan.Repository.Entity.ET23_Member;

import java.util.ArrayList;
import java.util.List;

/**
 * db23_membersのMapper
 */
public class MP23_MemberMapper {
    /**
     * ET23_MemberからFM23_MemberFormにマッピングするメソッド
     * @param entities DBから取得したEntity
     * @return マッピングしたForm
     */
    public List<FM23_MemberForm> setForm(List<ET23_Member> entities) {
        List<FM23_MemberForm> forms = new ArrayList<>();
        for(ET23_Member entity : entities) {
            FM23_MemberForm form = new FM23_MemberForm();

            // メンバーID
            form.setId(entity.getId());
            // レート
            form.setRate(entity.getRate());
            // 金額固定フラグ
            form.setIsAmountFixed(entity.getIsAmountFixed());
            // 実支払金額
            form.setAmount(entity.getAmount());
            // イベント
            form.setEvent(entity.getEvent());
            // グローバルメンバー
            form.setGlobalMember(entity.getGlobalMember());
            // 削除フラグ
            form.setIsDeleted(entity.getIsDeleted());
            // 作成日時
            form.setCreatedDate(entity.getCreatedDate());
            // 更新日時
            form.setUpdatedDate(entity.getUpdatedDate());

            forms.add(form);
        }
        return forms;
    }

    /**
     * FM23_MemberFormからET23_Memberにマッピングするメソッド
     * @param form Serviceから取得したForm
     * @return マッピングしたEntity
     */
    public ET23_Member setEntity(FM23_MemberForm form) {
        ET23_Member entity = new ET23_Member();

        // メンバーID
        entity.setId(form.getId());
        // レート
        entity.setRate(form.getRate());
        // 金額固定フラグ
        entity.setIsAmountFixed(form.getIsAmountFixed());
        // 実支払金額
        entity.setAmount(form.getAmount());
        // イベント
        entity.setEvent(form.getEvent());
        // グローバルメンバー
        entity.setGlobalMember(form.getGlobalMember());
        // 削除フラグ
        entity.setIsDeleted(form.getIsDeleted());

        return entity;
    }
}
