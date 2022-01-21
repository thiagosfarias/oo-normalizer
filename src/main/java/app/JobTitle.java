package app;

public enum JobTitle {
    SOFTWARE_ENGINEER(0, "Software Engineer"),
    ACCOUNTANT(1, "Accountant"),
    ARCHITECT(2, "Architect"),
    QUANTITY_SURVEYOR(3, "Quantity Surveyor");

    private final int id;
    private String titleNormalised;

    JobTitle(int id, String titleNormalised){
        this.id = id;
        this.titleNormalised = titleNormalised;
    }

    public static JobTitle fromId(int id){return JobTitle.values()[id];}

    public int getId(){return id;}

    public String getJobTitle(){return titleNormalised;}
}
