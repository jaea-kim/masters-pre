package question3;

public class Reservation {
    static final String[] SEAT_TYPE_NAME = {"S", "A", "B"};
    String[][] seatInfo = new String[3][10];
    Reservation() { }

    public String printReservationInfo(int seatType) {
        String info = "";
        for (String name : seatInfo[seatType]) {
            info += (name==null?"_":name);
            info += " ";
        }
       return SEAT_TYPE_NAME[seatType] + "석: " + info;
    }

    public boolean reservation(String name, int seatNum, int seatType) {
        if (seatInfo[seatType][seatNum] != null) return false;
        seatInfo[seatType][seatNum] = name;
        return true;
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
