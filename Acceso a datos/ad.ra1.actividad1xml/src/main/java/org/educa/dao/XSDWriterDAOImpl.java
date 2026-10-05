package org.educa.dao;

import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.educa.entities.JAXBUnmarshallerEntity;
import org.educa.services.JAXBEventHandlerService;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.validation.SchemaFactory;
import java.io.File;

public class XSDWriterDAOImpl implements XSDWriterDAO {
    private static final String PATH = "src/main/resources/ejercicio1.xsd";
    public XSDWriterDAOImpl() {
    }

    @Override
    public void write(JAXBUnmarshallerEntity unmarshallerEntity) {
        try {
            Unmarshaller unmarshaller = unmarshallerEntity.getUnmarshaller();
            unmarshaller.setSchema(
                    SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI).newSchema(new File(PATH))
            );
            unmarshaller.setEventHandler(new JAXBEventHandlerService());
        } catch (SAXException | JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
