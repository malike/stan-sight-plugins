/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.malike.theia.plugin.facial.recognition.transformer;

import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.annotation.Transformer;

/**
 * @author malike_st
 */
@EnableBinding(Transformer.class)
@EnableConfigurationProperties(FacialRecognitionTransformerProperties.class)
@SpringBootApplication
public class FacialRecognitionTransformerMain {

  private static final Logger logger = Logger.getAnonymousLogger();
  @Autowired
  private FacialRecognitionTransformerProperties facialRecognitionTransformerProperties;


  public static void main(String[] args) {
    SpringApplication.run(FacialRecognitionTransformerMain.class, args);
  }


}
