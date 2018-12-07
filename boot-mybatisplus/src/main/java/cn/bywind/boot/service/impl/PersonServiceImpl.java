package cn.bywind.boot.service.impl;

import cn.bywind.boot.model.Person;
import cn.bywind.boot.mapper.PersonMapper;
import cn.bywind.boot.service.PersonService;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author bywind
 * @since 2018-12-04
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements PersonService {


    @Override
    public Page<Person> selectPageNew(Page page, Map<String, Object> params) {
        List<Person> people = baseMapper.selectPageNew(page, params);
        return page.setRecords(people);
    }
}
