package task27.Visa;

public class VisaElectron extends Visa {

    private boolean _3dSecure;

    public boolean is_3dSecure() {
        return _3dSecure;
    }

    public void set_3dSecure(boolean _3dSecure) {
        this._3dSecure = _3dSecure;
    }

    @Override
    public String toString() {
        return "VisaElectron{" +
                "_3dSecure=" + _3dSecure +
                ", currencyType='" + currencyType + '\'' +
                ", isActive=" + isActive +
                ", number='" + number + '\'' +
                ", cvv='" + cvv + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
