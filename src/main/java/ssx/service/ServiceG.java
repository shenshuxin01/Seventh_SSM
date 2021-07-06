package ssx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ssx.dao.IDaoG;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class ServiceG {

    @Resource(name = "IDaoG")
    IDaoG iDaoG;

    public Map add(String name){
        HashMap hashMap = new HashMap();
        hashMap.put("isok",iDaoG.add(name));
        return hashMap;
    }

}
