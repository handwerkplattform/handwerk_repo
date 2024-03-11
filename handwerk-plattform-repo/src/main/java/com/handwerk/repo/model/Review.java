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
@Table(name = "REVIEW")
public class Review {

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rev_gen")
	@SequenceGenerator(name = "rev_gen", sequenceName = "rev_id_seq")
	private Long id;

	@Column(name = "title")
	private String title;

	@Column(name = "rating")
	private Integer rating;

	@Column(name = "avg_rating")
	private Double avgRating;

	@Column(name = "description")
	private String description;

	@Column(name = "creation_date")
	private LocalDateTime creationDate;

	@Column(name = "modification_date")
	private LocalDateTime modificationDate;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "master_id")
	@JsonBackReference
	private Master master;

}
