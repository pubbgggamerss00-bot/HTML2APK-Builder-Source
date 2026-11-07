package v3;

import r3.u;
import v3.j;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final u.a f30561a;

    /* renamed from: b, reason: collision with root package name */
    public final n f30562b;

    public c(u.a aVar, n nVar) {
        this.f30561a = aVar;
        this.f30562b = nVar;
    }

    public final void a(j.a aVar) {
        int i10 = aVar.f30590b;
        n nVar = this.f30562b;
        u.a aVar2 = this.f30561a;
        if (i10 == 0) {
            nVar.execute(new a(aVar2, aVar.f30589a));
        } else {
            nVar.execute(new b(aVar2, i10));
        }
    }
}
