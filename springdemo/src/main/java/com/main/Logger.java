package com.main;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Mahadi on 10/7/2017.
 */
public class Logger {

    private ConsolWriter consolWriter;
    private FileWriter fileWriter;

//    Default Constructor
    public Logger() {
    }

    public Logger(ConsolWriter consolWriter, FileWriter fileWriter) {
        this.consolWriter = consolWriter;
        this.fileWriter = fileWriter;
    }

    // Console Writer
    public ConsolWriter getConsolWriter() {
        return consolWriter;
    }

    @Autowired
    public void setConsolWriter(ConsolWriter consolWriter) {
        this.consolWriter = consolWriter;
    }

//    File Writer
    public FileWriter getFileWriter() {
        return fileWriter;
    }

    @Autowired
    public void setFileWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public void consolewriter(String s) {

        consolWriter.writer(s);

    }

    public void filewriter(String s) {

        fileWriter.writer(s);
    }
}
