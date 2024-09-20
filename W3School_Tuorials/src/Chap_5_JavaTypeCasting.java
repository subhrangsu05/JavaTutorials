public class Chap_5_JavaTypeCasting {
    public static void main(String[] args) {
        // Widening Casting: Automatically
        byte a = 10;
        short b = a;
        int c = b;
        float d = c;
        double e = d;
        System.out.println(a+" ---> "+((Object)a).getClass().getName());
        System.out.println(b+" ---> "+((Object)b).getClass().getName());
        System.out.println(c+" ---> "+((Object)c).getClass().getTypeName());
        System.out.println(d+" ---> "+((Object)d).getClass().getName());
        System.out.println(e+" ---> "+((Object)e).getClass().getTypeName());

        //Narrowing Casting: Explicitly
        double g = 215.1547879446145D;
        float h = (float) g;
        int i = (int) h;
        short j = (short) i;
        byte k = (byte) j;
        System.out.println(g+" ---> "+(((Object)g).getClass().getName()));
        System.out.println(h+" ---> "+(((Object)h).getClass().getName()));
        System.out.println(i+" ---> "+(((Object)i).getClass().getName()));
        System.out.println(j+" ---> "+(((Object)j).getClass().getName()));
        System.out.println(k+" ---> "+(((Object)k).getClass().getName()));

    }
}
