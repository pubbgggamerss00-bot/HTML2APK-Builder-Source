package q9;

import java.io.IOException;

/* loaded from: classes.dex */
public final class f implements vd.d<r> {

    /* renamed from: a, reason: collision with root package name */
    public static final f f22536a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final vd.c f22537b = vd.c.a("requestTimeMs");

    /* renamed from: c, reason: collision with root package name */
    public static final vd.c f22538c = vd.c.a("requestUptimeMs");

    /* renamed from: d, reason: collision with root package name */
    public static final vd.c f22539d = vd.c.a("clientInfo");

    /* renamed from: e, reason: collision with root package name */
    public static final vd.c f22540e = vd.c.a("logSource");

    /* renamed from: f, reason: collision with root package name */
    public static final vd.c f22541f = vd.c.a("logSourceName");

    /* renamed from: g, reason: collision with root package name */
    public static final vd.c f22542g = vd.c.a("logEvent");

    /* renamed from: h, reason: collision with root package name */
    public static final vd.c f22543h = vd.c.a("qosTier");

    @Override // vd.a
    public final void a(Object obj, vd.e eVar) throws IOException {
        r rVar = (r) obj;
        vd.e eVar2 = eVar;
        eVar2.b(f22537b, rVar.f());
        eVar2.b(f22538c, rVar.g());
        eVar2.a(f22539d, rVar.a());
        eVar2.a(f22540e, rVar.c());
        eVar2.a(f22541f, rVar.d());
        eVar2.a(f22542g, rVar.b());
        eVar2.a(f22543h, rVar.e());
    }
}
