package org.educa.services;

import jakarta.xml.bind.ValidationEvent;
import jakarta.xml.bind.ValidationEventHandler;

public class JAXBEventHandlerService implements ValidationEventHandler {
    @Override
    public boolean handleEvent(ValidationEvent event) {
        System.err.println("Evento de validación (" + event.getSeverity() + ")"
                + "[linea: " + event.getLocator().getLineNumber() + "]"
                + "[columna: " + event.getLocator().getColumnNumber() + "]"
                + event.getMessage());
        return (event.getSeverity() != ValidationEvent.FATAL_ERROR);
    }
}
