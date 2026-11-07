package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ml1 extends ll1 {
    public final char s;

    public ml1(char c7) {
        this.s = c7;
    }

    @Override // com.google.android.gms.internal.ads.nl1
    public final boolean a(char c7) {
        return c7 == this.s;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i6 = this.s;
        for (int i7 = 0; i7 < 4; i7++) {
            cArr[5 - i7] = "0123456789ABCDEF".charAt(i6 & 15);
            i6 >>= 4;
        }
        return androidx.camera.camera2.internal.v0.b("CharMatcher.is('", String.copyValueOf(cArr), "')");
    }
}
