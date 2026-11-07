package mc;

import java.util.logging.Level;
import mc.d;
import qc.m;

/* loaded from: classes2.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f18154a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18155b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d.l f18156c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f18157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d.p f18158e;

    public e(d.p pVar, Object obj, int i10, d.l lVar, m mVar) {
        this.f18158e = pVar;
        this.f18154a = obj;
        this.f18155b = i10;
        this.f18156c = lVar;
        this.f18157d = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d.l lVar = this.f18156c;
        try {
            this.f18158e.h(this.f18154a, this.f18155b, lVar, this.f18157d);
        } catch (Throwable th2) {
            d.f18050x.log(Level.WARNING, "Exception thrown during refresh", th2);
            lVar.f18110b.k(th2);
        }
    }
}
