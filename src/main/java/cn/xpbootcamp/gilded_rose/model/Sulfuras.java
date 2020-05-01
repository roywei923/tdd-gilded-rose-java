package cn.xpbootcamp.gilded_rose.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Sulfuras implements IMerchandise {

  private int quality;

  @Override
  public void recalculateForNextDay() {
    // No action needed as Sulfuras's quality is constant
  }

  @Override
  public int getSellIn() {
    return Integer.MAX_VALUE;
  }

  @Override
  public String getName() {
    return this.getClass().getSimpleName();
  }
}
