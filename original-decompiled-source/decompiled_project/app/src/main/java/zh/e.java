package zh;

import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.r;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;

/* loaded from: classes2.dex */
public final class e {
    public static final <T> a<T> a(AbstractPolymorphicSerializer<T> abstractPolymorphicSerializer, ci.b bVar, String str) {
        r.e(abstractPolymorphicSerializer, "<this>");
        a<T> aVarFindPolymorphicSerializerOrNull = abstractPolymorphicSerializer.findPolymorphicSerializerOrNull(bVar, str);
        if (aVarFindPolymorphicSerializerOrNull != null) {
            return aVarFindPolymorphicSerializerOrNull;
        }
        bg.b.m(str, abstractPolymorphicSerializer.getBaseClass());
        throw null;
    }

    public static final <T> i<T> b(AbstractPolymorphicSerializer<T> abstractPolymorphicSerializer, ci.e encoder, T value) {
        r.e(abstractPolymorphicSerializer, "<this>");
        r.e(encoder, "encoder");
        r.e(value, "value");
        i<T> iVarFindPolymorphicSerializerOrNull = abstractPolymorphicSerializer.findPolymorphicSerializerOrNull(encoder, (ci.e) value);
        if (iVarFindPolymorphicSerializerOrNull != null) {
            return iVarFindPolymorphicSerializerOrNull;
        }
        kotlin.jvm.internal.h hVarA = h0.a(value.getClass());
        kh.c<T> baseClass = abstractPolymorphicSerializer.getBaseClass();
        r.e(baseClass, "baseClass");
        String strE = hVarA.e();
        if (strE == null) {
            strE = String.valueOf(hVarA);
        }
        bg.b.m(strE, baseClass);
        throw null;
    }
}
