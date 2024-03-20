package com.example.seisan.Service.Mapper;

import com.example.seisan.Controller.Form.FM22_GlobalMemberRelationForm;
import com.example.seisan.Repository.Entity.ET22_GlobalMemberRelation;

import java.util.ArrayList;
import java.util.List;

/**
 * db22_globals_members_tagsのMapper
 */
public class MP22_GlobalMemberRelationMapper {
    /**
     * ET22_GlobalMemberRelationからFM22_GlobalMemberRelationFormにマッピングするメソッド
     * @param entities DBから取得したEntity
     * @return マッピングしたForm
     */
    public List<FM22_GlobalMemberRelationForm> setForm(List<ET22_GlobalMemberRelation> entities) {
        List<FM22_GlobalMemberRelationForm> forms = new ArrayList<>();
        for(ET22_GlobalMemberRelation entity : entities) {
            FM22_GlobalMemberRelationForm form = new FM22_GlobalMemberRelationForm();

            // グローバルメンバー連関ID
            form.setId(entity.getId());
            // グローバルメンバーID
            form.setGlobalMemberId(entity.getGlobalMemberId());
            // グローバルメンバータグ
            form.setGlobalMemberTag(entity.getGlobalMemberTag());
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
     * FM22_GlobalMemberRelationFormからET22_GlobalMemberRelationにマッピングするメソッド
     * @param form Serviceから取得したForm
     * @return マッピングしたEntity
     */
    public ET22_GlobalMemberRelation setEntity(FM22_GlobalMemberRelationForm form) {
        ET22_GlobalMemberRelation entity = new ET22_GlobalMemberRelation();

        // グローバルメンバー連関ID
        entity.setId(form.getId());
        // グローバルメンバーID
        entity.setGlobalMemberId(form.getGlobalMemberId());
        // グローバルメンバータグ
        entity.setGlobalMemberTag(form.getGlobalMemberTag());
        // 削除フラグ
        entity.setIsDeleted(form.getIsDeleted());

        return entity;
    }
}
