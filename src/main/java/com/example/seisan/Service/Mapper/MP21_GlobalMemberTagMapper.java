package com.example.seisan.Service.Mapper;

import com.example.seisan.Controller.Form.FM21_GlobalMemberTagForm;
import com.example.seisan.Repository.Entity.ET21_GlobalMemberTag;

import java.util.ArrayList;
import java.util.List;

/**
 * db21_globals_members_tagsのMapper
 */
public class MP21_GlobalMemberTagMapper {
    /**
     * ET21_GlobalMemberTagからFM21_GlobalMemberTagFormにマッピングするメソッド
     * @param entities DBから取得したEntity
     * @return マッピングしたForm
     */
    public List<FM21_GlobalMemberTagForm> setForm(List<ET21_GlobalMemberTag> entities) {
        List<FM21_GlobalMemberTagForm> forms = new ArrayList<>();
        for(ET21_GlobalMemberTag entity : entities) {
            FM21_GlobalMemberTagForm form = new FM21_GlobalMemberTagForm();

            // グローバルメンバータグID
            form.setId(entity.getId());
            // グローバルメンバータグ名
            form.setTagName(entity.getTagName());
            // 色
            form.setColor(entity.getColor());
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
     * FM21_GlobalMemberTagFormからET21_GlobalMemberTagにマッピングするメソッド
     * @param form Serviceから取得したForm
     * @return マッピングしたEntity
     */
    public ET21_GlobalMemberTag setEntity(FM21_GlobalMemberTagForm form) {
        ET21_GlobalMemberTag entity = new ET21_GlobalMemberTag();

        // グローバルメンバータグID
        entity.setId(form.getId());
        // グローバルメンバータグ名
        entity.setTagName(form.getTagName());
        // 色
        entity.setColor(form.getColor());
        // 削除フラグ
        entity.setIsDeleted(form.getIsDeleted());

        return entity;
    }
}
