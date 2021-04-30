package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
//@Table(name= "board02") //테이블명 수정 가능
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Reply {
	
	@Id //pk 지정해줘야 오류 안 남
	@GeneratedValue //알아서 시퀀스 만들어줌
	private Integer seq;
	//@Transient
	@Column(length = 100)
	private String title;
	private String contents;
	private String writer;

}
