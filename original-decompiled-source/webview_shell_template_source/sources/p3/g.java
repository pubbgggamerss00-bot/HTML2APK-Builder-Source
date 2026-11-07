package p3;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g {
    public static void a(Object[] objArr, int i6) {
        for (int i7 = 0; i7 < i6; i7++) {
            if (objArr[i7] == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 9);
                sb.append("at index ");
                sb.append(i7);
                throw new NullPointerException(sb.toString());
            }
        }
    }
}
