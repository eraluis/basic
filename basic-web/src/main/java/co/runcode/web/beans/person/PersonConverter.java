package co.runcode.web.beans.person;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import co.runcode.bo.person.PersonLBO;
import co.runcode.dm.person.Person;

@FacesConverter("personConverter")
public class PersonConverter implements Converter {

	@Inject
	private PersonLBO personLBO;
	
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        if(value != null && value.trim().length() > 0) {
            try {                
                return personLBO.find( Long.parseLong(value) );
                
            } catch(NumberFormatException e) {
                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Conversion Error", "Not a valid object."));
            }
        }
        else {
            return null;
        }
    }
 
    public String getAsString(FacesContext fc, UIComponent uic, Object object) {
        if(object != null) {
            return String.valueOf( ((Person) object).getId() );
        }
        else {
            return null;
        }
    }   

}
