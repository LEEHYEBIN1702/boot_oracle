package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.demo.domain.Reply;
import com.example.demo.repository.ReplyRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Transactional
public class ReplyRepositoryClient {
	
	@Autowired ReplyRepository repository;
	
	//@Test
	@Commit
	public void 댓글저장() {
		Reply reply = Reply.builder()
				           .title("test2")
				         //.contents("test")
				           .build();
		
	repository.save(reply);
	}
	
	//@Test
	@Commit
    public void 댓글조회() {
    	List<Reply> list = repository.findAll();
    	
        System.out.println(list);
    }
	
	@Test
	public void 제목조회() {
		List<Reply> list = repository.findByTitle("test2");
		System.out.println(list);
	}

}
