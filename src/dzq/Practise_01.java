package dzq;
//单例
public class Practise_01 {
    private volatile Practise_01 practise_01;
    public Practise_01 create() {
        if (practise_01 == null) {
            synchronized (Practise_01.class) {
                if (practise_01 == null) {
                    practise_01 = new Practise_01();
                }
            }
        }
        return practise_01;
    }

}
