package i9;

import x0.u1;
import x0.v1;
import x0.x1;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f14324a;

    /* renamed from: b, reason: collision with root package name */
    public final float f14325b;

    /* renamed from: c, reason: collision with root package name */
    public final float f14326c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14327d;

    /* renamed from: e, reason: collision with root package name */
    public final u1 f14328e;

    /* renamed from: f, reason: collision with root package name */
    public final u1 f14329f;

    /* renamed from: g, reason: collision with root package name */
    public final u1 f14330g;

    /* renamed from: h, reason: collision with root package name */
    public final u1 f14331h;

    /* renamed from: i, reason: collision with root package name */
    public final x1 f14332i;

    /* renamed from: j, reason: collision with root package name */
    public final x1 f14333j;

    /* renamed from: k, reason: collision with root package name */
    public final v1 f14334k;

    public f0(int i10, float f10, float f11, float f12, float f13, String breedId) {
        kotlin.jvm.internal.r.e(breedId, "breedId");
        this.f14324a = i10;
        this.f14325b = f10;
        this.f14326c = f13;
        this.f14327d = breedId;
        this.f14328e = new u1(f11);
        this.f14329f = new u1(f12);
        this.f14330g = new u1(f11);
        this.f14331h = new u1(f12);
        hh.c.f13027a.getClass();
        this.f14332i = bg.b.h(Boolean.valueOf(hh.c.f13028b.g().nextBoolean()));
        this.f14333j = bg.b.h(e.f14309a);
        this.f14334k = new v1(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e a() {
        return (e) this.f14333j.getValue();
    }
}
