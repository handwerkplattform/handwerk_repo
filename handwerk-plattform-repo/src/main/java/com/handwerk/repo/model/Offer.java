package com.handwerk.repo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.handwerk.repo.enums.Currency;
import com.handwerk.repo.enums.DayOfWeek;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "OFFER")
public class Offer {

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "of_gen")
	@SequenceGenerator(name = "of_gen", sequenceName = "of_id_seq")
	private Long id;

	@Column(name = "title")
	private String title;

	@Column(name = "activity")
	private String activity;

	@Column(name = "description")
	private String description;

	@Column(name = "price")
	private Double price;

	@Column(name = "currency")
	private Currency currency;

	@Column(name = "unit")
	private String unit;

	@Temporal(TemporalType.TIME)
	@Column(name = "time_from")
	private Calendar timeFrom;

	@Temporal(TemporalType.TIME)
	@Column(name = "time_to")
	private Calendar timeTo;

	@Column(name = "active")
	private Boolean active = true;

	@Column(name = "valid_by")
	private LocalDateTime validBy;

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

	@ElementCollection
	@CollectionTable(name = "days_of_week", joinColumns = @JoinColumn(name = "offer"))
	@Column(name = "day")
	private Set<DayOfWeek> dayOfWeek = new HashSet<>();

	@OneToMany(mappedBy = "offer", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonIgnoreProperties("offer")
	@JsonBackReference
	private Set<Portfolio> portfolios = new HashSet<>();

}
