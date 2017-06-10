package dataservice.dao.service;


import com.google.common.collect.ImmutableList;
import dataservice.dao.domain.Contract;
import dataservice.dao.mapper.ContractMapper;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ContractService {

    @Resource
    ContractMapper contractMapper;

    public List<Contract> search(final String key) {
        if(StringUtils.isEmpty(key)) {
            return ImmutableList.of();
        }
        return contractMapper.search("%" + key + "%");
    }

}
