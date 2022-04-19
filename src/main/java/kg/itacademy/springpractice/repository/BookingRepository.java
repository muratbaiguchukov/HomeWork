package kg.itacademy.springpractice.repository;

import kg.itacademy.springpractice.entity.Booking;
import org.springframework.data.repository.CrudRepository;

public interface BookingRepository extends CrudRepository<Booking, Long> {
}
