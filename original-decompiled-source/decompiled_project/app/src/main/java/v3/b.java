package v3;

import q3.g;
import r3.u;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u.a f30559a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30560b;

    public b(u.a aVar, int i10) {
        this.f30559a = aVar;
        this.f30560b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g.c cVar = this.f30559a.f23172c;
        if (cVar != null) {
            cVar.b(this.f30560b);
        }
    }
}
