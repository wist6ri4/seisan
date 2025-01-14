package com.example.seisan.Service.Mapper;

import com.example.seisan.Controller.Form.FM24_PayerForm;
import com.example.seisan.Repository.Entity.ET24_Payer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * db24_payersのMapper
 */
@Component
public class MP24_PayerMapper {

    @Autowired
    MP23_MemberMapper memberMapper;

    @Autowired
    MP30_PaymentMapper paymentMapper;

    /**
     * ET24_PayerからFM24_PayerFormにマッピングするメソッド
     * @param entities DBから取得したEntity
     * @return マッピングしたForm
     */
    public FM24_PayerForm setForm(ET24_Payer entity) {
        FM24_PayerForm form = new FM24_PayerForm();

        // 支払者ID
        form.setId(entity.getPayerId());
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
     * List<ET24_Payer>からList<FM24_PayerForm>にマッピングするメソッド
     * @param entities DBから取得したEntityのリスト
     * @return マッピングしたFormのリスト
     */
    public List<FM24_PayerForm> setForm(List<ET24_Payer> entities) {
        List<FM24_PayerForm> forms = new ArrayList<>();
        for(ET24_Payer entity : entities) {
            forms.add(setForm(entity));
        }
        return forms;
    }

    /**
     * FM24_PayerFormからET24_Payerにマッピングするメソッド
     * @param form Serviceから取得したForm
     * @return マッピングしたEntity
     */
    public ET24_Payer setEntity(FM24_PayerForm form) {
        ET24_Payer entity = new ET24_Payer();

        // 支払者ID
        entity.setPayerId(form.getId());
        // 支払
        entity.setPayment(paymentMapper.setEntity(form.getPaymentForm()));
        // メンバー
        entity.setMember(memberMapper.setEntity(form.getMemberForm()));
        // 削除フラグ
        entity.setIsDeleted(form.getIsDeleted());

        return entity;
    }
}
