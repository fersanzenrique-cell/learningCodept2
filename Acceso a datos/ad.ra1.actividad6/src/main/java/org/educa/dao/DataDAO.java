package org.educa.dao;

import java.io.File;
import java.util.List;

public interface DataDAO {
    List<String> readDirectory(File dir);

    void writeData(List<String> data, File file);
}
