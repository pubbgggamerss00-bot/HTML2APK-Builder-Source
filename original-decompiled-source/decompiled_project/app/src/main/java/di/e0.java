package di;

import java.util.List;

/* loaded from: classes2.dex */
public final class e0 extends a0 {

    /* renamed from: j, reason: collision with root package name */
    public final kotlinx.serialization.json.v f8002j;

    /* renamed from: k, reason: collision with root package name */
    public final List<String> f8003k;

    /* renamed from: l, reason: collision with root package name */
    public final int f8004l;

    /* renamed from: m, reason: collision with root package name */
    public int f8005m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(kotlinx.serialization.json.b json, kotlinx.serialization.json.v vVar) {
        super(json, vVar, (String) null, 12);
        kotlin.jvm.internal.r.e(json, "json");
        this.f8002j = vVar;
        List<String> listC0 = qg.x.c0(vVar.f16457a.keySet());
        this.f8003k = listC0;
        this.f8004l = listC0.size() * 2;
        this.f8005m = -1;
    }

    @Override // di.a0, kotlinx.serialization.internal.f0
    public final String Q(bi.f descriptor, int i10) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        return this.f8003k.get(i10 / 2);
    }

    @Override // di.a0, di.b
    public final kotlinx.serialization.json.h U(String tag) {
        kotlin.jvm.internal.r.e(tag, "tag");
        return this.f8005m % 2 == 0 ? kotlinx.serialization.json.i.b(tag) : (kotlinx.serialization.json.h) qg.k0.c(tag, this.f8002j);
    }

    @Override // di.a0, di.b
    public final kotlinx.serialization.json.h W() {
        return this.f8002j;
    }

    @Override // di.a0
    /* renamed from: Z */
    public final kotlinx.serialization.json.v W() {
        return this.f8002j;
    }

    @Override // di.a0, di.b, ci.b
    public final void b(bi.f descriptor) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
    }

    @Override // di.a0, ci.b
    public final int g(bi.f descriptor) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        int i10 = this.f8005m;
        if (i10 >= this.f8004l - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.f8005m = i11;
        return i11;
    }
}
