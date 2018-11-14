package cn.bywind.boot.service;

import cn.bywind.boot.model.PersonDo;

import java.util.HashMap;
import java.util.List;

public interface PersonService {

     List<PersonDo> queryPersonlist(HashMap<String,Object> params);
     PersonDo getPerson(HashMap<String,Object> params);
     int addPerson(PersonDo personDo);
     int updatePerson(HashMap<String,Object> params);
}
