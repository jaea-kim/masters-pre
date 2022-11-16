package question3;

public class Reservation {
    static final String[] SEAT_TYPE_NAME = {"S", "A", "B"};
    String[][] seatInfo = new String[3][10];
    Reservation() { }

    public String printReservationInfo(int seatType) {
        String info = "";
        System.out.println(seatType);
        for (String name : seatInfo[seatType]) {
            info += (name==null?"_":name);
            info += " ";
        }
       return SEAT_TYPE_NAME[seatType] + "석: " + info;
    }

    public void reservation(String name, int seatNum, int seatType) {
        System.out.println("reservation");
        seatInfo[seatType][seatNum] = name;
    }

    public boolean cancel(String name) {
        for(int i = 0; i < seatInfo.length; i++) {
            for (int j = 0; j < seatInfo[i].length; j++) {
                if (seatInfo[i][j] != null && seatInfo[i][j].equals(name)) {
                    seatInfo[i][j] = null;
                    return true;
                }
            }
        }
        return false;
    }
}
