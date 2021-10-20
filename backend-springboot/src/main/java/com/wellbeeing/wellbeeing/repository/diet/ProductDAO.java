package com.wellbeeing.wellbeeing.repository.diet;

import com.wellbeeing.wellbeeing.domain.diet.Dish;
import com.wellbeeing.wellbeeing.domain.diet.Product;
import org.hibernate.boot.model.source.spi.Sortable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("productDAO")
public interface ProductDAO extends PagingAndSortingRepository<Product, Integer> {
    Page<Product> findByNameStartingWith(String name, Pageable pageable);
    Optional<Product> findById(UUID productId);
    Page<Product> findAll(Pageable pageable);
}
