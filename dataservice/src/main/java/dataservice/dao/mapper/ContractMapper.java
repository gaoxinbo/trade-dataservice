package dataservice.dao.mapper;


import dataservice.dao.domain.Contract;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface ContractMapper {


    @Select("select * from contract where name like #{key} or symbol like #{key} limit 10")
    List<Contract> search(@Param("key") final String key);

}
