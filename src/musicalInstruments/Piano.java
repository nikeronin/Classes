package musicalInstruments;

public class Piano implements IPlayable{

    @Override
    public void play(chord.chordCount chordCount) {
        System.out.println("Инструмент играет и использует " + chordCount.getCount() + " струн");
    }
}
