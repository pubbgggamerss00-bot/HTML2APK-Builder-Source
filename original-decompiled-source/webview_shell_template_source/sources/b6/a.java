package b6;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final v f2012a = new v(0, "NO_DECISION");

    public static final long a(String str, long j6, long j7, long j8) {
        String property;
        Long lValueOf;
        boolean z6;
        int i6;
        int i7;
        int i8 = w.f2050a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j6;
        }
        int length = property.length();
        if (length == 0) {
            lValueOf = null;
            break;
        }
        int i9 = 0;
        char cCharAt = property.charAt(0);
        long j9 = -9223372036854775807L;
        if (cCharAt < '0') {
            z6 = true;
            if (length != 1) {
                if (cCharAt == '+') {
                    z6 = false;
                    i9 = 1;
                } else if (cCharAt == '-') {
                    j9 = Long.MIN_VALUE;
                    i9 = 1;
                }
            }
            lValueOf = null;
            break;
        }
        z6 = false;
        long j10 = 0;
        long j11 = -256204778801521550L;
        while (i9 < length) {
            int iDigit = Character.digit((int) property.charAt(i9), 10);
            if (iDigit >= 0) {
                if (j10 >= j11) {
                    i6 = length;
                    i7 = i9;
                } else if (j11 == -256204778801521550L) {
                    i6 = length;
                    i7 = i9;
                    j11 = j9 / 10;
                    if (j10 < j11) {
                    }
                }
                long j12 = j10 * 10;
                long j13 = iDigit;
                if (j12 >= j9 + j13) {
                    j10 = j12 - j13;
                    i9 = i7 + 1;
                    length = i6;
                }
            }
            lValueOf = null;
            break;
        }
        lValueOf = z6 ? Long.valueOf(j10) : Long.valueOf(-j10);
        if (lValueOf == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lValueOf.longValue();
        if (j7 <= jLongValue && jLongValue <= j8) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j7 + ".." + j8 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int b(int i6, int i7, String str) {
        return (int) a(str, i6, 1, (i7 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }
}
