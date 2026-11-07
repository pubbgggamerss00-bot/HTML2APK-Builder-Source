package b;

import android.window.BackEvent;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float f3217a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3218b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3219c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3220d;

    public c(BackEvent backEvent) {
        float fC = a.c(backEvent);
        float fD = a.d(backEvent);
        float fA = a.a(backEvent);
        int iB = a.b(backEvent);
        this.f3217a = fC;
        this.f3218b = fD;
        this.f3219c = fA;
        this.f3220d = iB;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.f3217a);
        sb.append(", touchY=");
        sb.append(this.f3218b);
        sb.append(", progress=");
        sb.append(this.f3219c);
        sb.append(", swipeEdge=");
        return b.a(sb, this.f3220d, '}');
    }
}
