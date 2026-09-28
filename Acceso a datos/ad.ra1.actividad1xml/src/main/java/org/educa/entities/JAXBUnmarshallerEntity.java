package org.educa.entities;

import jakarta.xml.bind.Unmarshaller;

public class JAXBUnmarshallerEntity {
    private Unmarshaller unmarshaller;
    public JAXBUnmarshallerEntity(){}

    public Unmarshaller getUnmarshaller() {
        return unmarshaller;
    }

    public void setUnmarshaller(Unmarshaller unmarshaller) {
        this.unmarshaller = unmarshaller;
    }
}
