public class SomeValue {
    public static void someMethod(Object value){
        try {
            if (value == null) {
                throw new IllegalArgumentException("value is null");
            }
        }catch (IllegalArgumentException e){
            System.out.println("value is not null");
        }
        System.out.println(value.getClass());
    }

    public static void main(String[] args) {
      someMethod(null);
    }
}
