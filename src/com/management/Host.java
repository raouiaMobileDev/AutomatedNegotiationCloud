package com.management;

public class Host {

	private double CPU;
	private double RAM;
	private double disk;
	
	
	public Host (double CPU, double RAM,double disk )
	{
		this.CPU=CPU;
		this.RAM=RAM;
		this.disk=disk;
	}
	public double getCPU() {
		return CPU;
	}
	public void setCPU(double cPU) {
		CPU = cPU;
	}
	public double getRAM() {
		return RAM;
	}
	public void setRAM(double rAM) {
		RAM = rAM;
	}
	public double getDisk() {
		return disk;
	}
	public void setDisk(double disk) {
		this.disk = disk;
	}
	
	
	

}
