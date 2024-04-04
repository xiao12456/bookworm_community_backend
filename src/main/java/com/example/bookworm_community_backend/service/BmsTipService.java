package com.example.bookworm_community_backend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.bookworm_community_backend.model.entity.BmsTip;

public interface BmsTipService extends IService<BmsTip> {
    /**
     * 获取随机的每日一句
     *
     * @param status true: 显示，false: 隐藏
     * @return 随机的每日一句对象
     */
    BmsTip getRandomTip(boolean status);
}
