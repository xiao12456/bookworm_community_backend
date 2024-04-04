package com.example.bookworm_community_backend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.bookworm_community_backend.mapper.BmsBillboardMapper;
import com.example.bookworm_community_backend.model.entity.BmsBillboard;
import com.example.bookworm_community_backend.service.BmsBillboardService;
import org.springframework.stereotype.Service;

@Service
public class BmsBillboardServiceImpl extends ServiceImpl<BmsBillboardMapper, BmsBillboard> implements BmsBillboardService {
}
