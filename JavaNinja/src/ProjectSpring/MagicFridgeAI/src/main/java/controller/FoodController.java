package controller;

import DTOs.FoodDTO;
import dev.java10x.MagicFridgeAI.service.FoodService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    private final FoodService service;

    public FoodController(FoodService service) {
        this.service = service;
    }

    //GET
    public ResponseEntity<List<FoodDTO>> listarFood(){
        List<FoodDTO> foods = service.listaFoods();
        return ResponseEntity.ok(foods);
    }

    @GetMapping("/listar/{id}")
    public ResponseEntity<?> listarFoodId(@PathVariable Long id){
        if(service.listarFoodId(id) != null){
            FoodDTO food = service.listarFoodId(id);
            return ResponseEntity.ok(food);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("O food de ID (" + id + ") não foi encontrado");
    }

    //POST
    @PostMapping("/criar")
    public ResponseEntity<FoodDTO> criarFood(@RequestBody FoodDTO foodDTO){
        FoodDTO food = service.criarFood(foodDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(food);
    }
    //UPDATE
    @PutMapping("/alterar/{id}")
    public ResponseEntity<?> alterarFood(@PathVariable Long id, @RequestBody FoodDTO foodDTO){
        if(service.listarFoodId(id) != null){
            FoodDTO food = service.alterarFood(id, foodDTO);
            return ResponseEntity.ok(food);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("O food de ID (" + id + ") não foi encontrado");
    }
    //DELETE
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<?> removerFood(@PathVariable Long id){
        if(service.listarFoodId(id) != null){
            service.removerFood(id);
            return ResponseEntity.ok().body("O food de ID (" + id + ") foi removido com sucesso");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("O food de ID (" + id + ") não foi encontrado");
    }
}
