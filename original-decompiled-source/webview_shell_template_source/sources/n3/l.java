package n3;

import android.content.Context;
import com.google.android.gms.internal.consent_sdk.x;
import v3.p;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l implements z2.a {

    /* renamed from: a, reason: collision with root package name */
    public final k f13929a;

    /* renamed from: b, reason: collision with root package name */
    public final h f13930b;

    public l(Context context) {
        h hVar;
        this.f13929a = new k(context, c3.h.f2184b);
        synchronized (h.class) {
            try {
                if (h.f13922d == null) {
                    h.f13922d = new h(context.getApplicationContext());
                }
                hVar = h.f13922d;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f13930b = hVar;
    }

    @Override // z2.a
    public final p a() {
        p pVarA = this.f13929a.a();
        com.google.android.gms.ads.internal.overlay.i iVar = new com.google.android.gms.ads.internal.overlay.i(4, this);
        pVarA.getClass();
        x xVar = v3.g.f14801a;
        p pVar = new p();
        pVarA.f14816b.b(new v3.i(xVar, iVar, pVar));
        pVarA.m();
        return pVar;
    }
}
