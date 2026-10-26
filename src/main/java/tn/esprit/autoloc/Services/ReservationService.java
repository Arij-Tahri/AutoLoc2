package tn.esprit.autoloc.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Entities.Reservation;
import tn.esprit.autoloc.Repositories.ReservationRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class ReservationService implements IReservationService {
    ReservationRepository reservationRepo;
    @Override
    public Reservation addReservation(Reservation reservation) {
       return reservationRepo.save(reservation);
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
       return reservationRepo.save(reservation);
    }

    @Override
    public void deleteReservation(Long id) {
        reservationRepo.deleteById(id);
    }

    @Override
    public List<Reservation> getReservations() {
        return reservationRepo.findAll();
    }

    @Override
    public Reservation getReservation(Long id) {
        return reservationRepo.findById(id).get();
    }
}
