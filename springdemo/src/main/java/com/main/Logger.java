package com.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

/**
 * Created by Mahadi on 10/7/2017.
 */
@Component
public class Logger {

    private ConsolWriter consolWriter;
    private FileWriter fileWriter;

    @Inject
    public void setConsolWriter(ConsolWriter consolWriter) {
        this.consolWriter = consolWriter;
    }

    @Inject
    public void setFileWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    // Console Writer
    public ConsolWriter getConsolWriter() {
        return consolWriter;
    }

//    File Writer
    public FileWriter getFileWriter() {
        return fileWriter;
    }

    public void consolewriter(String s) {
        consolWriter.writer(s);
    }

    public void filewriter(String s) {
        fileWriter.writer(s);
    }
}
