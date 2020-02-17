package br.com.bertini.cadastroendereco.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class DataNotFoundException extends RuntimeException{

	private static final long serialVersionUID = -7705469273172338624L;
	
	private String dataName;
	private String fieldName;
	private Object fieldValue;
	
	public DataNotFoundException( String dataName, String fieldName, Object fieldValue) {
		super(String.format("%s not found with %s : '%s'", dataName, fieldName, fieldValue));
		this.dataName = dataName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

	public String getDataName() {
		return dataName;
	}

	public void setDataName(String dataName) {
		this.dataName = dataName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public Object getFiledValue() {
		return fieldValue;
	}

	public void setFiledValue(Object filedValue) {
		this.fieldValue = filedValue;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
