package com.weibo.project.hmhwservice.controller;


import com.weibo.project.hmhwcommon.bean.ResponseMsg;
import com.weibo.project.hmhwcommon.constants.Constants;
import com.weibo.project.hmhwservice.model.BaseModel;
import com.weibo.project.hmhwservice.service.BaseModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author weibo
 * @since 2019-11-28
 */
@RestController
@RequestMapping("/baseModel")
public class BaseModelController {
    @Autowired
    private BaseModelService baseModelService;

    @RequestMapping(value = "/getBaseModelById", method = RequestMethod.GET)
    public ResponseMsg test(ResponseMsg res, @RequestParam("baseModelId") Integer baseModelId) {
        BaseModel baseModel = baseModelService.selectById(baseModelId);
        res.setCode(Constants.CODE_SUCCESS);
        res.setMsg(Constants.MSG_SUCCESS);
        res.setData(baseModel);
        return res;
    }


    //提交测试代码
}

