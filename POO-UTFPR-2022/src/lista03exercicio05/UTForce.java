package lista03exercicio05;

public class UTForce {
	private int vel = 0;
	
	private String marcha = "neutro";
	
	public void acelerarCarro() {
		vel = vel >= 130 ? 130: vel + 5;
		this.definirMarcha();
	}
	
	public void frearCarro() {
		vel = vel <= 130 ? 0: vel - 5;
		this.definirMarcha();
	}
	
	public void definirMarcha() {
		if(vel == 0) {
			marcha = "neutro";
		}
		else if(vel >= 1 && vel <= 19) {
			marcha = "1";
		}
		else if(vel >= 20 && vel <= 39) {
			marcha = "2";
		}
		else if(vel >= 40 &&  vel <= 59) {
			marcha = "3";
		}
		else if(vel >= 60 && vel <= 89) {
			marcha = "4";
		}
		else if(vel >= 90) {
			marcha = "5";
			System.out.println("velocidade maxima : ");
		}
	}

	@Override
	public String toString() {
		return "UTForce [vel=" + vel + ", marcha=" + marcha + "]";
	}

	public int getVel() {
		return vel;
	}

	public void setVel(int vel) {
		this.vel = vel;
	}

	public String getMarcha() {
		return marcha;
	}

	public void setMarcha(String marcha) {
		this.marcha = marcha;
	}
	
	
}
