package co.edu.uco.ucobet.entity;

import java.util.UUID;

import co.edu.uco.crosscutting.helpers.TextHelper;
import co.edu.uco.crosscutting.helpers.UUIDHelper;
import co.edu.uco.ucobet.dto.CountryDTO;
import co.edu.uco.ucobet.dto.StateDTO;

public class CountryEntity extends DomainEntity {
	private String name;

	public CountryEntity() {
		super(UUIDHelper.getDefault());
		setName(TextHelper.EMPTY);
	}
	public static final CountryEntity create() {
		return new CountryEntity();
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
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
	
}
