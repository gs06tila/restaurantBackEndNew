package se.experis.resturant.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {
    //Fetch restaurants by category
    //List<Restaurant> findByCategory(String category);

    //Fetch restaurants by name
    //List<Restaurant> findByName(String name);

    //Fetch restaurants by name or category
    //List<Restaurant> findByNameOrCategory(String name);

    // Fetch cars by name and sort by category
    // List<Restaurant> findByNameOrderByCategoryAsc(String brand);

    /*  // Fetch cars by brand using SQL
  @Query("select c from Car c where c.brand = ?1")
  List<Car> findByBrand(String brand);*/

    /*  // Fetch cars by brand using SQL
  @Query("select c from Car c where c.brand like %?1")
  List<Car> findByBrandEndsWith(String brand);*/
}