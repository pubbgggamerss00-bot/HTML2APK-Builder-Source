package kotlinx.serialization.internal;

/* loaded from: classes2.dex */
public final class ULongSerializer implements zh.b<pg.z> {
    public static final ULongSerializer INSTANCE = new ULongSerializer();
    private static final bi.f descriptor = v.a("kotlin.ULong", ai.a.serializer(kotlin.jvm.internal.t.f16341a));

    private ULongSerializer() {
    }

    @Override // zh.a
    public /* synthetic */ Object deserialize(ci.d dVar) {
        return new pg.z(m107deserializeI7RO_PI(dVar));
    }

    /* renamed from: deserialize-I7RO_PI, reason: not valid java name */
    public long m107deserializeI7RO_PI(ci.d decoder) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        return decoder.e(getDescriptor()).v();
    }

    @Override // zh.i, zh.a
    public bi.f getDescriptor() {
        return descriptor;
    }

    @Override // zh.i
    public /* synthetic */ void serialize(ci.e eVar, Object obj) {
        m108serialize2TYgG_w(eVar, ((pg.z) obj).f21493a);
    }

    /* renamed from: serialize-2TYgG_w, reason: not valid java name */
    public void m108serialize2TYgG_w(ci.e encoder, long j10) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        encoder.f(getDescriptor()).K(j10);
    }
}
