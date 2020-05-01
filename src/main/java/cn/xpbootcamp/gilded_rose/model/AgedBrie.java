package cn.xpbootcamp.gilded_rose.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AgedBrie implements IMerchandise {

  private String name;
  private int sellIn;
  private int quality;

  @Override
  public void recalculateForNextDay() {
    quality = Math.min(50, quality + 1);
  }
}
