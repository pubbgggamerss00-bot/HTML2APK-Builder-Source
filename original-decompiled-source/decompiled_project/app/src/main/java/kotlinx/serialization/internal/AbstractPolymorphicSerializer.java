package kotlinx.serialization.internal;

/* loaded from: classes2.dex */
public abstract class AbstractPolymorphicSerializer<T> implements zh.b<T> {
    /* JADX INFO: Access modifiers changed from: private */
    public final T decodeSequentially(ci.b bVar) {
        return (T) bVar.u(getDescriptor(), 1, zh.e.a(this, bVar, bVar.z(getDescriptor(), 0)), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zh.a
    public final T deserialize(ci.d decoder) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        bi.f descriptor = getDescriptor();
        ci.b bVarC = decoder.c(descriptor);
        kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        T t3 = null;
        while (true) {
            int iG = bVarC.g(getDescriptor());
            if (iG == -1) {
                if (t3 != null) {
                    bVarC.b(descriptor);
                    return t3;
                }
                throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) g0Var.f16327a)).toString());
            }
            if (iG == 0) {
                g0Var.f16327a = (T) bVarC.z(getDescriptor(), iG);
            } else {
                if (iG != 1) {
                    StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    String str = (String) g0Var.f16327a;
                    if (str == null) {
                        str = "unknown class";
                    }
                    sb.append(str);
                    sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb.append(iG);
                    throw new zh.h(sb.toString());
                }
                T t10 = g0Var.f16327a;
                if (t10 == 0) {
                    throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                }
                g0Var.f16327a = t10;
                t3 = (T) bVarC.u(getDescriptor(), iG, zh.e.a(this, bVarC, (String) t10), null);
            }
        }
    }

    public zh.a<T> findPolymorphicSerializerOrNull(ci.b decoder, String str) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        return decoder.a().d(str, getBaseClass());
    }

    public abstract kh.c<T> getBaseClass();

    @Override // zh.i, zh.a
    public abstract /* synthetic */ bi.f getDescriptor();

    @Override // zh.i
    public final void serialize(ci.e encoder, T value) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        kotlin.jvm.internal.r.e(value, "value");
        zh.i<? super T> iVarB = zh.e.b(this, encoder, value);
        bi.f descriptor = getDescriptor();
        ci.c cVarC = encoder.c(descriptor);
        cVarC.M(getDescriptor(), 0, iVarB.getDescriptor().a());
        cVarC.y(getDescriptor(), 1, iVarB, value);
        cVarC.b(descriptor);
    }

    public zh.i<T> findPolymorphicSerializerOrNull(ci.e encoder, T value) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        kotlin.jvm.internal.r.e(value, "value");
        return encoder.a().e(getBaseClass(), value);
    }
}
