package musicalInstruments;

public class Main {

    public static void main(String[] args) {
        IPlayable firstGuitar = new Guitar();
        firstGuitar.play(chord.chordCount.guitar);

        IPlayable firstPiano = new Piano();
        firstPiano.play(chord.chordCount.piano);
    }
}
