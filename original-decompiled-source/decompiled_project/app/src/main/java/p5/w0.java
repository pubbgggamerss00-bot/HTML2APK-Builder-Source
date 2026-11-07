package p5;

import p5.u0;

/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final u0.a f21296a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f21297b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21298c;

    /* renamed from: d, reason: collision with root package name */
    public int f21299d;

    /* renamed from: e, reason: collision with root package name */
    public String f21300e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21301f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21302g;

    public w0() {
        u0.a aVar = new u0.a();
        aVar.f21287a = -1;
        aVar.f21291e = -1;
        aVar.f21292f = -1;
        this.f21296a = aVar;
        this.f21299d = -1;
    }

    public final void a(eh.l lVar, String route) {
        kotlin.jvm.internal.r.e(route, "route");
        if (mh.x.A(route)) {
            throw new IllegalArgumentException("Cannot pop up to an empty route");
        }
        this.f21300e = route;
        this.f21299d = -1;
        this.f21301f = false;
        e1 e1Var = new e1();
        lVar.invoke(e1Var);
        this.f21301f = e1Var.f21207a;
        this.f21302g = e1Var.f21208b;
    }
}
