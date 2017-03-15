package com.gzh.youth.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gzh.youth.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>   {
    User findByNameLike(String name);
    User readByName(String name);
    List<User> getByCreateDateLessThan(Date star);
   // Page<User> findByPage(Pageable pageable);
    
    @Query("select t from User t where t.name like %:name%")
	User findByName(@Param(value="name") String name);  
    
    @Query("select t from User t where t.name like %:name%")
    public Page<User> findPageByName( @Param("name") String name,Pageable pageable);

    @Query("select count(1) from User t where t.name =:username and t.pwd=:pwd")
    public int findUser(@Param(value="username") String username,@Param(value="pwd") String pwd);
}
