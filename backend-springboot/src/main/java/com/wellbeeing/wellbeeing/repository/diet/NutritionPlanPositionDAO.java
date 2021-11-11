package com.wellbeeing.wellbeeing.repository.diet;

import com.wellbeeing.wellbeeing.domain.diet.NutritionPlanPosition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository("nutritionPlanPositionDAO")
public interface NutritionPlanPositionDAO extends JpaRepository<NutritionPlanPosition, UUID> {
}