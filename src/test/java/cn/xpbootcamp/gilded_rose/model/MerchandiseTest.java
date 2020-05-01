package cn.xpbootcamp.gilded_rose.model;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MerchandiseTest {

  @Test
  void recalculateForNextDay_ShouldSeeSellInAndQualityDecreaseBy1_WhenSellInAndQualityGreaterThan1() {
    // Arrange
    Merchandise merchandise = Merchandise.builder().name("test").sellIn(8).quality(8).build();

    // Act
    merchandise.recalculateForNextDay();

    // Assert
    assertEquals(merchandise.getSellIn() - 1, merchandise.getSellIn());
    assertEquals(merchandise.getQuality() - 1, merchandise.getQuality());
  }

  @Test
  void recalculateForNextDay_ShouldSeeQualityStayAt0_WhenRecalculateAgainAfterQualityReaches0() {
    // Arrange
    Merchandise merchandise = Merchandise.builder().name("test").sellIn(2).quality(1).build();

    // Act
    merchandise.recalculateForNextDay();
    merchandise.recalculateForNextDay();

    // Assert
    assertEquals(0, merchandise.getSellIn());
    assertEquals(0, merchandise.getQuality());
  }

  @Test
  void recalculateForNextDay_ShouldSeeQualityDecreaseBy2_WhenAfterSellInReaches0() {
    // Arrange
    Merchandise merchandise = Merchandise.builder().name("test").sellIn(1).quality(5).build();

    // Act
    merchandise.recalculateForNextDay();
    merchandise.recalculateForNextDay();

    // Assert
    assertEquals(-1, merchandise.getSellIn());
    assertEquals(2, merchandise.getQuality());
  }
}
