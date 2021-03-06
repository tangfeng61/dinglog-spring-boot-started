package com.cutiyu.dinglog.enums;

/**
 * @Describe:
 *
 */
public enum MsgTypeEnum {
    TEXT("text", "text文本消息"),
    LINK("link", ""),
    MARKDOWN("markdown", ""),
    ACTION_CARD_ALL("actionCard", ""),
    ACTION_CARD_SIGLE("actionCard", ""),
    FEED_CARD("feedCard", ""),

    ;


    private String type;
    private String desc;

    MsgTypeEnum(String type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public String getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }
}
