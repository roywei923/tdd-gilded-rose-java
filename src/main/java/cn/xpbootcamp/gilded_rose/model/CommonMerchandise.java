package cn.xpbootcamp.gilded_rose.model;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommonMerchandise implements IMerchandise{

  private String name;
  private int sellIn;
  private int quality;

  public void recalculateForNextDay() {
    sellIn -= 1;
    quality = Math.max(0, quality - (sellIn < 0 ? 2 : 1));
  }
}
