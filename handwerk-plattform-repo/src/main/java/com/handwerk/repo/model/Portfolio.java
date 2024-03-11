package com.handwerk.repo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "PORTFOLIO")
public class Portfolio {

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pf_gen")
	@SequenceGenerator(name = "pf_gen", sequenceName = "pf_id_seq")
	private Long id;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@Column(name = "media_src")
	private String mediaSrc;

	@Column(name = "creation_date")
	private LocalDateTime creationDate;

	@Column(name = "modification_date")
	private LocalDateTime modificationDate;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "offer_id")
	@JsonBackReference
	private Offer offer;

}
