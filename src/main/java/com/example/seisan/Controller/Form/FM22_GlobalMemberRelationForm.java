package com.example.seisan.Controller.Form;

import com.example.seisan.Repository.Entity.ET20_GlobalMember;
import com.example.seisan.Repository.Entity.ET21_GlobalMemberTag;
import lombok.Getter;
import lombok.Setter;

/**
 * db22_GlobalMemberRelationのForm
 */
@Getter
@Setter
public class FM22_GlobalMemberRelationForm extends FM00_CommonForm {
    // グローバルメンバーID
    private Integer globalMemberId;
    // グローバルメンバータグ
    private ET21_GlobalMemberTag globalMemberTag;
}
