package ssx.dao;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface IDaoG {

    @Insert("INSERT INTO `ssx`.`one`(`name`,`create_date`) VALUES (#{name},SYSDATE())")
    boolean add(String name);
}
