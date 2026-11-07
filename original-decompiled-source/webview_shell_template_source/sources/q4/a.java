package q4;

import android.graphics.Typeface;
import androidx.fragment.app.p;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a extends p {
    public final Typeface s;

    /* renamed from: t, reason: collision with root package name */
    public final com.google.android.gms.ads.nonagon.signalgeneration.d f14194t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f14195u;

    public a(com.google.android.gms.ads.nonagon.signalgeneration.d dVar, Typeface typeface) {
        this.s = typeface;
        this.f14194t = dVar;
    }

    @Override // androidx.fragment.app.p
    public final void e(int i6) {
        if (this.f14195u) {
            return;
        }
        n4.b bVar = (n4.b) this.f14194t.s;
        if (bVar.l(this.s)) {
            bVar.j(false);
        }
    }

    @Override // androidx.fragment.app.p
    public final void f(Typeface typeface, boolean z6) {
        if (this.f14195u) {
            return;
        }
        n4.b bVar = (n4.b) this.f14194t.s;
        if (bVar.l(typeface)) {
            bVar.j(false);
        }
    }
}
