package com.kuang.common.result;

import com.kuang.common.constant.CodeEnum;

/**
 * @Author: kuang
 * @Date: 2023/1/14 18:29
 * @Description: 统一返回结果
 */
public class MyResult {

    private Integer code;

    private String message;

    private Object data;

    public MyResult(){
        this.code = CodeEnum.CODE_SUCCESS.getCode();
        this.message = CodeEnum.CODE_SUCCESS.getMessage();
    }
    public MyResult(Integer code,String message){
        this.code = code;
        this.message = message;
    }
    public MyResult(CodeEnum codeEnum){
        this.code = codeEnum.getCode();
        this.message = codeEnum.getMessage();
    }
    public MyResult(Integer code,String message,Object data){
        this.code = code;
        this.message = message;
        this.data = data;
    }
    public MyResult setData(Object data){
        this.data = data;
        return this;
    }
}
