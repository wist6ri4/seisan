package com.example.seisan.Service;

import com.example.seisan.Controller.Form.FM20_GlobalMemberForm;
import com.example.seisan.Controller.Form.FM21_GlobalMemberTagForm;
import com.example.seisan.Controller.Form.FM22_GlobalMemberRelationForm;
import com.example.seisan.Controller.Form.FM23_MemberForm;
import com.example.seisan.Controller.Form.FM24_PayerForm;
import com.example.seisan.Controller.Form.FM25_PayeeForm;

public interface SV02_MemberService {

    /**
     * FM20_GlobalMemberFormのinsert
     * @param form
     * @return resultGlobalMemberForm
     */
    public FM20_GlobalMemberForm insert_FM20_GlobalMemberForm(FM20_GlobalMemberForm form);

    /**
     * FM20_GlobalMemberFormのupdate
     * @param form
     * @return resultGlobalMemberForm
     */
    public FM20_GlobalMemberForm update_FM20_GlobalMemberForm(FM20_GlobalMemberForm form);

    /**
     * FM20_GlobalMemberFormのdelete
     * @param form
     * @return resultGlobalMemberForm
     */
    public FM20_GlobalMemberForm delete_FM20_GlobalMemberForm(FM20_GlobalMemberForm form);

    /**
     * FM21_GlobalMemberTagFormのinsert
     * @param form
     * @return resultGlobalMemberTagForm
     */
    public FM21_GlobalMemberTagForm insert_Fm21_GlobalMemberTagForm(FM21_GlobalMemberTagForm form);

    /**
     * FM21_GlobalMemberTagFormのupdate
     * @param form
     * @return resultGlobalMemberTagForm
     */
    public FM21_GlobalMemberTagForm update_Fm21_GlobalMemberTagForm(FM21_GlobalMemberTagForm form);

    /**
     * FM21_GlobalMemberTagFormのdelete
     * @param form
     * @return resultGlobalMemberTagForm
     */
    public FM21_GlobalMemberTagForm delete_Fm21_GlobalMemberTagForm(FM21_GlobalMemberTagForm form);

    /**
     * FM22_GlobalMemberRelationFormのinsert
     * @param form
     * @return resultGlobalMemberRelationForm
     */
    public FM22_GlobalMemberRelationForm insert_FM22_GlobalMemberRelationForm(FM22_GlobalMemberRelationForm form);

    /**
     * FM22_GlobalMemberRelationFormのupdate
     * @param form
     * @return resultGlobalMemberRelationForm
     */
    public FM22_GlobalMemberRelationForm update_FM22_GlobalMemberRelationForm(FM22_GlobalMemberRelationForm form);

    /**
     * FM22_GlobalMemberRelationFormのdelete
     * @param form
     * @return resultGlobalMemberRelationForm
     */
    public FM22_GlobalMemberRelationForm delete_FM22_GlobalMemberRelationForm(FM22_GlobalMemberRelationForm form);


    /**
     * FM23_MemberFormのinsert
     * @param form
     * @return resultMemberForm
     */
    public FM23_MemberForm insert_FM23_MemberForm(FM23_MemberForm form);

    /**
     * FM23_MemberFormのinsert
     * @param form
     * @return resultMemberForm
     */
    public FM23_MemberForm update_FM23_MemberForm(FM23_MemberForm form);

    /**
     * FM23_MemberFormのinsert
     * @param form
     * @return resultMemberForm
     */
    public FM23_MemberForm delete_FM23_MemberForm(FM23_MemberForm form);

    /**
     * FM24_PayerFormのinsert
     * @param form
     * @return resultPayerForm
     */
    public FM24_PayerForm insert_FM24_PayerForm(FM24_PayerForm form);

    /**
     * FM24_PayerFormのupdate
     * @param form
     * @return resultPayerForm
     */
    public FM24_PayerForm update_FM24_PayerForm(FM24_PayerForm form);

    /**
     * FM24_PayerFormのdelete
     * @param form
     * @return resultPayerForm
     */
    public FM24_PayerForm delete_FM24_PayerForm(FM24_PayerForm form);

    /**
     * FM25_PayeeFormのinsert
     * @param form
     * @return resultPayeeForm
     */
    public FM25_PayeeForm insert_FM25_PayeeForm(FM25_PayeeForm form);

    /**
     * FM25_PayeeFormのupdate
     * @param form
     * @return resultPayeeForm
     */
    public FM25_PayeeForm update_FM25_PayeeForm(FM25_PayeeForm form);

    /**
     * FM25_PayeeFormのdelete
     * @param form
     * @return resultPayeeForm
     */
    public FM25_PayeeForm delete_FM25_PayeeForm(FM25_PayeeForm form);

    /**
     * event_idに紐づくmemberのカウント
     * @param eventId イベントID
     * @return memberCount:人数
     */
    public Long countMembersById(Integer eventId);
}
