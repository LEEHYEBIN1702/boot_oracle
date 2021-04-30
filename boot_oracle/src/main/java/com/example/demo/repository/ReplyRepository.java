package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.domain.Reply;
   

//JpaRepository
//CrudRepository
public interface ReplyRepository extends PagingAndSortingRepository<Reply, Long> {
	//List<Reply> findByTitle(String title);
    //CrudRepository 안에 기능이 다 있기 때문에 따로 적는 거 없이도 돌아감.
}
