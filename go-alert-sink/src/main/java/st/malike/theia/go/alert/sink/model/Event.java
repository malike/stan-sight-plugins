package st.malike.theia.go.alert.sink.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

/**
 * @autor malike_st
 */
public class Event implements Serializable {

  private String eventId;
  private String subject;
  private Map<String, Boolean> channel;
  private ArrayList<String> recipient;
  private String eventType;
  private String description;
  private Map unmappedData;


  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public Map<String, Boolean> getChannel() {
    return channel;
  }

  public void setChannel(Map<String, Boolean> channel) {
    this.channel = channel;
  }

  public ArrayList<String> getRecipient() {
    return recipient;
  }

  public void setRecipient(ArrayList<String> recipient) {
    this.recipient = recipient;
  }

  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Map getUnmappedData() {
    return unmappedData;
  }

  public void setUnmappedData(Map unmappedData) {
    this.unmappedData = unmappedData;
  }
}
