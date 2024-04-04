package com.example.bookworm_community_backend.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.bookworm_community_backend.common.api.ApiResult;
import com.example.bookworm_community_backend.model.entity.BmsBillboard;
import com.example.bookworm_community_backend.service.BmsBillboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/billboard")
public class BmsBillboardController extends BaseController {

    @Autowired
    private BmsBillboardService bmsBillboardService;

    @GetMapping("/show")
    public ApiResult<BmsBillboard> getNotices() {
        List<BmsBillboard> list = bmsBillboardService.list(new LambdaQueryWrapper<BmsBillboard>().eq(BmsBillboard::isShow, true));
        return ApiResult.success(list.get(list.size() - 1));
    }
}
