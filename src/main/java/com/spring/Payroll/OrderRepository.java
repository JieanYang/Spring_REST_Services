package payroll;

import org.springframework.jpa.repository.JpaRepository;

interface OrderRepository extends JpaRepository<Order, Long> {
  
}