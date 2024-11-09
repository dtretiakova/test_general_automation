package objectsInnerNestedClasses;

public enum DaysOfWeek {
    MONDAY(1, "Monday"),
    TUESDAY(2, "Tuesday"),
    WEDNESDAY(3, "Wednesday"),
    THURSDAY( 4, "Thursday");
    private int field1;
    private String field2;

    private DaysOfWeek(int field1, String field2){
        this.field1 = field1;
        this.field2 = field2;
    }

    public int getField1(){
        return field1;
    }

    public String getField2(){
        return field2;
    }
}
