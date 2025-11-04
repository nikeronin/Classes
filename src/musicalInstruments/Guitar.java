package musicalInstruments;

public class Guitar implements IPlayable{

    @Override
    public void play(chord.chordCount chordCount) {
        System.out.println("Инструмент играет и использует " + chordCount.getCount() + " струн");
    }
}
