package co.edu.uco.ucobet.domain;

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
	public String getName() {
		return name;
	}
	
	private void setName(final String name) {
		this.name = TextHelper
	}
	
}
