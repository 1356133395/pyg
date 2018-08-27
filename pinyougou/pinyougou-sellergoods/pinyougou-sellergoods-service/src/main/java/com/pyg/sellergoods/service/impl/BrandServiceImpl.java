package com.pyg.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pyg.mapper.BrandMapper;
import com.pyg.po.TbBrand;
import com.pyg.sellergoods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *
 */
@Service(interfaceClass = BrandService.class)
public class BrandServiceImpl implements BrandService {
   public BrandServiceImpl(){
       System.out.println(".");
   }
    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<TbBrand> queryAll() {
        return brandMapper.queryAll();
    }

}
