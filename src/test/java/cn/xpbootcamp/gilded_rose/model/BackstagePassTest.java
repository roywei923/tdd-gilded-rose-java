package cn.xpbootcamp.gilded_rose.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BackstagePassTest {

  @Test
  void recalculateForNextDay_ShouldSeeQualityIncrease2AndSellInDecrease1_When10DaysBeforePerformance() {
    // Arrange
    IMerchandise merchandise = BackstagePass.builder().name("test").sellIn(10).quality(0).build();

    // Act
    merchandise.recalculateForNextDay();

    // Assert
    assertEquals(9, merchandise.getSellIn());
    assertEquals(2, merchandise.getQuality());
  }

  @Test
  void recalculateForNextDay_ShouldSeeQualityIncrease3AndSellInDecrease1_When5DaysBeforePerformance() {
    // Arrange
    IMerchandise merchandise = BackstagePass.builder().name("test").sellIn(5).quality(0).build();

    // Act
    merchandise.recalculateForNextDay();

    // Assert
    assertEquals(4, merchandise.getSellIn());
    assertEquals(3, merchandise.getQuality());
  }

  @Test
  void recalculateForNextDay_ShouldSeeQualityIncrease25AndSellInDecrease10_WhenOnThePerformanceDay() {
    // Arrange
    IMerchandise merchandise = BackstagePass.builder().name("test").sellIn(10).quality(0).build();

    // Act
    for(int i = 0 ; i < 10; i++) {
      merchandise.recalculateForNextDay();
    }

    // Assert
    assertEquals(0, merchandise.getSellIn());
    assertEquals(25, merchandise.getQuality());
  }

  @Test
  void recalculateForNextDay_ShouldSeeQualityDropTo0_WhenAfterThePerformanceDay() {
    // Arrange
    IMerchandise merchandise = BackstagePass.builder().name("test").sellIn(0).quality(50).build();

    // Act
      merchandise.recalculateForNextDay();

    // Assert
    assertEquals(-1, merchandise.getSellIn());
    assertEquals(0, merchandise.getQuality());
  }

  @Test
  void recalculateForNextDay_ShouldSeeQualityStay0_When2DaysAfterThePerformanceDay() {
    // Arrange
    IMerchandise merchandise = BackstagePass.builder().name("test").sellIn(-1).quality(0).build();

    // Act
    merchandise.recalculateForNextDay();

    // Assert
    assertEquals(-2, merchandise.getSellIn());
    assertEquals(0, merchandise.getQuality());
  }
}