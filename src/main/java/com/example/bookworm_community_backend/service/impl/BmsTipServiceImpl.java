package com.example.bookworm_community_backend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.bookworm_community_backend.mapper.BmsTipMapper;
import com.example.bookworm_community_backend.model.entity.BmsTip;
import com.example.bookworm_community_backend.service.BmsTipService;
import org.springframework.stereotype.Service;

@Service
public class BmsTipServiceImpl extends ServiceImpl<BmsTipMapper, BmsTip> implements BmsTipService {
    @Override
    public BmsTip getRandomTip() {
        return baseMapper.getRandomTip();
    }
}
