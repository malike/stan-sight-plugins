/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.malike.theia.go.alert.sink;

import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @author malike_st
 */
@EnableBinding(Sink.class)
@EnableConfigurationProperties(GoAlertSinkProperties.class)
@SpringBootApplication
public class GoAlertSinkMain {

  private static final Logger logger = Logger.getAnonymousLogger();
  @Autowired
  private GoAlertSinkProperties goAlertSinkProperties;


  public static void main(String[] args) {
    SpringApplication.run(GoAlertSinkMain.class, args);
  }


}
