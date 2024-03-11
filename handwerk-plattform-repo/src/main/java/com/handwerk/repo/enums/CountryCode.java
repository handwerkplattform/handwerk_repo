package com.handwerk.repo.enums;


import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.Arrays;

public enum CountryCode implements Serializable {
	DE("DE", "deuschland", Currency.EUR),
	FR("FR", "frankreich", Currency.EUR),
	AT("AT", "österreich", Currency.EUR),
	BE("BE", "belgien", Currency.EUR),
	ES("ES", "spanien", Currency.EUR),
	FI("FI", "finnland", Currency.EUR),
	IT("IT", "italien", Currency.EUR),
	NL("NL", "niederlande", Currency.EUR),
	IE("IE", "irland", Currency.EUR),
	PT("PT", "portugal", Currency.EUR),
	SK("SK", "slovakia", Currency.EUR),
	AU("AU", "australien", Currency.AUD),
	GB("GB", "vereinigtes königreich", Currency.GBP),
	UK("UK", "vereinigtes königreich", Currency.GBP),
	CZ("CZ", "tschechien", Currency.CZK),
	CH("CH", "schweiz", Currency.CHF),
	DK("DK", "dänemark", Currency.DKK),
	NO("NO", "norwegen", Currency.NOK),
	PL("PL", "polen", Currency.PLN),
	RU("RU", "russia", Currency.RUB),
	SE("SE", "schweden", Currency.SEK),
	CA("CA", "kanada", Currency.CAD),
	US("COM", "vereinigte staaten", Currency.USD),
	HU("HU", "ungarn", Currency.HUF),
	JP("JP", "japan", Currency.JPY),
	TR("TR", "truthahn", Currency.TRY),
	RO("RO", "rumänien", Currency.RON);

	private String code;
	private String country;
	private Currency currency;

	CountryCode(String code, String country, Currency currency) {
		this.code = code;
		this.country = country;
		this.currency = currency;
	}

	public static CountryCode getCurrencyByCountry(@NotNull final String countryT) {
		return Arrays.stream(CountryCode.values())
				.filter(cy -> cy.country.equals(countryT.toLowerCase()))
				.findFirst()
				.orElse(null);
	}

	public static CountryCode getCurrencyByCode(@NotNull final String codeT) {
		return Arrays.stream(CountryCode.values())
				.filter(cy -> cy.code.equals(codeT) || cy.name().equals(codeT))
				.findFirst()
				.orElse(null);
	}

	@Override
	public String toString() {
		return this.name() + " -> " + code + ":" + country + " [ " + currency + " ]";
	}


	public String getCode() {
		return code;
	}

	public String getCountry() {
		return country;
	}

	public Currency getCurrency() {
		return currency;
	}
}
