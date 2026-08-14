package integerTask;

public class MyStringBuilder {
    private char[] value = new char[0];

    public void append(String string){
       char[] chars = string.toCharArray();
        char[] newValue = new char[value.length + chars.length];

        for (int i = 0; i < value.length; i++) {
            newValue[i] = value[i];
        }
        for (int i = 0; i < chars.length; i++) {
            newValue[value.length + i] = chars[i];
        }
        value = newValue;

    }
    @Override
    public String toString() {
        return new String(value);
    }
}
//public class integerTask.Calculator<T> {
//
//    private T value;
//
//    public void setValue(T value) {
//        this.value = value;
//    }
//
//    public T getValue() {
//        return value;
//    }
//}