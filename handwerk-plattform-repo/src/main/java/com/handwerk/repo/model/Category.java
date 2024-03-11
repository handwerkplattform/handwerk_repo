package com.handwerk.repo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "CATEGORY")
public class Category {

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cat_gen")
	@SequenceGenerator(name = "cat_gen", sequenceName = "cat_id_seq")
	private Long id;

	@Column(name = "parent_cat")
	private String parentCat;

	@Column(name = "name")
	private String name;

	@Column(name = "classification_id")
	private String classificationId;

	@Column(name = "description")
	private String description;

	@Column(name = "creation_date")
	private LocalDateTime creationDate;

	@Column(name = "modification_date")
	private LocalDateTime modificationDate;

}
