package com.example.bookworm_community_backend.controller;

import com.example.bookworm_community_backend.common.api.ApiResult;
import com.example.bookworm_community_backend.model.entity.BmsTip;
import com.example.bookworm_community_backend.service.BmsTipService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tip")
@Slf4j
public class BmsTipController extends BaseController {

    @Autowired
    private BmsTipService bmsTipService;

    @GetMapping("/today")
    public ApiResult<BmsTip> getTodayTip() {
        BmsTip randomTip = bmsTipService.getRandomTip(true);
        log.info("获取每日一句:{}", randomTip);
        return ApiResult.success(randomTip);
    }
}
