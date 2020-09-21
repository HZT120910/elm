package com.dongruan.service.Impl;

import com.dongruan.bean.Business;
import com.dongruan.bean.BusinessExample;
import com.dongruan.dao.BusinessMapper;
import com.dongruan.service.BusinessServise;
import com.dongruan.util.NonullUtils;
import org.springframework.beans.factory.annotation.Autowired;
import com.dongruan.bean.BusinessExample.Criteria;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * @author shkstart
 * @create 2020-09-21 14:06
 */
@Service
public class BusinessServiceImpl implements BusinessServise {
    @Autowired
    private BusinessMapper businessMapper;
    @Override
    public List<Business> showAllBusniess() {
        List<Business> businesses = businessMapper.selectByExampleWithBLOBs(null);
        return businesses;
    }

    @Override
    public List<Business> showBusinessbyBusinessExplain(String businessExplain) {
        Objects.requireNonNull(businessExplain);
        BusinessExample businessExample = new BusinessExample();
        Criteria criteria = businessExample.createCriteria();
        criteria.andBusinessexplainEqualTo(businessExplain);
        List<Business> businesses = businessMapper.selectByExampleWithBLOBs(businessExample);
        return businesses;
    }

    @Override
    public int updataBusiness(Business business) {
        NonullUtils.PredicateUtil(business.getBusinessaddress(),business.getBusinessexplain(),business.getBusinessid(),business.getBusinessimg(),business.getBusinessname(),business.getStarprice(),business.getDeliveryprice());
        int i = businessMapper.updateByPrimaryKeyWithBLOBs(business);
        return i;
    }

    @Override
    public int deleteBusiness(Integer businessid) {
        Objects.requireNonNull(businessid);
        int i = businessMapper.deleteByPrimaryKey(businessid);
        return i;
    }

    @Override
    public int addBusiness(Business business) {
        NonullUtils.PredicateUtil(business.getBusinessaddress(),business.getBusinessexplain(),business.getBusinessid(),business.getBusinessimg(),business.getBusinessname(),business.getStarprice(),business.getDeliveryprice());
        int insert = businessMapper.insert(business);
        return insert;
    }

    @Override
    public Business getBusinessById(Integer businessid) {
        Objects.requireNonNull(businessid);
        Business business = businessMapper.selectByPrimaryKey(businessid);
        return business;
    }
}
