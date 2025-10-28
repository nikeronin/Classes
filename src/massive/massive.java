package massive;

public class massive {

    public static void main (String[] args) {
        String [] mass = new String[3];
               mass[0] = "привет";
               mass[1] = "ПОКА";
               mass[2] = "гипербола";
        String upperCaseString0 = mass[0].toUpperCase();
        String lowerCaseString1 = mass[1].toLowerCase();
        StringBuilder Omass = new StringBuilder (mass[2]);
        Omass.setCharAt(2, 'О');
        int position = 3;
        Omass.insert(position, " ");

        mass[2] = Omass.toString();

        System.out.println(upperCaseString0);
        System.out.println(lowerCaseString1);
        System.out.println(mass[2]);

    }
}
