package di;

/* loaded from: classes2.dex */
public final class c0 extends b {

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.serialization.json.c f7992f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7993g;

    /* renamed from: h, reason: collision with root package name */
    public int f7994h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(kotlinx.serialization.json.b json, kotlinx.serialization.json.c value) {
        super(json, value, null);
        kotlin.jvm.internal.r.e(json, "json");
        kotlin.jvm.internal.r.e(value, "value");
        this.f7992f = value;
        this.f7993g = value.f16439a.size();
        this.f7994h = -1;
    }

    @Override // kotlinx.serialization.internal.f0
    public final String Q(bi.f descriptor, int i10) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        return String.valueOf(i10);
    }

    @Override // di.b
    public final kotlinx.serialization.json.h U(String tag) throws NumberFormatException {
        kotlin.jvm.internal.r.e(tag, "tag");
        return this.f7992f.f16439a.get(Integer.parseInt(tag));
    }

    @Override // di.b
    public final kotlinx.serialization.json.h W() {
        return this.f7992f;
    }

    @Override // ci.b
    public final int g(bi.f descriptor) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        int i10 = this.f7994h;
        if (i10 >= this.f7993g - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.f7994h = i11;
        return i11;
    }
}
