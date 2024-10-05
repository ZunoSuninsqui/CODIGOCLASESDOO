package co.edu.uco.ucobet.domain;

import java.util.UUID;

import co.edu.uco.crosscutting.helpers.ObjectHelper;
import co.edu.uco.crosscutting.helpers.TextHelper;
import co.edu.uco.crosscutting.helpers.UUIDHelper;
import co.edu.uco.ucobet.entity.CountryEntity;
import co.edu.uco.ucobet.entity.StateEntity;

public class StateDomain extends Domain {
	private String name;
	private CountryDomain country;
	
	private StateDomain(final UUID id, final String name, final CountryDomain country) {
		super(id);
		setName(name);
		setCountry(country);
	}
	public static final StateDomain create (final UUID id, final String name, final CountryDomain country) {
		return new StateDomain(id,name, country);
	}
	static final StateDomain create () {
		return new StateDomain(UUIDHelper.getDefault(),TextHelper.EMPTY, CountryDomain.create());
	}
	
	public String getName() {
		return name;
	}
	public void setName(final String name) {
		this.name = TextHelper.applyTrim(name);
	}
	
	@Override
	public UUID getId() {
		return super.getId();
	}
	public CountryDomain getCountry() {
		return country;
	}
	private StateDomain setCountry(final CountryDomain country) {
		this.country = ObjectHelper.getDefault(country, CountryDomain.create());
		return this;
	}
	
}
