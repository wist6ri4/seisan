package com.example.seisan.Service.Mapper;

import com.example.seisan.Controller.Form.FM20_GlobalMemberForm;
import com.example.seisan.Repository.Entity.ET20_GlobalMember;

import java.util.ArrayList;
import java.util.List;

/**
 * db20_globals_membersのMapper
 */
public class MP20_GlobalMemberMapper {
    /**
     * ET20_GlobalMemberからFM20_GlobalMemberFormにマッピングするメソッド
     * @param entities DBから取得したEntity
     * @return マッピングしたForm
     */
    public List<FM20_GlobalMemberForm> setForm(List<ET20_GlobalMember> entities) {
        List<FM20_GlobalMemberForm> forms = new ArrayList<>();
        for(ET20_GlobalMember entity : entities) {
            FM20_GlobalMemberForm form = new FM20_GlobalMemberForm();

            // グローバルメンバーID
            form.setId(entity.getId());
            // グローバルメンバー名
            form.setName(entity.getName());
            // 姓
            form.setFamilyName(entity.getFamilyName());
            // 名
            form.setLastName(entity.getLastName());
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
     * FM20_GlobalMemberFormからET20_GlobalMemberにマッピングするメソッド
     * @param form Serviceから取得したForm
     * @return マッピングしたEntity
     */
    public ET20_GlobalMember setEntity(FM20_GlobalMemberForm form) {
        ET20_GlobalMember entity = new ET20_GlobalMember();

        // グローバルメンバーID
        entity.setId(form.getId());
        // グローバルメンバー名
        entity.setName(form.getName());
        // 姓
        entity.setFamilyName(form.getFamilyName());
        // 名
        entity.setLastName(form.getLastName());
        // 削除フラグ
        entity.setIsDeleted(form.getIsDeleted());

        return entity;
    }
}
