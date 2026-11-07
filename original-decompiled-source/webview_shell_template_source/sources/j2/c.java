package j2;

import androidx.lifecycle.r;
import androidx.work.n;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c implements n {

    /* renamed from: c, reason: collision with root package name */
    public final r<n.a> f13449c = new r<>();

    /* renamed from: d, reason: collision with root package name */
    public final t2.c<n.a.c> f13450d = new t2.c<>();

    public c() {
        a(n.f1839b);
    }

    public final void a(n.a aVar) {
        this.f13449c.postValue(aVar);
        boolean z6 = aVar instanceof n.a.c;
        t2.c<n.a.c> cVar = this.f13450d;
        if (z6) {
            cVar.h((n.a.c) aVar);
        } else if (aVar instanceof n.a.C0022a) {
            cVar.i(((n.a.C0022a) aVar).f1840a);
        }
    }
}
