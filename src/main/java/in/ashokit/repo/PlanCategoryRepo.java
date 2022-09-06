package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.PlanCateogry;

public interface PlanCategoryRepo extends JpaRepository<PlanCateogry, Integer> {

}