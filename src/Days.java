public enum Days {
    MONDAY("Дуйшонбу :"),
    TUESDAY( "Шайшемби :"),

    WEDNESDAY("Шаршенби :"),
    THURSDAY("Бейшемби :"),
    FRIDAY("Жума :"),
    SATURDAY("Ишемби :"),
    SUNDAY("Жекшемби :");
    private final String days;

    Days(String days) {
        this.days = days;
    }
    @Override
    public String toString() {
        return "Days{" +
                "plan_days='" + days + '\'' +
                '}';
    }

}
