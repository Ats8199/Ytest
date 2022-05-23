package org.allvehicle;

import org.fourwheeler.Fourwheeler;
import org.threewheeler.Threewheeler;
import org.twowheeler.Twowheeler;

public class Vehicle {
private void vehicleNecc() {
	System.out.println("Vehicle: 2W,3W & 4W");
}
public static void main(String[] args) {
	Vehicle v=new Vehicle();
	Twowheeler tw=new Twowheeler();
	Threewheeler t=new Threewheeler();
	Fourwheeler f=new Fourwheeler();
	v.vehicleNecc();
	tw.bike();
	tw.cycle();
	t.Auto();
	f.car();
	f.bus();
	f.lorry();
}
}
