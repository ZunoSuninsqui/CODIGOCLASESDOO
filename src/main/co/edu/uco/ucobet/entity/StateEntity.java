package co.edu.uco.ucobet.entity;

import java.util.UUID;

import co.edu.uco.crosscutting.helpers.ObjectHelper;
import co.edu.uco.crosscutting.helpers.TextHelper;
import co.edu.uco.crosscutting.helpers.UUIDHelper;
import co.edu.uco.ucobet.dto.CountryDTO;
import co.edu.uco.ucobet.dto.StateDTO;

public class StateEntity extends DomainEntity{
	private String name;
	private CountryEntity country;
	
	public StateEntity() {
		super(UUIDHelper.getDefault());
		setName(TextHelper.EMPTY);
		setCountry(CountryEntity.create());
	}
	
	public static final StateDTO create() {
		return new StateDTO();
	}
	
	public String getName() {
		return name;
	}
	public void setName(final String name) {
		this.name = TextHelper.applyTrim(name);
	}
	

	@Override
	public void setId(final UUID id) {
		super.setId(id);
	}
	@Override
	public UUID getId() {
		return super.getId();
	}
	public CountryEntity getCountry() {
		return country;
	}
	public StateEntity setCountry(final CountryEntity country) {
		this.country = ObjectHelper.getDefault(country, new CountryEntity());
		return this;
	}
	

}
