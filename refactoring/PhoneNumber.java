public class PhoneNumber {
    private String officeAreaCode;
    private String officeNumber;

    public PhoneNumber(String officeAreaCode, String officeNumber) {
        this.officeAreaCode = officeAreaCode;
        this.officeNumber = officeNumber;
    }

    public String getPhoneNumber() {
        return this.officeAreaCode + "-" + this.officeNumber;
    }

    public String getOfficeAreaCode() {
        return this.officeAreaCode;
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        this.officeAreaCode = officeAreaCode;
    }

    public String getOfficeNumber() {
        return this.officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }
}
