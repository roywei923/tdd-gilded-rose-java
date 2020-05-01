package cn.xpbootcamp.gilded_rose.model;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Merchandise {

  private String name;
  private int sellIn;
  private int quality;

  public void recalculateForNextDay() {

  }
}
