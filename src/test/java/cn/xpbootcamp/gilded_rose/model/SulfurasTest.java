package cn.xpbootcamp.gilded_rose.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SulfurasTest {

  @Test
  void recalculateForNextDay_ShouldSeeQualityUnchangedAndSellInAtMaxValueAndNameCorrect() {
    // Arrange
    IMerchandise merchandise = Sulfuras.builder().quality(1).build();

    // Act
    merchandise.recalculateForNextDay();

    // Assert
    assertEquals(Integer.MAX_VALUE, merchandise.getSellIn());
    assertEquals(1, merchandise.getQuality());
    assertEquals("Sulfuras", merchandise.getName());
  }

}