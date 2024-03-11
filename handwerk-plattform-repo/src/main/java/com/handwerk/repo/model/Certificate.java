package com.handwerk.repo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "CERTIFICATE")
public class Certificate {

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cert_gen")
	@SequenceGenerator(name = "cert_gen", sequenceName = "cert_id_seq")
	private Long id;

	@Column(name = "title")
	private String title;

	@Column(name = "activity")
	private String activity;

	@Column(name = "description")
	private String description;

	@Column(name = "authority")
	private String authority;

	@Column(name = "score")
	private Double score;

	@Column(name = "creation_date")
	private LocalDateTime creationDate;

	@Column(name = "modification_date")
	private LocalDateTime modificationDate;

	@NotNull(message = "Master is mandatory")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "master_id")
	@JsonBackReference
	private Master master;

	@NotNull(message = "Category is mandatory")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cat_id")
	private Category category;

}
