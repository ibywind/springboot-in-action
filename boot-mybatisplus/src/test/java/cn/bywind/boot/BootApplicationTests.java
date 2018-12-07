package cn.bywind.boot;


import cn.bywind.boot.model.Person;
import cn.bywind.boot.service.PersonService;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.plugins.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootApplicationTests {

	@Autowired
    PersonService personService;

	@Autowired
	RedisTemplate redisTemplate;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testGetPerson(){
        Person person = personService.selectById(1);
        System.out.println(person);
    }


	@Test
	public void  testUpdatePerson(){
		Person person = new Person();
        person.setId(1);
        person.setName("御风大世界1");
		personService.updateById(person);
	}

	@Test
	public void testRedisAdd(){
		redisTemplate.opsForValue().set("name","bywind");
	}

	@Test
	public void testGetRedisResult(){
		Object name = redisTemplate.opsForValue().get("name");
		System.out.println("得到redis的值:"+name);
	}

	@Test
	public void testPage(){
	    Page<Person> page = new Page<>();
	    page.setCurrent(0);
	    page.setSize(10);
        Page<Person> personPage = personService.selectPage(page);
        System.out.println(JSON.toJSONString(personPage));
    }

    @Test
	public void testRawSql(){
		Page page = new Page(2,10);
		HashMap map = new HashMap();
		map.put("name","御风大世界");
		Page page1 = personService.selectPageNew(page, map);
		System.out.println(JSON.toJSONString(page1));
	}
}
