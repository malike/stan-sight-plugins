/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.malike.theia.plugin.facial.recognition.transformer;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author malike_st
 */
@ConfigurationProperties("faceDetectionTransformerProperties")
@Configuration
public class FacialRecognitionTransformerProperties {

private String pythonFacialRecognitionFile;
  private String imageURL;


  public String getPythonFacialRecognitionFile() {
    return pythonFacialRecognitionFile;
  }

  public void setPythonFacialRecognitionFile(String pythonFacialRecognitionFile) {
    this.pythonFacialRecognitionFile = pythonFacialRecognitionFile;
  }

  public String getImageURL() {
    return imageURL;
  }

  public void setImageURL(String imageURL) {
    this.imageURL = imageURL;
  }
}
