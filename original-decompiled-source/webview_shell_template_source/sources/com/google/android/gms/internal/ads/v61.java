package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class v61 {

    /* renamed from: a, reason: collision with root package name */
    public final int f9732a;

    public static String a(int i6) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) ((i6 >> 24) & 255));
        sb.append((char) ((i6 >> 16) & 255));
        sb.append((char) ((i6 >> 8) & 255));
        sb.append((char) (i6 & 255));
        return sb.toString();
    }

    public String toString() {
        return a(this.f9732a);
    }
}
