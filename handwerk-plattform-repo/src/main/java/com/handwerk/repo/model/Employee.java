package com.handwerk.repo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "EMPLOYEE")
public class Employee {

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_gen")
	@SequenceGenerator(name = "emp_gen", sequenceName = "emp_id_seq")
	private Long id;

	@Column(name = "staff_id")
	private Long staffId;

	@Column(name = "creation_date")
	private LocalDateTime creationDate;

	@Column(name = "modification_date")
	private LocalDateTime modificationDate;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "employer_id")
	@JsonBackReference
	private Customer employer;

}
