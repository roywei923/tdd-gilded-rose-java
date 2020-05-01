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
    if (sellIn <= 10) {
      if(sellIn > 5) {
        quality += 2;
      } else {
        quality += sellIn > 0 ? 3 : -quality;
      }
    }
    sellIn--;
  }

}
