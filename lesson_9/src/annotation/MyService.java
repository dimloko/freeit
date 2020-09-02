package annotation;

import java.util.Objects;

@Version(num = "1.0.2", name = "Beta")
public class MyService {
    private int varInt;


    public MyService() {
    }

    public int getVarInt() {
        return varInt;
    }

    public void setVarInt(int varInt) {
        this.varInt = varInt;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyService myService = (MyService) o;
        return varInt == myService.varInt;
    }

    @Override
    public int hashCode() {
        return Objects.hash(varInt);
    }

    private void thisClassInfo() {
        System.out.println("This class contains variables\nVarInt = " + this.varInt);
    }
}
