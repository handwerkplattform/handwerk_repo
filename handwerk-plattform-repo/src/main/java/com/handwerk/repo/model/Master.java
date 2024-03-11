package com.handwerk.repo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "MASTER")
public class Master {

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ms_gen")
	@SequenceGenerator(name = "ms_gen", sequenceName = "ms_id_seq")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "surname")
	private String surname;

	@Column(name = "photo_src")
	private String photoSrc;

	@Column(name = "creation_date")
	private LocalDateTime creationDate;

	@Column(name = "modification_date")
	private LocalDateTime modificationDate;

	@Column(name = "active")
	private Boolean active = true;

	@Transient
	private Set<String> exceptionMsgs = new HashSet<>();

	@OneToMany(mappedBy = "master", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonIgnoreProperties("master")
	@JsonBackReference
	private Set<Contact> contacts = new HashSet<>();

	@OneToMany(mappedBy = "master", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonIgnoreProperties("master")
	@JsonBackReference
	private Set<Review> reviews = new HashSet<>();

	@OneToMany(mappedBy = "master", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonIgnoreProperties("master")
	@JsonBackReference
	private Set<Certificate> certificates = new HashSet<>();

	@OneToMany(mappedBy = "master", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonIgnoreProperties("master")
	@JsonBackReference
	private Set<Offer> offers = new HashSet<>();

//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "address_id")
//	@JsonBackReference
//	private Address address;

}
