package com.example.demo;



import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.demo.domain.Reply;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Transactional
public class ReplyManagerClient { 
	
	@Autowired EntityManager em;
	//@Test
    @Commit
	public void 댓글저장() {
		Reply reply = Reply.builder()
				           .title("test")
				         //.contents("test")
				           .build();
		
	em.persist(reply);
	assertThat(em.find(Reply.class, reply.getSeq()), is(reply));
	}
	
	@Test
    public void 댓글조회() {
    	//persist 등록 merge 수정 remove 삭제 find 조회
    	// 우리가 아는 sql이 아닌 jpql이라는 문법 써야함
    	//우리가 아는 일반 sql 문법이랑 다르게 from Reply 
    	// 리플라이 테이블부터 다 조회하라 적음
    	List<Reply> list = em.createQuery("from Reply", Reply.class)
    			             .getResultList();
    	
        System.out.println(list);
    }
}
