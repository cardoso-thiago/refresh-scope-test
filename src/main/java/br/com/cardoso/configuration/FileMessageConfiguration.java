package br.com.cardoso.configuration;

import br.com.cardoso.service.FileMessage;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class FileMessageConfiguration {

    @Bean
    @RefreshScope
    public FileMessage fileMessage() throws IOException {
        return new FileMessage();
    }
}
