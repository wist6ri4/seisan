package com.example.seisan.Const;

/**
 * ViweName
 * 画面名の定数クラス
 */
public enum ViewName {
    /* ST01V_Top トップ画面 */
    ST01V("ST01V_Top"),

    /* ST02V_Seisan 清算画面 */
    ST02V("ST02V_Seisan"),

    /* SS01V_EventTag イベントタグ一覧画面 */
    SS01V("SS01V_EventTag"),

    /* SS02V_GlobalMember グローバルメンバー一覧画面 */
    SS02V("SS02V_GlobalMember"),

    /* SS03V_GlobalMemberTag グローバルメンバータグ一覧画面 */
    SS03V("SS03V_GlobalMemberTag"),

    /* SM01V_EventRegist イベント登録モーダル */
    SM01V("SM01V_EventRegist"),

    /* SM02V_EventEdit イベント編集モーダル */
    SM02V("SM02V_EventEdit"),

    /* SM03V_PaymentRegist 支払登録モーダル */
    SM03V("SM03V_PaymentRegist"),

    /* SM04V_PaymentEdit 支払編集モーダル */
    SM04V("SM04V_PaymentEdit"),

    /* SM05V_EventTagRegist イベントタグ登録モーダル */
    SM05V("SM05V_EventTagRegist"),

    /* SM06V_EventTagEdit イベントタグ編集モーダル */
    SM06V("SM06V_EventTagEdit"),

    /* SM07V_GlobalMemberRegist グローバルメンバー登録モーダル */
    SM07V("SM07V_GlobalMemberRegist"),

    /* SM08V_GlobalMemberEdit グローバルメンバー編集モーダル */
    SM08V("SM08V_GlobalMemberEdit"),

    /* SM09V_GlobalMemberTagRegist グローバルメンバータグ登録モーダル */
    SM09V("SM09V_GlobalMemberTagRegist"),

    /* SM10V_GlobalMemberTagEdit グローバルメンバータグ編集モーダル */
    SM10V("SM10V_GlobalMemberTagEdit");


    private final String viewName;

    /**
     * コンストラクタ
     * @param viewName 画面名
     */
    private ViewName(String viewName) {
        this.viewName = viewName;
    }

    /**
     * 画面名のreturnメソッド
     * @return viewName:画面名
     */
    public String getViewName() {
        return viewName;
    }

}
