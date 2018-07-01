package classes;

import java.util.Random;

import enums.Enumerations;
import interfaces.IOperations;

public class PogodiBroj implements IOperations {
	
	protected int x; //Gornja granica za random
	protected int y; //Random broj
	protected int z; //Pokusaj korisnika
	protected int q; //Broj preostalih pokusaja
	protected int p; //Broj poena


	protected Enumerations odnos; //Odnos pokusaja sa random generisanim brojem ( > , < , = )
	
	public PogodiBroj() {
		this.x = x;
		this.y = y;
		this.z = z;
		this.q = q;
		this.odnos = odnos;
	}
	
	public PogodiBroj(int x, int z) {
		
	}

	Random rand = new Random();
	
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * @return the z
	 */
	public int getZ() {
		return z;
	}

	/**
	 * @param z the z to set
	 */
	public void setZ(int z) {
		this.z = z;
	}

	/**
	 * @return the q
	 */
	public int getQ() {
		return q;
	}

	/**
	 * @param q the q to set
	 */
	public void setQ(int q) {
		this.q = q;
	}
	
	public int getP() {
		return p;
	}

	public void setP(int p) {
		this.p = p;
	}
	/**
	 * @return the odnos
	 */
	public Enumerations getOdnos() {
		return odnos;
	}

	/**
	 * @param odnos the odnos to set
	 */
	public void setOdnos(Enumerations odnos) {
		this.odnos = odnos;
	}
	
	public Enumerations Pokusaj () {
		if ( z >= y ) {
			if ( z == y) {
				odnos = Enumerations.Jednak;
				return odnos;
			} else 
				odnos = Enumerations.Veci;
				return odnos;
		} else 
			odnos = Enumerations.Manji;
			return odnos;
		
	}
	
	public void Generisi() {
		int o = rand.nextInt(x) + 1;
		setY(o);
	}
	
	public int BrPokusaja() {
		q = (y / 5) + 5;
		return q;
	}

	@Override
	public int BrPoena() {
		// TODO Auto-generated method stub
		p=q*100;
		return p;
	}
	
}