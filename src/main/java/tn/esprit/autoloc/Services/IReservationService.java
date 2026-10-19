package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Entities.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation addReservation(Reservation reservation);
    Reservation updateReservation(Reservation reservation);
    void deleteReservation(Long id);
    List<Reservation> getReservations();
    Reservation getReservation(Long id);
}
