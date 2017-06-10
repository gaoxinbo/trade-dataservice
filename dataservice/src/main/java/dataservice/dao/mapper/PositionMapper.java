package dataservice.dao.mapper;

import org.apache.ibatis.annotations.Param;
import dataservice.dao.domain.Position;

import java.util.List;


public interface PositionMapper {

    int replace(@Param("pojo") final Position position);

    List<Position> selectAll();
}
