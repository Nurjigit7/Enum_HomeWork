public enum Days {
    MONDAY("Дуйшонбу :"),
    TUESDAY( "Шайшемби :"),

    WEDNESDAY("Шаршенби :"),
    THURSDAY("Бейшемби :"),
    FRIDAY("Жума :"),
    SATURDAY("Ишемби :"),
    SUNDAY("Жекшемби :");
    private String plan_days;

    Days(String plan_days) {
        this.plan_days = plan_days;
    }
    @Override
    public String toString() {
        return "Days{" +
                "plan_days='" + plan_days + '\'' +
                '}';
    }

    public static void methodExit(int san){
      String word;
        if (san==0){
            throw new MyException("Программа токтоду!!!");
        }else {
            System.out.println("Улантабыз=> :");
        }
    }



}
