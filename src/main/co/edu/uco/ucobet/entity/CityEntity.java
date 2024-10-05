package co.edu.uco.ucobet.entity;

import java.util.UUID;

import co.edu.uco.crosscutting.helpers.ObjectHelper;
import co.edu.uco.crosscutting.helpers.TextHelper;
import co.edu.uco.crosscutting.helpers.UUIDHelper;
import co.edu.uco.ucobet.dto.CityDTO;
import co.edu.uco.ucobet.dto.StateDTO;

public class CityEntity extends DomainEntity {
	private String name;
	private StateEntity state;
	
	public CityEntity() {
		super(UUIDHelper.getDefault());
		setName(TextHelper.EMPTY);
		setState(new StateEntity());
	}
	
	public static final StateEntity create() {
		return new StateEntity();
	}
	
	public String getName() {
		return name;
	}

	public CityEntity setName(String name) {
		this.name = TextHelper.applyTrim(name);
		return this;
	}

	public void setId(final UUID id) {
		super.setId(id);
		
	}
	@Override
	public UUID getId() {
		return super.getId();
	}
	public StateEntity getState() {
		return state;
	}
	public CityEntity setState(final StateEntity state) {
		this.state = ObjectHelper.getDefault(state, new StateEntity());
		return this;
	}

}
