package q9;

import java.io.IOException;

/* loaded from: classes.dex */
public final class d implements vd.d<p> {

    /* renamed from: a, reason: collision with root package name */
    public static final d f22525a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final vd.c f22526b = vd.c.a("clientType");

    /* renamed from: c, reason: collision with root package name */
    public static final vd.c f22527c = vd.c.a("androidClientInfo");

    @Override // vd.a
    public final void a(Object obj, vd.e eVar) throws IOException {
        p pVar = (p) obj;
        vd.e eVar2 = eVar;
        eVar2.a(f22526b, pVar.b());
        eVar2.a(f22527c, pVar.a());
    }
}
