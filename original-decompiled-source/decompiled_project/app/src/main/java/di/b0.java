package di;

import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public class b0 extends f {

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f7989g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(kotlinx.serialization.json.b json, eh.l<? super kotlinx.serialization.json.h, pg.f0> nodeConsumer) {
        super(json, nodeConsumer);
        kotlin.jvm.internal.r.e(json, "json");
        kotlin.jvm.internal.r.e(nodeConsumer, "nodeConsumer");
        this.f7989g = new LinkedHashMap();
    }

    @Override // di.f
    public kotlinx.serialization.json.h c0() {
        return new kotlinx.serialization.json.v(this.f7989g);
    }

    @Override // di.f
    public void d0(String key, kotlinx.serialization.json.h element) {
        kotlin.jvm.internal.r.e(key, "key");
        kotlin.jvm.internal.r.e(element, "element");
        this.f7989g.put(key, element);
    }

    @Override // c2.g0, ci.c
    public final <T> void g(bi.f descriptor, int i10, zh.i<? super T> serializer, T t3) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        kotlin.jvm.internal.r.e(serializer, "serializer");
        if (t3 != null || this.f8008d.f16444c) {
            super.g(descriptor, i10, serializer, t3);
        }
    }
}
