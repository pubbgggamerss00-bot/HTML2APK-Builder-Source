package p3;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l {
    public static void a(int i6, int i7) {
        String strA;
        if (i6 < 0 || i6 >= i7) {
            if (i6 < 0) {
                strA = m.a("%s (%s) must not be negative", "index", Integer.valueOf(i6));
            } else {
                if (i7 < 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 15);
                    sb.append("negative size: ");
                    sb.append(i7);
                    throw new IllegalArgumentException(sb.toString());
                }
                strA = m.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i6), Integer.valueOf(i7));
            }
            throw new IndexOutOfBoundsException(strA);
        }
    }

    public static void b(int i6, int i7, int i8) {
        if (i6 < 0 || i7 < i6 || i7 > i8) {
            throw new IndexOutOfBoundsException((i6 < 0 || i6 > i8) ? c(i6, i8, "start index") : (i7 < 0 || i7 > i8) ? c(i7, i8, "end index") : m.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i7), Integer.valueOf(i6)));
        }
    }

    public static String c(int i6, int i7, String str) {
        if (i6 < 0) {
            return m.a("%s (%s) must not be negative", str, Integer.valueOf(i6));
        }
        if (i7 >= 0) {
            return m.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i6), Integer.valueOf(i7));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 15);
        sb.append("negative size: ");
        sb.append(i7);
        throw new IllegalArgumentException(sb.toString());
    }
}
