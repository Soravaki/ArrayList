public class Runner {
    public static void main(String[] args) {
        IntArrayList m = new IntArrayList();
        System.out.println(m.size());
        for (int i=0; i<10; i++){
            m.add(i);
        }
        System.out.println(m.size());
    }
}
