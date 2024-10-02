package co.edu.uco.ucobet.domain;

import java.util.UUID;

import co.edu.uco.crosscutting.helpers.ObjectHelper;
import co.edu.uco.crosscutting.helpers.TextHelper;

public class CityDomain extends Domain{
	private String name;
	private StateDomain State;
	private CityDomain(final UUID id, final String name, final StateDomain state) {
		super(id);
		setName(name);
		setState(state);
	}
	public static final CityDomain create (final UUID id, final String name, final StateDomain state) {
		return new CityDomain(id,name, state);
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
	public StateDomain getCountry() {
		return State;
	}
	private CityDomain setState(final StateDomain state) {
		this.State = ObjectHelper.getDefault(state, StateDomain.create());
		return this;
	}

}
