package com.kuang.common.handle;

import com.kuang.common.constant.CodeEnum;
import com.kuang.common.result.MyResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: kuang
 * @Date: 2023/1/14 21:17
 * @Description: 统一异常处理器
 */
@ControllerAdvice
public class GlobalExceptionHandle {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public MyResult exceptionHandle(Exception e){
        e.printStackTrace();
        return new MyResult(CodeEnum.CODE_COMMON);
    }
}
