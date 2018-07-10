/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.malike.theia.plugin.face.detection.transformer;

import java.util.List;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author malike_st
 */
@ConfigurationProperties("faceDetectionTransformerProperties")
@Configuration
public class FaceDetectionTransformerProperties {

  private List<String> imageURL;

  public List<String> getImageURL() {
    return imageURL;
  }

  public void setImageURL(List<String> imageURL) {
    this.imageURL = imageURL;
  }
}
