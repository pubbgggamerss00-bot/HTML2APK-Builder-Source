package di;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class x extends f {

    /* renamed from: g, reason: collision with root package name */
    public kotlinx.serialization.json.h f8083g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(kotlinx.serialization.json.b json, eh.l<? super kotlinx.serialization.json.h, pg.f0> nodeConsumer) {
        super(json, nodeConsumer);
        kotlin.jvm.internal.r.e(json, "json");
        kotlin.jvm.internal.r.e(nodeConsumer, "nodeConsumer");
        ((ArrayList) this.f4646a).add("primitive");
    }

    @Override // di.f
    public final kotlinx.serialization.json.h c0() {
        kotlinx.serialization.json.h hVar = this.f8083g;
        if (hVar != null) {
            return hVar;
        }
        throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
    }

    @Override // di.f
    public final void d0(String key, kotlinx.serialization.json.h element) {
        kotlin.jvm.internal.r.e(key, "key");
        kotlin.jvm.internal.r.e(element, "element");
        if (key != "primitive") {
            throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag");
        }
        if (this.f8083g != null) {
            throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
        }
        this.f8083g = element;
        this.f8007c.invoke(element);
    }
}
