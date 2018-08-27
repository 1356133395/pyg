package com.pyg.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pyg.po.TbBrand;
import com.pyg.sellergoods.service.BrandService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 */
@RequestMapping("/brand")
@RestController
public class BrandController {

    @Reference(timeout = 5000)
    private BrandService brandService;

    @GetMapping("/findAll")
    public List<TbBrand> findAll(){
        return brandService.queryAll();
    }
}
