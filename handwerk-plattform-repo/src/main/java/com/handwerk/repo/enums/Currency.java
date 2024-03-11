package com.handwerk.repo.enums;

import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Currency implements Serializable {
	EUR("EUR|\u20ac", "\u20ac"),
	GBP("GBP|\u00A3", "\u00A3"),
	SEK("SEK|kr", "kr"),
	CZK("CZK|Kč|kr", "Kč"),
	DKK("DKK|kr", "kr"),
	NOK("NOK|kr", "kr"),
	PLN("PLN|zł", "zł"),
	RUB("RUB"),
	CHF("CHF"),
	CAD("CAD"),
	USD("USD|\\\u0024", "\u0024"),
	AUD("AUD|AU\\\u0024", "AU\u0024"),
	HUF("HUF|Ft", "Ft"),
	JPY("JPY|¥|￥"),
	TRY("TRY|\u20BA"),
	RON("RON");

	private final String name;
	private final String symbol;

	Currency(String code) {
		this.name = code;
		this.symbol = code;
	}

	Currency(String code, String symbol) {
		this.name = code;
		this.symbol = symbol;
	}

	public static Currency getCurrencyByPriceLine(final String priceLine) {
		return getCurrencyByPriceLine(priceLine, null);
	}

	public static Currency getCurrencyByPriceLine(final String priceLine, final String countryCode) {

		if (priceLine == null) {
			return null;
		}

		Stream<Currency> currencies = Arrays.stream(Currency.values())
				.filter(cy -> Pattern.compile("([^a-zA-Z])(" + cy.name + ")(?![a-zA-Z])").matcher(" " + priceLine).find());

		if (StringUtils.isBlank(countryCode)) {
			return currencies
					.findFirst()
					.orElse(null);
		}

		Set<Currency> currenciesSet = currencies.collect(Collectors.toCollection(TreeSet::new));
		Currency expectedCurrency = CountryCode.valueOf(countryCode.toUpperCase()).getCurrency();
		return currenciesSet.stream()
				.filter(currency -> currency == expectedCurrency)
				.findFirst()
				.orElse(null);
	}

	public String getName() {
		return name;
	}

	public String getSymbol() {
		return symbol;
	}
}
