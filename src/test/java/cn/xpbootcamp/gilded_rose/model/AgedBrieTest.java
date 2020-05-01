package cn.xpbootcamp.gilded_rose.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AgedBrieTest {

  @Test
  void recalculateForNextDay_ShouldSeeSellInUnchangedAndQualityIncreaseBy1() {
    // Arrange
    IMerchandise merchandise = AgedBrie.builder().name("test").sellIn(8).quality(8).build();

    // Act
    merchandise.recalculateForNextDay();

    // Assert
    assertEquals(8, merchandise.getSellIn());
    assertEquals(9, merchandise.getQuality());
  }

  @Test
  void recalculateForNextDay_ShouldSeeSellInUnchangedAndQualityStays50_WhenQualityIsAlready50() {
    // Arrange
    IMerchandise merchandise = AgedBrie.builder().name("test").sellIn(8).quality(50).build();

    // Act
    merchandise.recalculateForNextDay();

    // Assert
    assertEquals(8, merchandise.getSellIn());
    assertEquals(50, merchandise.getQuality());
  }
}