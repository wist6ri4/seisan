package com.example.seisan.Service.Mapper;

import com.example.seisan.Controller.Form.FM05_PayeeForm;
import com.example.seisan.Repository.Entity.ET25_Payee;

import java.util.ArrayList;
import java.util.List;

/**
 * db05_payeesのMapper
 */
public class MP05_PayeeMapper {
    /**
     * ET05_PayerからFM05_PayerFormにマッピングするメソッド
     * @param entities DBから取得したEntity
     * @return マッピングしたForm
     */
    public List<FM05_PayeeForm> setForm(List<ET25_Payee> entities) {
        List<FM05_PayeeForm> forms = new ArrayList<>();
        for(ET25_Payee entity : entities) {
            FM05_PayeeForm form = new FM05_PayeeForm();
            // 支払者ID
            form.setId(entity.getId());
            // 支払
            form.setPayment(entity.getPayment());
            // メンバー
            form.setMember(entity.getMember());
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
     * FM05_PaymentFormからET05_Payerにマッピングするメソッド
     * @param form Serviceから取得したForm
     * @return マッピングしたEntity
     */
    public ET25_Payee setEntity(FM05_PayeeForm form) {
        ET25_Payee entity = new ET25_Payee();
        // 支払者ID
        entity.setId(form.getId());
        // 支払
        entity.setPayment(form.getPayment());
        // メンバー
        entity.setMember(form.getMember());
        // 削除フラグ
        entity.setIsDeleted(form.getIsDeleted());
        // 作成日時
        if(form.getCreatedDate() == null) {
            entity.setCreatedDate(form.getCreatedDate());
        }
        // 更新日時
        if(form.getUpdatedDate() == null) {
            entity.setUpdatedDate(form.getUpdatedDate());
        }
        return entity;
    }
}
