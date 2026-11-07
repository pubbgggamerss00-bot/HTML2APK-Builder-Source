package kotlinx.serialization.internal;

/* loaded from: classes2.dex */
public final class NullableSerializer<T> implements zh.b<T> {
    private final bi.f descriptor;
    private final zh.b<T> serializer;

    public NullableSerializer(zh.b<T> serializer) {
        kotlin.jvm.internal.r.e(serializer, "serializer");
        this.serializer = serializer;
        this.descriptor = new u0(serializer.getDescriptor());
    }

    @Override // zh.a
    public T deserialize(ci.d decoder) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        if (decoder.x()) {
            return (T) decoder.q(this.serializer);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && NullableSerializer.class == obj.getClass() && kotlin.jvm.internal.r.a(this.serializer, ((NullableSerializer) obj).serializer);
    }

    @Override // zh.i, zh.a
    public bi.f getDescriptor() {
        return this.descriptor;
    }

    public int hashCode() {
        return this.serializer.hashCode();
    }

    @Override // zh.i
    public void serialize(ci.e encoder, T t3) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        if (t3 == null) {
            encoder.h();
        } else {
            encoder.v();
            encoder.J(this.serializer, t3);
        }
    }
}
