package com.finaltestpractices;

import java.util.Objects;

class CityRainFall {
    String cityname;
    int raininjul;
    int raininaug;

    public CityRainFall(String cityname, int raininjul, int raininaug) 
    {
        this.cityname = cityname;
        this.raininjul = raininjul;
        this.raininaug = raininaug;
    }
    
    

	@Override
	public String toString() {
		return "CityRainFall [cityname=" + cityname + ", raininjul=" + raininjul + ", raininaug=" + raininaug + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(cityname);
	}

	@Override
	public boolean equals(Object obj) {
		CityRainFall obj_city=(CityRainFall) obj;
		if(Objects.equals(cityname, obj_city.cityname))
			return true;
		else
		return  false;
	}
    
    
}