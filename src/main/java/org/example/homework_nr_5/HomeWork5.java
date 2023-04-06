package org.example.homework_nr_5;
public class HomeWork5 {

     enum Month {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
    }

    enum Weekday {
        MONDAY(true, true),
        TUESDAY(true, true),
        WEDNESDAY(true, true),
        THURSDAY(true, true),
        FRIDAY(true, true),
        SATURDAY(false, true),
        SUNDAY(false, true);

        boolean isWeekday;
        boolean isHoliday;

        Weekday(boolean isWeekday, boolean isHoliday) {
            this.isWeekday = isWeekday;
            this.isHoliday = isHoliday;
        }

        boolean isWeekday() {
            return isWeekday;
        }

        boolean isHoliday() {
            return isHoliday;
        }
    }

    public static void main(String[] args) {
        for (Month month : Month.values()) {
            System.out.println(month);
        }

        System.out.println(Weekday.MONDAY.isWeekday()); // true

        String strTrue = "true";
        boolean boolTrue = Boolean.parseBoolean(strTrue);

        String strByte = "120";
        byte byteNum = Byte.parseByte(strByte);

        String strShort = "32000";
        short shortNum = Short.parseShort(strShort);

        String strInt = "147895632";
        int intNum = Integer.parseInt(strInt);

        String strLong = "987654321987654321";
        long longNum = Long.parseLong(strLong);

        String strDouble = "4444.5d";
        double doubleNum = Double.parseDouble(strDouble);

        String strFloat = "2354.56f";
        float floatNum = Float.parseFloat(strFloat);

        System.out.println(doubleNum);
     }

}
