package com.kuang.common.constant;

/**
 * @Author: kuang
 * @Date: 2023/1/14 18:31
 * @Description: 返回code枚举
 */
public enum CodeEnum {

    CODE_SUCCESS(200,"success"),

    CODE_COMMON(1000,"服务器内部错误");

    private Integer code;
    private String message;

    private CodeEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }

    public Integer getCode(){
        return this.code;
    }

    public String getMessage(){
        return this.message;
    }
}
