package cn.bywind.boot.service;

import cn.bywind.boot.model.Person;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author bywind
 * @since 2018-12-04
 */
public interface PersonService extends IService<Person> {

    Page<Person> selectPageNew(Page page, Map<String,Object> params);

}
