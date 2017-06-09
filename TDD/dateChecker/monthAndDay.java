public class monthAndDay {
    int month;
    int day;

    public monthAndDay(int month, int day) {
        this.month = month;
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String getSeason() {
        String season = "";

        if (month >= 3 && month <= 6) {
            if (month == 3 && day < 20) {
                season = "winter";
            }
            else if (month == 6 && day > 20) {
                season = "summer";
            } else {season = "spring";
            }
        }
        else if (month >=6 && month <= 9) {
            if (month == 6 && day <= 20) {
                season = "spring";
            } else if (month == 9 && day > 20) {
                season = "autumn";
            } else {
                season = "summer";
            }
        }

        else if (month >=9 && month <= 12) {
            if (month == 9 && day <= 20) {
                season = "summer";
            } else if (month == 12 && day > 20) {
                season = "winter";
            } else {
                season = "autumn";
            }
        }

        else if (month >=12 && month <= 3) {
            if (month == 12 && day < 20) {
                season = "autumn";
            } else if (month == 3){
                season = "winter";
            }
        }
        return season;
    }
}