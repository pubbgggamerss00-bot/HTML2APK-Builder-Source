package p;

/* loaded from: classes.dex */
public final /* synthetic */ class i0 {
    public static String a(Object obj, String str) {
        return str.concat(obj.getClass().getName());
    }

    public static StringBuilder b(int i10, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i10);
        sb.append(str2);
        return sb;
    }
}
