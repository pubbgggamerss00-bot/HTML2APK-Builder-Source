package di;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class d0 extends f {

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList<kotlinx.serialization.json.h> f7998g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(kotlinx.serialization.json.b json, eh.l<? super kotlinx.serialization.json.h, pg.f0> nodeConsumer) {
        super(json, nodeConsumer);
        kotlin.jvm.internal.r.e(json, "json");
        kotlin.jvm.internal.r.e(nodeConsumer, "nodeConsumer");
        this.f7998g = new ArrayList<>();
    }

    @Override // di.f
    public final kotlinx.serialization.json.h c0() {
        return new kotlinx.serialization.json.c(this.f7998g);
    }

    @Override // di.f
    public final void d0(String key, kotlinx.serialization.json.h element) throws NumberFormatException {
        kotlin.jvm.internal.r.e(key, "key");
        kotlin.jvm.internal.r.e(element, "element");
        this.f7998g.add(Integer.parseInt(key), element);
    }

    @Override // di.f, c2.g0
    public final String j(bi.f descriptor, int i10) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        return String.valueOf(i10);
    }
}
