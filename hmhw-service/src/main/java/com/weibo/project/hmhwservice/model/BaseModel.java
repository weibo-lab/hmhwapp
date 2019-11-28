package com.weibo.project.hmhwservice.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.Version;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author weibo
 * @since 2019-11-28
 */
@Data
@Accessors(chain = true)
@TableName("hmhw_base_model")
public class BaseModel extends Model<BaseModel> {

    private static final long serialVersionUID = 1L;

    /**
     * 课程主键
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;
    /**
     * 模型名称
     */
    @TableField("MODEL_NAME")
    private String modelName;
    /**
     * 难度等级
     */
    @TableField("MODEL_LEVEL")
    private Integer modelLevel;
    /**
     * 制作统计
     */
    @TableField("COOK_TOTAL")
    private Integer cookTotal;
    /**
     * 浏览统计
     */
    @TableField("SCAN_TOTAL")
    private Integer scanTotal;
    /**
     * 智力
     */
    @TableField("INTELLECT")
    private Integer intellect;
    /**
     * 一级分类
     */
    @TableField("TYPE_F")
    private Integer typeF;
    /**
     * 二级分类
     */
    @TableField("TYPE_S")
    private Integer typeS;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
