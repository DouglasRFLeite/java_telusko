public class AulaStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); // 16

        sb = new StringBuffer("Douglas");
        System.out.println(sb.capacity()); // 23

        sb.append(" Rocha");
        System.out.println(sb); // Douglas Rocha
        System.out.println(sb.capacity()); // 23

        sb.append(" Figueiredo");
        sb.append(" Leite");
        System.out.println(sb); // Douglas Rocha Figueiredo Leite
        System.out.println(sb.capacity()); // 48
        System.out.println(sb.length()); // 29

        sb.insert(0, "Prof. ");
        System.out.println(sb); // Prof. Douglas Rocha Figueiredo Leite
        System.out.println(sb.capacity()); // 48

        sb.deleteCharAt(25);
        System.out.println(sb); // Prof. Douglas Rocha Figueredo Leite
        System.out.println(sb.capacity()); // 48

        sb.ensureCapacity(100);
        System.out.println(sb); // Prof. Douglas Rocha Figueredo Leite
        System.out.println(sb.capacity()); // 100
    }
}
