package kotlinx.serialization.internal;

/* loaded from: classes2.dex */
public final class UnitSerializer implements zh.b<pg.f0> {
    public static final UnitSerializer INSTANCE = new UnitSerializer();
    private final /* synthetic */ ObjectSerializer<pg.f0> $$delegate_0 = new ObjectSerializer<>("kotlin.Unit", pg.f0.f21461a);

    private UnitSerializer() {
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public void m115deserialize(ci.d decoder) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        this.$$delegate_0.deserialize(decoder);
    }

    @Override // zh.i, zh.a
    public bi.f getDescriptor() {
        return this.$$delegate_0.getDescriptor();
    }

    @Override // zh.i
    public void serialize(ci.e encoder, pg.f0 value) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        kotlin.jvm.internal.r.e(value, "value");
        this.$$delegate_0.serialize(encoder, value);
    }

    @Override // zh.a
    public /* bridge */ /* synthetic */ Object deserialize(ci.d dVar) {
        m115deserialize(dVar);
        return pg.f0.f21461a;
    }
}
