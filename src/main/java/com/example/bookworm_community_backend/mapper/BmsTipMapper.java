package com.example.bookworm_community_backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.bookworm_community_backend.model.entity.BmsTip;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BmsTipMapper extends BaseMapper<BmsTip> {
    /**
     * 获取随机的每日一句
     *
     * @param status true: 显示，false: 隐藏
     * @return 随机的每日一句对象
     */
    BmsTip getRandomTip(boolean status);
}
