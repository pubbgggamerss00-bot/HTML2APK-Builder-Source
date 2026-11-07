package di;

/* loaded from: classes2.dex */
public final class w extends b {

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.serialization.json.h f8082f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(kotlinx.serialization.json.b json, kotlinx.serialization.json.h value, String str) {
        super(json, value, str);
        kotlin.jvm.internal.r.e(json, "json");
        kotlin.jvm.internal.r.e(value, "value");
        this.f8082f = value;
        this.f16364a.add("primitive");
    }

    @Override // di.b
    public final kotlinx.serialization.json.h U(String tag) {
        kotlin.jvm.internal.r.e(tag, "tag");
        if (tag == "primitive") {
            return this.f8082f;
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // di.b
    public final kotlinx.serialization.json.h W() {
        return this.f8082f;
    }

    @Override // ci.b
    public final int g(bi.f descriptor) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        return 0;
    }
}
