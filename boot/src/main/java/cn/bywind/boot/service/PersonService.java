package cn.bywind.boot.service;

import cn.bywind.boot.model.PersonDo;

import java.util.HashMap;
import java.util.List;

public interface PersonService {

     List<PersonDo> queryPersonlist(HashMap<String,Object> params);
     PersonDo getPerson(HashMap<String,Object> params);
     PersonDo addPerson(PersonDo personDo);
     PersonDo updatePerson(HashMap<String,Object> params);
}
