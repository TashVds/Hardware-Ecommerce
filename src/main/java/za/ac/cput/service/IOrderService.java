package za.ac.cput.service;
import za.ac.cput.domain.Order;
import java.util.Set;

public interface IOrderService extends IService<Order, Long> {
    Order create(Order order);
    Order read(Long id);
    Order update(Order order);
    void delete(Long id);
    Set<Order> getAll();
}
