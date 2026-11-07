package kotlinx.serialization.internal;

/* loaded from: classes2.dex */
public final class v {
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlinx.serialization.internal.InlineClassDescriptorKt$InlinePrimitiveDescriptor$1] */
    public static final u a(String str, final zh.b primitiveSerializer) {
        kotlin.jvm.internal.r.e(primitiveSerializer, "primitiveSerializer");
        return new u(str, new GeneratedSerializer<Object>() { // from class: kotlinx.serialization.internal.InlineClassDescriptorKt$InlinePrimitiveDescriptor$1
            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public zh.b<?>[] childSerializers() {
                return new zh.b[]{primitiveSerializer};
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer, zh.a
            public Object deserialize(ci.d decoder) {
                kotlin.jvm.internal.r.e(decoder, "decoder");
                throw new IllegalStateException("unsupported");
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer, zh.i, zh.a
            public bi.f getDescriptor() {
                throw new IllegalStateException("unsupported");
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer, zh.i
            public void serialize(ci.e encoder, Object obj) {
                kotlin.jvm.internal.r.e(encoder, "encoder");
                throw new IllegalStateException("unsupported");
            }
        });
    }
}
