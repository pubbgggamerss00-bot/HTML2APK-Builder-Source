package n3;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import d3.a;
import d3.d;
import e3.c0;
import e3.i;
import v3.p;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k extends d3.d<a.c.C0047c> implements z2.a {

    /* renamed from: k, reason: collision with root package name */
    public static final d3.a<a.c.C0047c> f13926k = new d3.a<>("AppSet.API", new i(), new a.f());

    /* renamed from: i, reason: collision with root package name */
    public final Context f13927i;

    /* renamed from: j, reason: collision with root package name */
    public final c3.h f13928j;

    public k(Context context, c3.h hVar) {
        super(context, f13926k, a.c.f12712a, d.a.f12720b);
        this.f13927i = context;
        this.f13928j = hVar;
    }

    @Override // z2.a
    public final p a() {
        if (this.f13928j.c(this.f13927i, 212800000) != 0) {
            d3.b bVar = new d3.b(new Status(17, null, null, null));
            p pVar = new p();
            pVar.i(bVar);
            return pVar;
        }
        i.a aVar = new i.a();
        aVar.f12883b = true;
        aVar.f12885d = 0;
        aVar.f12884c = new c3.d[]{z2.g.f15432a};
        aVar.f12882a = new f5.b();
        aVar.f12883b = false;
        aVar.f12885d = 27601;
        return c(0, new c0(aVar, aVar.f12884c, aVar.f12883b, aVar.f12885d));
    }
}
