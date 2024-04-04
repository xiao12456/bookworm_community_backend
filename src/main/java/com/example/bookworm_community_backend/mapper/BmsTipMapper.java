package com.example.bookworm_community_backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.bookworm_community_backend.model.entity.BmsTip;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BmsTipMapper extends BaseMapper<BmsTip> {
    BmsTip getRandomTip();
}
