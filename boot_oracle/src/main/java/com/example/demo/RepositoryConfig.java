package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.config.BootstrapMode;

@Configuration //설정 파일들 다 읽어냄
@EnableJpaRepositories(bootstrapMode = BootstrapMode.DEFERRED) 
public class RepositoryConfig {
      //@Bean 언제 빈을 등록할 건가 시점도 정할 수 있음 디폴트는 리포지토리 설정 등록하고 빈등록하는 것.
}
	