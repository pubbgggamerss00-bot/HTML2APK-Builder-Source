package uh;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f29771a = 0;

    public static final long a(String str, long j10, long j11, long j12) {
        String property;
        int i10 = x.f29772a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j10;
        }
        Long lH = mh.s.h(property);
        if (lH == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lH.longValue();
        if (j11 <= jLongValue && jLongValue <= j12) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j11 + ".." + j12 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int b(int i10, int i11, String str) {
        return (int) a(str, i10, 1, (i11 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }
}
