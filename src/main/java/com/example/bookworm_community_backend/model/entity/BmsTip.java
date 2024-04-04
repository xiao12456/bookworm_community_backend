package com.example.bookworm_community_backend.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 每日一句
 */
@Data
@Builder
@Accessors(chain = true)
@TableName("bms_tip")
@NoArgsConstructor
@AllArgsConstructor
public class BmsTip implements Serializable {
    private static final long serialVersionUID = 7564785656818846705L;
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 内容
     */
    @TableField("content")
    private String content;
    /**
     * 作者
     */
    @TableField("author")
    private String author;
    /**
     * 1: 使用
     * 0: 禁用
     */
    @Builder.Default
    @TableField("type")
    private boolean type = false;
}
