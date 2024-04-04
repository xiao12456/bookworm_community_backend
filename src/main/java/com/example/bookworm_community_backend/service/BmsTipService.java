package com.example.bookworm_community_backend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.bookworm_community_backend.model.entity.BmsTip;

public interface BmsTipService extends IService<BmsTip> {
    BmsTip getRandomTip();
}
