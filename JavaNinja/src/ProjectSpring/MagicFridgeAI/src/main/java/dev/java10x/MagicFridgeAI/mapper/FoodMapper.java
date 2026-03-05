package dev.java10x.MagicFridgeAI.mapper;

import dev.java10x.MagicFridgeAI.DTOs.FoodDTO;
import dev.java10x.MagicFridgeAI.model.FoodModel;
import org.springframework.stereotype.Component;

@Component
public class FoodMapper {
    public FoodModel map(FoodDTO foodDTO){
        FoodModel foodModel = new FoodModel();
        foodModel.setId(foodDTO.getId());
        foodModel.setNome(foodDTO.getNome());
        foodModel.setCategoria(foodDTO.getCategoria());
        foodModel.setValidade(foodDTO.getValidade());
        foodModel.setQuantidade(foodDTO.getQuantidade());
        return foodModel;
    }

    public FoodDTO map(FoodModel foodModel){
        FoodDTO foodDTO = new FoodDTO();
        foodDTO.setId(foodModel.getId());
        foodDTO.setNome(foodModel.getNome());
        foodDTO.setCategoria(foodModel.getCategoria());
        foodDTO.setValidade(foodModel.getValidade());
        foodDTO.setQuantidade(foodModel.getQuantidade());
        return foodDTO;
    }
}
