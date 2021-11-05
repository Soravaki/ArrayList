public class Runner {
    public static void main(String[] args) {
        IntArrayList m = new IntArrayList();
        System.out.println(m.size());
        for (int i=0; i<8; i++){
            if (i > 4) {
                m.add(i+1);
            }
            else m.add(i);

        }
        m.remove(20);
        m.insert(20, 20);
        System.out.println(m.size());
        System.out.println(m);
        System.out.println(m.find(5));
        m.insert(5, 5);
        System.out.println(m);
        System.out.println(m.find(5));
        m.remove(5);
        System.out.println(m);
    }
}
