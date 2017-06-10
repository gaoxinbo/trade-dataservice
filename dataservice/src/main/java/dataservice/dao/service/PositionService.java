package dataservice.dao.service;

import com.google.common.collect.ImmutableList;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import dataservice.dao.domain.Position;
import dataservice.dao.mapper.PositionMapper;

import java.util.List;

@Service
public class PositionService {

    @Resource
    private PositionMapper positionMapper;



    public int replace(final Position position) {
        return positionMapper.replace(position);
    }

    public List<Position> selectAll() {
        final List<Position> list = positionMapper.selectAll();
        if (list == null) {
            return ImmutableList.of();
        } else {
            return list;
        }
    }


}
