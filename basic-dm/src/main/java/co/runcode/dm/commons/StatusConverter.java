package co.runcode.dm.commons;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class StatusConverter implements AttributeConverter<Status, Character> {

	@Override
	public Character convertToDatabaseColumn(Status attribute) {				
		return attribute.getRepresentation();
	}

	@Override
	public Status convertToEntityAttribute(Character dbData) {
		switch (dbData){
		case 'A':
			return Status.ACTIVE;
		case 'H':
			return Status.HISTORIC;			
		}
		
		return null;
	}

}
