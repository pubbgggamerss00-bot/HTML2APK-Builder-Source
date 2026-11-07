package p;

/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final long[] f20748a = {-9187201950435737345L, -1};

    /* renamed from: b, reason: collision with root package name */
    public static final l0 f20749b = new l0(0);

    public static final int a(int i10) {
        if (i10 == 7) {
            return 6;
        }
        return i10 - (i10 / 8);
    }

    public static final <K, V> l0<K, V> b() {
        return new l0<>((Object) null);
    }

    public static final int c(int i10) {
        if (i10 == 0) {
            return 6;
        }
        return (i10 * 2) + 1;
    }

    public static final int d(int i10) {
        if (i10 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i10);
        }
        return 0;
    }

    public static final int e(int i10) {
        if (i10 == 7) {
            return 8;
        }
        return m.b.a(i10, 1, 7, i10);
    }
}
