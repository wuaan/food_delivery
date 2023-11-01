package Application.driven.database.repos;

import Application.domain.entitis.Food;

import java.util.List;

public interface IFoodRepo {
    Food findFoodById(int id, String[] conditions) ;
    List<Food> getAll(String[] conditions);

    Food addFood(Food food) ;

}
