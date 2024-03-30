class OwnException extends Exception {
    public OwnException(String msg) {
        super(msg);
    }
}

class Test {
    public void methodOne() throws OwnException {
        throw new OwnException("exception from method one");
    }

    public void methodTwo() throws OwnException {
        throw new OwnException("exception from method two");
    }

    public void methodThree() throws OwnException {
        throw new OwnException("exception from method three");
    }
}

public class ExceptionMain {

    public static void main(String[] args) {
        Test test = new Test();
        try {
            test.methodOne();
            test.methodTwo();
            test.methodThree();
        } catch (OwnException ex) {
            System.out.println("catch:"+ex.getMessage());
        } finally {
            System.out.println("finally");
        }
    }
}
