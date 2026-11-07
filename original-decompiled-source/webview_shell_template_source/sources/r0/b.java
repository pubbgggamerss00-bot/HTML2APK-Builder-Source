package r0;

import com.google.android.gms.internal.ads.la2;
import m0.e;
import r0.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final e.a f14218a;

    /* renamed from: b, reason: collision with root package name */
    public final e3.n f14219b;

    public b(e.a aVar, e3.n nVar) {
        this.f14218a = aVar;
        this.f14219b = nVar;
    }

    public final void a(j.a aVar) {
        int i6 = aVar.f14245b;
        e3.n nVar = this.f14219b;
        e.a aVar2 = this.f14218a;
        if (i6 == 0) {
            nVar.execute(new a(aVar2, aVar.f14244a));
        } else {
            nVar.execute(new la2(i6, 1, aVar2));
        }
    }
}
