package r0;

import android.graphics.Typeface;
import l0.f;
import m0.e;
import v3.p;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a implements Runnable {
    public final /* synthetic */ int s = 0;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f14216t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f14217u;

    public a(v3.m mVar, p pVar) {
        this.f14217u = mVar;
        this.f14216t = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                e.a aVar = (e.a) this.f14216t;
                Typeface typeface = (Typeface) this.f14217u;
                f.c cVar = aVar.f13863a;
                if (cVar != null) {
                    cVar.c(typeface);
                    return;
                }
                return;
            default:
                synchronized (((v3.m) this.f14217u).f14813t) {
                    try {
                        v3.i iVar = ((v3.m) this.f14217u).f14814u;
                        if (iVar != null) {
                            iVar.f14806u.j(((p) this.f14216t).e());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public a(e.a aVar, Typeface typeface) {
        this.f14216t = aVar;
        this.f14217u = typeface;
    }
}
