package t0;

import com.google.android.gms.internal.ads.ti;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c<T> extends ti {

    /* renamed from: u, reason: collision with root package name */
    public final Object f14403u;

    public c() {
        super(12, 3);
        this.f14403u = new Object();
    }

    @Override // com.google.android.gms.internal.ads.ti
    public final T c() {
        T t6;
        synchronized (this.f14403u) {
            t6 = (T) super.c();
        }
        return t6;
    }

    @Override // com.google.android.gms.internal.ads.ti
    public final boolean d(T t6) {
        boolean zD;
        synchronized (this.f14403u) {
            zD = super.d(t6);
        }
        return zD;
    }
}
