package org.educa.dao;

import jakarta.xml.bind.Unmarshaller;
import org.educa.entities.JAXBUnmarshallerEntity;

public interface XSDWriterDAO {
    public void write(JAXBUnmarshallerEntity unmarshallerEntity);
}
