package cn.bywind.boot.mapper;

import cn.bywind.boot.model.Person;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author bywind
 * @since 2018-12-04
 */
public interface PersonMapper extends BaseMapper<Person> {

    List<Person> selectPageNew(Page page, Map<String,Object> params);

}
