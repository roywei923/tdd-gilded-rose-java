package cn.xpbootcamp.gilded_rose.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BackstagePass implements IMerchandise {

  private String name;
  private int sellIn;
  private int quality;

  @Override
  public void recalculateForNextDay() {
    quality++;
    if (sellIn <= 10) {
      quality += sellIn > 5 ? 1 : 2;
    }
    quality = Math.min(quality, MAX_QUALITY);

    sellIn--;
    if(sellIn < 0 && quality > 0) {
      quality = MIN_QUALITY;
    }
  }

}
