package org.educa.services;

import org.educa.dao.DataDAOImpl;
import org.educa.entity.FileEntity;

import java.io.File;
import java.util.List;

public class FileService {
    private final DataDAOImpl dataDAO = new DataDAOImpl();

    public List<String> chooseDirectory(File dir) {
        return dataDAO.readDirectory(dir);
    }

    public void writeInFile(FileEntity fileEntity, File file) {

        dataDAO.writeData(fileEntity.getDataList(), file);
    }
}
