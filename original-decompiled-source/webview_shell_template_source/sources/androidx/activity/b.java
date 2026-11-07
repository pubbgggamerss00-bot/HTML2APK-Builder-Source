package androidx.activity;

import android.window.BackEvent;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f54a;

    /* renamed from: b, reason: collision with root package name */
    public final float f55b;

    /* renamed from: c, reason: collision with root package name */
    public final float f56c;

    /* renamed from: d, reason: collision with root package name */
    public final int f57d;

    public b(BackEvent backEvent) {
        float fC = a.c(backEvent);
        float fD = a.d(backEvent);
        float fA = a.a(backEvent);
        int iB = a.b(backEvent);
        this.f54a = fC;
        this.f55b = fD;
        this.f56c = fA;
        this.f57d = iB;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f54a + ", touchY=" + this.f55b + ", progress=" + this.f56c + ", swipeEdge=" + this.f57d + '}';
    }
}
