package confirm.ch07;

abstract class Machine {
	public void powerOn() {}
	public void powerOff() {}
	public abstract void work();	
}

class Computer extends Machine {
	@Override
	public void work() {
		// TODO Auto-generated method stub
		
	}
}
public class Test10 {

}
