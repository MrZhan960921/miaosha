package com.zcq.exception;

import com.zcq.result.CodeMsg;

/** 异常类
 * @Author: zcq
 * @Date: 2019/4/21 13:35
 */
public class GlobalException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private CodeMsg cm;

    public GlobalException(CodeMsg cm) {
        super(cm.toString());
        this.cm = cm;
    }

    public CodeMsg getCm() {
        return cm;
    }
}
