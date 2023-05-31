package pt.ist.socialsoftware.edition.ldod.bff.search.dto;

public class AdvancedDatesDto {
    private boolean dated;
    private String beginDate;
    private String endDate;

    public AdvancedDatesDto() {
    }

    public AdvancedDatesDto(String beginDate, String endDate) {
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public boolean isDated() {
        return dated;
    }

    public void setDated(boolean dated) {
        this.dated = dated;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "AdvancedDatesDto{" +
                "dated=" + dated +
                ", beginDate='" + beginDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
