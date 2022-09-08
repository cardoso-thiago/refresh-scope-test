package br.com.cardoso.controller;

import br.com.cardoso.service.FileMessage;
import org.springframework.cloud.context.refresh.ContextRefresher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class RefreshController {

    public final FileMessage fileMessage;
    public final ContextRefresher contextRefresher;

    public RefreshController(FileMessage fileMessage, ContextRefresher contextRefresher) {
        this.fileMessage = fileMessage;
        this.contextRefresher = contextRefresher;
    }

    @GetMapping("/refresh")
    public Set<String> refresh() {
        return contextRefresher.refresh();
    }

    @GetMapping("/message")
    public String getMessage() {
        return fileMessage.getFileMessage();
    }
}
