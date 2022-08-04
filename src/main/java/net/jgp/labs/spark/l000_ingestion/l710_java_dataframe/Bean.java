package net.jgp.labs.spark.l000_ingestion.l710_java_dataframe;

import java.sql.Timestamp;

public class Bean {

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Timestamp getModel() {
    return model;
  }

  public void setModel(Timestamp model) {
    this.model = model;
  }

  public Timestamp getPrevision() {
    return prevision;
  }

  public void setPrevision(Timestamp prevision) {
    this.prevision = prevision;
  }

  private long id;
  private Timestamp model;
  private Timestamp prevision;

  public Bean(long id, Timestamp model, Timestamp prevision) {
    this.id = id;
    this.model = model;
    this.prevision = prevision;
  }
}