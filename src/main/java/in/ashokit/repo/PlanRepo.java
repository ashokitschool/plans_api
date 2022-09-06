package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Plan;

public interface PlanRepo extends JpaRepository<Plan, Integer> {

}