package org.educa;

import org.educa.dao.XSDWriterDAOImpl;
import org.educa.entities.JAXBUnmarshallerEntity;
import org.educa.services.JAXBService;

public class Main {
    public static void main(String[] args) {
        JAXBService jaxbService = new JAXBService();
        JAXBUnmarshallerEntity jaxbUnmarshallerEntity = new JAXBUnmarshallerEntity();
        XSDWriterDAOImpl xsdWriterDAO = new XSDWriterDAOImpl();
        jaxbUnmarshallerEntity.setUnmarshaller(jaxbService.ContextMaker());
        xsdWriterDAO.write(jaxbUnmarshallerEntity);
    }
}
