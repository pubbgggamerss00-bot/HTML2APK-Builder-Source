package q9;

import java.io.IOException;

/* loaded from: classes.dex */
public final class g implements vd.d<s> {

    /* renamed from: a, reason: collision with root package name */
    public static final g f22544a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final vd.c f22545b = vd.c.a("networkType");

    /* renamed from: c, reason: collision with root package name */
    public static final vd.c f22546c = vd.c.a("mobileSubtype");

    @Override // vd.a
    public final void a(Object obj, vd.e eVar) throws IOException {
        s sVar = (s) obj;
        vd.e eVar2 = eVar;
        eVar2.a(f22545b, sVar.b());
        eVar2.a(f22546c, sVar.a());
    }
}
