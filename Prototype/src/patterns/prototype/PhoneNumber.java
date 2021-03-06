package patterns.prototype;

public class PhoneNumber implements Clonable {
    private String countryCode;
    private String number;

    public PhoneNumber(String countryCode, String number) {
        this.countryCode = countryCode;
        this.number = number;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String toString() {
        return this.getCountryCode() + " " + this.getNumber();
    }

    public Object clone() {
        return new PhoneNumber(this.getCountryCode(), this.getNumber());
    }
}
