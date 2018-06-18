package domain.login;

import model.CardDetails;
import model.Trip;
import model.Driver;
import model.Cab;
import java.math.BigInteger;
import model.Booking;

//import model.CabType;



public interface MakeBookingDAO {
	public CardDetails RetrieveCardDetails(String netId);
	public Cab RetrieveCabDetails(String cabTypeInfo);
	public Booking SetBookingInfo(Booking bookingInfo);
	public Booking GetBookingId(Booking bookingInfo);
	public String SetTripInfo(String driverId, String licenseNo, BigInteger bookingId);
	public Driver RetrieveDriverDetails(String licenseNo, BigInteger bookingId);

}




