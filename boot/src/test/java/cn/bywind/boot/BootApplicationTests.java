package cn.bywind.boot;

import cn.bywind.boot.model.PersonDo;
import cn.bywind.boot.service.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootApplicationTests {

	@Autowired
	PersonService personService;

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
}
