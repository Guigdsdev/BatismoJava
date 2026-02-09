package dev.java10x.MagicFridgeAI.service;

import DTOs.FoodDTO;
import dev.java10x.MagicFridgeAI.repository.FoodRepository;
import mapper.FoodMapper;
import model.FoodModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FoodService {

    private final FoodRepository repository;
    private final FoodMapper mapper;

    public FoodService(FoodRepository repository, FoodMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<FoodDTO> listaFoods(){
        List<FoodModel> foods = repository.findAll();
        return foods.stream().map(mapper::map).collect(Collectors.toList());
    }

    public FoodDTO listarFoodId(Long id){
        Optional<FoodModel> food = repository.findById(id);
        return food.map(mapper::map).orElse(null);
    }

    public FoodDTO criarFood(FoodDTO foodDTO){
        FoodModel food = mapper.map(foodDTO);
        repository.save(food);
        return mapper.map(food);
    }

    public FoodDTO alterarFood(Long id, FoodDTO foodDTO){
        Optional<FoodModel> foodExistente = repository.findById(id);
        if(foodExistente.isPresent()){
            FoodModel food = mapper.map(foodDTO);
            food.setId(id);
            FoodModel foodSalvo = repository.save(food);
            return mapper.map(food);
        }
        return null;
    }

    public void removerFood(Long id){
        repository.deleteById(id);
    }
}
