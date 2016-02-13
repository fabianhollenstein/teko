package ch.teko.projektverwaltung.model;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="field")
public class Field implements Serializable
{
    private String name;
    private String value;

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
    
    
}