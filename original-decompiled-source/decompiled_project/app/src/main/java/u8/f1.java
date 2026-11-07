package u8;

import hh.c;
import x0.u1;
import x0.v1;
import x0.x1;

/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final k8.d f29449a;

    /* renamed from: b, reason: collision with root package name */
    public final u1 f29450b;

    /* renamed from: c, reason: collision with root package name */
    public final u1 f29451c;

    /* renamed from: d, reason: collision with root package name */
    public final u1 f29452d;

    /* renamed from: e, reason: collision with root package name */
    public final u1 f29453e;

    /* renamed from: f, reason: collision with root package name */
    public final x1 f29454f;

    /* renamed from: g, reason: collision with root package name */
    public final x1 f29455g;

    /* renamed from: h, reason: collision with root package name */
    public final v1 f29456h;

    /* renamed from: i, reason: collision with root package name */
    public final u1 f29457i;

    /* renamed from: j, reason: collision with root package name */
    public final v1 f29458j;

    public f1(k8.d breed, float f10, float f11) {
        kotlin.jvm.internal.r.e(breed, "breed");
        this.f29449a = breed;
        this.f29450b = new u1(f10);
        this.f29451c = new u1(f11);
        this.f29452d = new u1(f10);
        this.f29453e = new u1(f11);
        c.a aVar = hh.c.f13027a;
        aVar.getClass();
        this.f29454f = bg.b.h(Boolean.valueOf(hh.c.f13028b.g().nextBoolean()));
        this.f29455g = bg.b.h(a.f29388a);
        this.f29456h = new v1(0);
        this.f29457i = new u1((aVar.g() * 0.6f) + 0.6f);
        this.f29458j = new v1(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a a() {
        return (a) this.f29455g.getValue();
    }

    public final void b(boolean z10) {
        this.f29454f.setValue(Boolean.valueOf(z10));
    }
}
