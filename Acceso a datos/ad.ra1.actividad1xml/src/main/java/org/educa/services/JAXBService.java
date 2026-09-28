package org.educa.services;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

public class JAXBService {
    public static final String PATH = "src/main/resources/ejercicio1.xml";
    public JAXBService(){}
    public Unmarshaller ContextMaker(){
        try {
            JAXBContext context = JAXBContext.newInstance(PATH);
            return context.createUnmarshaller();

        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
