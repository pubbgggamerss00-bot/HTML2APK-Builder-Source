package i0;

/* loaded from: classes.dex */
public class x1 {
    public static sg.a a(eh.l... lVarArr) {
        if (lVarArr.length > 0) {
            return new sg.a(lVarArr);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static int b(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final void c(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            y.c.a("both minLines " + i10 + " and maxLines " + i11 + " must be greater than zero");
        }
        if (i10 <= i11) {
            return;
        }
        y.c.a("minLines " + i10 + " must be less than or equal to maxLines " + i11);
    }
}
