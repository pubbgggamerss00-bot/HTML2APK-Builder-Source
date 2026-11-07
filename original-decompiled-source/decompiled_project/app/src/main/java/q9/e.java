package q9;

import java.io.IOException;

/* loaded from: classes.dex */
public final class e implements vd.d<q> {

    /* renamed from: a, reason: collision with root package name */
    public static final e f22528a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final vd.c f22529b = vd.c.a("eventTimeMs");

    /* renamed from: c, reason: collision with root package name */
    public static final vd.c f22530c = vd.c.a("eventCode");

    /* renamed from: d, reason: collision with root package name */
    public static final vd.c f22531d = vd.c.a("eventUptimeMs");

    /* renamed from: e, reason: collision with root package name */
    public static final vd.c f22532e = vd.c.a("sourceExtension");

    /* renamed from: f, reason: collision with root package name */
    public static final vd.c f22533f = vd.c.a("sourceExtensionJsonProto3");

    /* renamed from: g, reason: collision with root package name */
    public static final vd.c f22534g = vd.c.a("timezoneOffsetSeconds");

    /* renamed from: h, reason: collision with root package name */
    public static final vd.c f22535h = vd.c.a("networkConnectionInfo");

    @Override // vd.a
    public final void a(Object obj, vd.e eVar) throws IOException {
        q qVar = (q) obj;
        vd.e eVar2 = eVar;
        eVar2.b(f22529b, qVar.b());
        eVar2.a(f22530c, qVar.a());
        eVar2.b(f22531d, qVar.c());
        eVar2.a(f22532e, qVar.e());
        eVar2.a(f22533f, qVar.f());
        eVar2.b(f22534g, qVar.g());
        eVar2.a(f22535h, qVar.d());
    }
}
