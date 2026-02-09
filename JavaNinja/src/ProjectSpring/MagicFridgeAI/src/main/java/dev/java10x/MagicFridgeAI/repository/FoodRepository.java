package dev.java10x.MagicFridgeAI.repository;

import dev.java10x.MagicFridgeAI.service.FoodService;
import model.FoodModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<FoodModel, Long> {
}
