package org.classname;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IPLocationFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("helloooo example for GITTTT");
		if(args.length!=1)
		{
			System.out.println("No args");
		}//done with if
		else
		{
			String ipAddress=args[0];
			GeoIPService g= new GeoIPService();
			GeoIPServiceSoap gsp= g.getGeoIPServiceSoap();
			GeoIP xxyy= gsp.getGeoIP(ipAddress);
			System.out.println(xxyy.getCountryName());
			//stub.getCountryName(ipAddress);
		}
	}

}









