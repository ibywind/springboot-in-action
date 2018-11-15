package cn.bywind.boot;

import cn.bywind.boot.model.PersonDo;
import cn.bywind.boot.service.PersonService;
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
		HashMap<String,Object> params = new HashMap<String, Object>();
		params.put("id",1);
		PersonDo person = personService.getPerson(params);
		System.out.println(person);
	}


	@Test
	public void  testUpdatePerson(){
		HashMap<String,Object> params = new HashMap<String, Object>();
		params.put("id",1);
		params.put("name","御风大世界");
		personService.updatePerson(params);
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
}
