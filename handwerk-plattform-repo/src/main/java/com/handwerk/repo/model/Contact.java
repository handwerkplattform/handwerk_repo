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
@Table(name = "CONTACT")
public class Contact {

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ct_gen")
	@SequenceGenerator(name = "ct_gen", sequenceName = "ct_id_seq")
	private Long id;

	@Email(message = "Email should be valid")
	@Column(name = "email")
	private String email;

	@Column(name = "phone_number")
	private String phoneNumber;

	@Column(name = "creation_date")
	private LocalDateTime creationDate;

	@Column(name = "modification_date")
	private LocalDateTime modificationDate;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "master_id")
	@JsonBackReference
	private Master master;

}
