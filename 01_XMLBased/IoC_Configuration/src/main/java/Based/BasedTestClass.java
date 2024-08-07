package Based;

public class BasedTestClass {
    private String arg;
    public BasedTestClass() {}
    public BasedTestClass(String arg) throws Exception {
        if(arg.trim().isEmpty()) {
            throw new Exception("Err ==> Empty String parameter");
        } else {
            this.arg = arg;
        }
    }
    public void getName() {
        System.out.println(STR."ClassName:<\{this.getClass().getName()}>");
    }
    public void test() {
        if(!arg.trim().isEmpty()) {
            System.out.println(STR."\{this.arg} \{this.getClass().getName()}::test() is called ");
        } else {
            System.out.println(STR."\{this.getClass().getName()}::test() is called");
        }
    }
}
