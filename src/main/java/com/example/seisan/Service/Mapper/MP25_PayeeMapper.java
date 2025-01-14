package com.example.seisan.Service.Mapper;

import com.example.seisan.Controller.Form.FM25_PayeeForm;
import com.example.seisan.Repository.Entity.ET25_Payee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * db25_payeesのMapper
 */
@Component
public class MP25_PayeeMapper {

    @Autowired
    MP23_MemberMapper memberMapper;

    @Autowired
    MP30_PaymentMapper paymentMapper;

    /**
     * ET25_PayeeからFM25_PayeeFormにマッピングするメソッド
     * @param entities DBから取得したEntity
     * @return マッピングしたForm
     */
    public FM25_PayeeForm setForms(ET25_Payee entity) {
        FM25_PayeeForm form = new FM25_PayeeForm();

        // 支払者ID
        form.setId(entity.getPayeeId());
        // 支払
        form.setPaymentForm(paymentMapper.setForm(entity.getPayment()));
        // メンバー
        form.setMemberForm(memberMapper.setForm(entity.getMember()));
        // 削除フラグ
        form.setIsDeleted(entity.getIsDeleted());
        // 作成日時
        form.setCreatedDate(entity.getCreatedDate());
        // 更新日時
        form.setUpdatedDate(entity.getUpdatedDate());

        return form;
    }

    /**
     * List<ET25_Payee>からList<FM25_PayeeForm>にマッピングするメソッド
     * @param entities DBから取得したEntityのリスト
     * @return マッピングしたFormのリスト
     */
    public List<FM25_PayeeForm> setForms(List<ET25_Payee> entities) {
        List<FM25_PayeeForm> forms = new ArrayList<>();
        for(ET25_Payee entity : entities) {
            forms.add(setForms(entity));
        }
        return forms;
    }

    /**
     * FM25_PayeeFormからET25_Payeeにマッピングするメソッド
     * @param form Serviceから取得したForm
     * @return マッピングしたEntity
     */
    public ET25_Payee setEntity(FM25_PayeeForm form) {
        ET25_Payee entity = new ET25_Payee();

        // 支払者ID
        entity.setPayeeId(form.getId());
        // 支払
        entity.setPayment(paymentMapper.setEntity(form.getPaymentForm()));
        // メンバー
        entity.setMember(memberMapper.setEntity(form.getMemberForm()));
        // 削除フラグ
        entity.setIsDeleted(form.getIsDeleted());

        return entity;
    }
}
