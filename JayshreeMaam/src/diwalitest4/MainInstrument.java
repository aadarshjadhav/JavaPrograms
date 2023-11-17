package diwalitest4;

public class MainInstrument {
	
	public static void main(String args[])
	{
		PercussionInstrument Tabla= new PercussionInstrument();
		StringedInstrument Violin = new StringedInstrument();
		
		Tabla.play();
		Tabla.listenSound();
		Tabla.learnInstrument();
		
		Violin.play();
		Violin.listenSound();
		Violin.learnInstrument();
	}

}
