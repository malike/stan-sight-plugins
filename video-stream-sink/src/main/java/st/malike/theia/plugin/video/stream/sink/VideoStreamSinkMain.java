/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.malike.theia.plugin.video.stream.sink;

import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;

/**
 *
 * @author malike_st
 */
@EnableBinding(Sink.class)
@EnableConfigurationProperties(VideoStreamSinkProperties.class)
@SpringBootApplication
public class VideoStreamSinkMain {

    private static final Logger logger = Logger.getAnonymousLogger();
    @Autowired
    private VideoStreamSinkProperties videoStreamSinkProperties;


    public static void main(String[] args) {
        SpringApplication.run(VideoStreamSinkMain.class, args);
    }


}
