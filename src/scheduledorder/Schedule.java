/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduledorder;
    
/**
 *
 * @author User
 */
public class Schedule {
    private String id;
    private String orderId;

    public Schedule() {
    this.id = id;
    this.orderId = orderId;
  }

    
    public String getId() {
    return id;
  }

  public void setId(String name) {
    this.id = id;
  }
  
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String name) {
    this.orderId = orderId;
  }
}
