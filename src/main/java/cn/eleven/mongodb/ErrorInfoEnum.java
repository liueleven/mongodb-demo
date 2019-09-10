package cn.eleven.mongodb;

/**
 * @description:
 * @date: 2019-09-10 16:02
 * @author: 十一
 */
public enum  ErrorInfoEnum {
    // 通用 5000xx
    UNDEFINE_ERROR(500001, "未知错误", "UNDEFINE_ERROR"),
    PARAMS_ERROR(500002, "参数错误", "PARAMS_ERROR"),
    LANG_REDIS_ERROR(500003, "获取redis失败", "LANG_REDIS_ERROR"),
    JSON_FORMAT_FAIL(500004, "json 格式转换错误！", "JSON_FORMAT_FAIL"),
    LANG_LIMIT_FREQUENCY_OPERTION(500005, "短信操作过于频繁，请稍后再试！", "LANG_LIMIT_FREQUENCY_OPERTION"),
    LANG_DATA_TOO_LONG(500006, "数据太长！", "LANG_DATA_TOO_LONG"),
    LANG_DATA_TOO_BIG(500007, "数据太大！", "LANG_DATA_TOO_BIG"),
    LANG_DATA_ERROR(500008, "数据异常！", "LANG_DATA_ERROR"),
    LANG_REQ_METHOD_NOT_EXIST(500009, "请求的方法不存在！", "LANG_REQ_METHOD_NOT_EXIST"),
    LANG_CAST_TYPE_EXCEPTION(500010, "类型转换错误！", "LANG_CAST_TYPE_EXCEPTION"),
    LANG_REQ_PARAM_ERROR(500011, "请求参数类型不正确！", "LANG_REQ_PARAM_ERROR"),
    LANG_ILLEGAL_SIGN(500012, "签名错误", "LANG_ILLEGAL_SIGN"),
    LANG_ILLEGAL_SUBMIT_DATA(500013, "提交数据不正确", "LANG_ILLEGAL_SUBMIT_DATA"),
    LANG_ACTIVITY_NOT_OPEN(500014, "活动未开始", "LANG_ACTIVITY_NOT_OPEN"),
    LANG_ACTIVITY_HAS_END(500015, "活动已结束", "LANG_ACTIVITY_HAS_END"),
    LANG_REQ_TIME_OUT(500016, "请求超时", "LANG_REQ_TIME_OUT"),
    LANG_SYSTEM_BUSY(500017, "系统繁忙！", "LANG_SYSTEM_BUSY"),
    LANG_DATA_SYNC_FAIL(500018, "数据同步失败！", "LANG_DATA_SYNC_FAIL"),
    ILLEGAL_TIMESTAMP(500019, "错误的时间戳", "ILLEGAL_TIMESTAMP"),

    ;



    private Integer errorCode;

    private String errorCNMsg;

    private String errorENMsg;

    ErrorInfoEnum(Integer errorCode, String errorCNMsg, String errorENMsg) {
        this.errorCode = errorCode;
        this.errorCNMsg = errorCNMsg;
        this.errorENMsg = errorENMsg;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public String getErrorCNMsg() {
        return errorCNMsg;
    }

    public String getErrorENMsg() {
        return errorENMsg;
    }

    /**
     * 根据英文拿到中文
     * @param enMsg
     * @return
     */
    public static String errorCNMsgOf(String  enMsg) {
        for (ErrorInfoEnum errorInfoEnum : values()) {
            if(errorInfoEnum.getErrorENMsg().equals(enMsg)) {
                return errorInfoEnum.getErrorCNMsg();
            }
        }
        return null;
    }
}
