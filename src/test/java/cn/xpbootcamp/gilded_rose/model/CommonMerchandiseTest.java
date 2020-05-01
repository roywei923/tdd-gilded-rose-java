package cn.xpbootcamp.gilded_rose.model;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CommonMerchandiseTest {

  @Test
  void recalculateForNextDay_ShouldSeeSellInAndQualityDecreaseBy1_WhenSellInAndQualityGreaterThan1() {
    // Arrange
    IMerchandise merchandise = CommonMerchandise.builder().name("test").sellIn(8).quality(8).build();

    // Act
    merchandise.recalculateForNextDay();

    // Assert
    assertEquals(7, merchandise.getSellIn());
    assertEquals(7, merchandise.getQuality());
  }

  @Test
  void recalculateForNextDay_ShouldSeeQualityStayAt0_WhenRecalculateAgainAfterQualityReaches0() {
    // Arrange
    IMerchandise merchandise = CommonMerchandise.builder().name("test").sellIn(2).quality(1).build();

    // Act
    merchandise.recalculateForNextDay();
    merchandise.recalculateForNextDay();

    // Assert
    assertEquals(0, merchandise.getSellIn());
    assertEquals(IMerchandise.MIN_QUALITY, merchandise.getQuality());
  }

  @Test
  void recalculateForNextDay_ShouldSeeQualityDecreaseBy2_WhenAfterSellInReaches0() {
    // Arrange
    IMerchandise merchandise = CommonMerchandise.builder().name("test").sellIn(1).quality(5).build();

    // Act
    merchandise.recalculateForNextDay();
    merchandise.recalculateForNextDay();

    // Assert
    assertEquals(-1, merchandise.getSellIn());
    assertEquals(2, merchandise.getQuality());
  }
}
