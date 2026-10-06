package Interface;

public class SmartPhone implements Camera, MusicPlayer{

	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		System.out.println("music quality is good");
	}

	@Override
	public void takePhoto() {
		// TODO Auto-generated method stub
		System.out.println("108mp camera quality");
	}
	public static void main(String[] args) {
		SmartPhone s = new SmartPhone();
		s.playMusic();
		s.takePhoto();
	}
	
	

}
