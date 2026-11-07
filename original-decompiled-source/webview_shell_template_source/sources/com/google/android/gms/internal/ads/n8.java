package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n8 {
    public static float a(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long b(String str) {
        int i6 = j31.f5914a;
        String[] strArrSplit = str.split("\\.", 2);
        long j6 = 0;
        for (String str2 : strArrSplit[0].split(":", -1)) {
            j6 = (j6 * 60) + Long.parseLong(str2);
        }
        long j7 = j6 * 1000;
        if (strArrSplit.length == 2) {
            j7 += Long.parseLong(strArrSplit[1]);
        }
        return j7 * 1000;
    }
}
