// string buffer is used to generate a string

public class String3 {
    public static void main(String[] args){
        // StringBuffer s = new StringBuffer("Java");
        // s.append("FullStack");
        // System.out.println(s);
        // StringBuffer s = new StringBuffer("Java");
        // System.out.println(s.capacity());

        // s.append("JavaFullStack, large application");
        // System.out.println(s.capacity()); // (Oldcapacity *2 )+ 2 
        // s.append("A Person is doing coding");
        // System.out.println(s.capacity()); // (oldcapacity +1 ) + 2
        // s.append("Monday is not a good opening for a week.");
        // System.out.println(s.charAt(2));

        // System.out.println(s.delete(1,3));

        // StringBuffer s = new StringBuffer("Java");
        // System.out.println(s.charAt());
        // System.out.println(s.delete(1,3));
        // System.out.println(s.length());

        // StringBuffer s1 = new StringBuffer("Java");
        // StringBuffer s2 = new StringBuffer("Java");
        // System.out.println(s1.equals(s2));

        // StringBuffer s = new StringBuffer("Java");
        // System.out.println(s.insert(2,"fff"));

        // System.out.println(s.replace(1,3,"WORA"));

        // System.out.println(s.reverse());

        // System.out.println(s.subSequence(1,3));

        // System.out.println(s.substring(1));

        // StringBuffer s = new StringBuffer("Java");
        // // s.setCharAt(1,'s');
        // s.setLength(2);
        // System.out.println(s);

        StringBuffer s = new StringBuffer();
        s.ensureCapacity(100);
        System.out.println(s.capacity());
        s.append("Hello");
        s.trimToSize();
        System.out.println(s.capacity());
        System.out.println(s.indexOf("2"));
        System.out.println(s.lastIndexOf("2"));
    }
}



