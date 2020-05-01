package cn.xpbootcamp.gilded_rose.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SulfurasTest {

  @Test
  void recalculateForNextDay_ShouldSeeQualityUnchangedAndSellInAtMaxValue() {
    // Arrange
    IMerchandise merchandise = Sulfuras.builder().name("test").quality(1).build();

    // Act
    merchandise.recalculateForNextDay();

    // Assert
    assertEquals(Integer.MAX_VALUE, merchandise.getSellIn());
    assertEquals(1, merchandise.getQuality());
  }

}