package musicalInstruments;

public class chord {
    public enum chordCount {
        guitar(5),
        piano(36);

        private final int count;

        chordCount(int count) {
            this.count = count;
        }

        public int getCount() {
            return count;
        }
    }
}
