package com.example.seisan.Service.Mapper;

import com.example.seisan.Controller.Form.FM02_MemberForm;
import com.example.seisan.Repository.Entity.ET23_Member;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * db02_membersのMapper
 */
public class MP02_MemberMapper {
    /**
     * ET02_MemberからFM02_MemberFormにマッピングするメソッド
     * @param entities DBから取得したEntity
     * @return マッピングしたForm
     */
    public List<FM02_MemberForm> setForm(List<ET23_Member> entities) {
        List<FM02_MemberForm> forms = new ArrayList<>();
        for(ET23_Member entity : entities) {
            FM02_MemberForm form = new FM02_MemberForm();
            // メンバーID
            form.setId(entity.getId());
            // メンバー名
            form.setName(entity.getName());
            // レート
            form.setRate(entity.getRate());
            // イベント
            form.setEvent(entity.getEvent());
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
     * FM02_MemberFormからET02_Memberにマッピングするメソッド
     * @param form Serviceから取得したForm
     * @return マッピングしたEntity
     */
    public ET23_Member setEntity(FM02_MemberForm form) {
        ET23_Member entity = new ET23_Member();
        // メンバーID
        entity.setId(form.getId());
        // メンバー名
        entity.setName(form.getName());
        // レート
        entity.setRate(form.getRate());
        // イベント
        entity.setEvent(form.getEvent());
        // 削除フラグ
        entity.setIsDeleted(form.getIsDeleted());
        // 作成日時
        if(form.getCreatedDate() == null) {
            entity.setCreatedDate(LocalDateTime.now());
        }
        // 更新日時
        if(form.getUpdatedDate() == null) {
            entity.setUpdatedDate(LocalDateTime.now());
        }
        return entity;
    }
}
