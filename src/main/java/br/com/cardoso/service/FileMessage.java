package br.com.cardoso.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileMessage {

    String message;

    public FileMessage() throws IOException {
        this.message = Files.readString(
                Paths.get("/home/cardoso/Documentos/Profissional/POC/refresh-scope-test/message.txt"));
    }

    public String getFileMessage() {
        return this.message;
    }
}
