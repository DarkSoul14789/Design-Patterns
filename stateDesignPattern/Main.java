package stateDesignPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv = new TV();
		
		try {
			
			tv.getState().turnOn(tv);
			
			System.out.println("TV volume: "+tv.getVolume());
			tv.getState().increaseVolume(tv);
			tv.getState().increaseVolume(tv);
			tv.getState().increaseVolume(tv);
			tv.getState().increaseVolume(tv);
			System.out.println("TV volume: "+tv.getVolume());
			
			System.out.println("TV channel: "+tv.getChannel());			
			tv.getState().changeChannel(tv, 5);
			System.out.println("TV channel: "+tv.getChannel());	
			
			tv.getState().turnOff(tv);
			
			} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getLocalizedMessage());
		}
	}

}
