package com.example.seisan.Controller.Form;

import lombok.Getter;
import lombok.Setter;

/**
 * db21_GlobalMemberTagのForm
 */
@Getter
@Setter
public class FM21_GlobalMemberTagForm extends FM00_CommonForm {
    // グローバルメンバータグ名
    private String tagName;
    // 色
    private String color;
}
