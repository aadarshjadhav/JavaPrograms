package com.testprograms5;

import java.util.Comparator;

public class ShipmentComparatorCityDate implements Comparator<Shipment>{

	@Override
	public int compare(Shipment o1, Shipment o2) {
		
		if(o1.getAds().getCity().equals(o2.getAds().getCity()))
			return o1.getShipdate().compareTo(o2.getShipdate());
		else
			return o1.getAds().getCity().compareTo(o2.getAds().getCity());
	}

}
