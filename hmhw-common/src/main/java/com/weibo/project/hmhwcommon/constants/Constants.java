package com.weibo.project.hmhwcommon.constants;

public class Constants {

    // 接口返回码
    public final static int CODE_SUCCESS = 200;
    public final static String MSG_SUCCESS = "请求成功";
    public final static int CODE_INVALID_CODE = 201;
    public final static String MSG_INVALID_CODE = "无效校验码";
    public final static int CODE_INVALID_REQUEST = 202;
    public final static String MSG_INVALID_REQUEST = "无效请求";
    public final static int CODE_INVALID_USER = 203;
    public final static String MSG_INVALID_USER = "无效用户";
    public final static int CODE_TOKEN_EXPIRED = 204;
    public final static String MSG_TOKEN_EXPIRED = "用户登录过期";
    public final static int CODE_ERROR = 500;
    public final static String MSG_ERROR = "请求失败";
    public final static int CODE_FAIL = 400;
    public final static String MSG_FAIL = "服务器出错";
    public final static int CODE_NOT_FIND = 404;
    public final static String MSG_NOT_FIND = "地址找不到";

    //业务配置
    public static final int DEFAULT_PAGE_SIZE = 10;  //默认查询页数

    // 对接平台调查员默认密码
    public static final String DEFAULT_PASSWORD = "6dda8a20f2cd2a937f032d6fc4aa12ba"; // jzfp@2019!

    // 独立平台调查员默认密码
    public static final String DEFAULT_PWD = "ba4a552d498f31e341436757666fd3f2"; // audit@2019!


}
