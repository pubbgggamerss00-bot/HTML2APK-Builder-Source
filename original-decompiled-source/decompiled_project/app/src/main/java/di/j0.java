package di;

import androidx.room.y0;
import bi.l;
import java.lang.annotation.Annotation;
import kotlinx.serialization.SealedClassSerializer;

/* loaded from: classes2.dex */
public final class j0 {
    public static final void a(zh.i iVar, zh.i iVar2, String str) {
        if (iVar instanceof SealedClassSerializer) {
            bi.f descriptor = iVar2.getDescriptor();
            kotlin.jvm.internal.r.e(descriptor, "<this>");
            if (kotlinx.serialization.internal.l0.a(descriptor).contains(str)) {
                StringBuilder sbA = y0.a("Sealed class '", iVar2.getDescriptor().a(), "' cannot be serialized as base class '", ((SealedClassSerializer) iVar).getDescriptor().a(), "' because it has property name that conflicts with JSON class discriminator '");
                sbA.append(str);
                sbA.append("'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                throw new IllegalStateException(sbA.toString().toString());
            }
        }
    }

    public static final void b(bi.l kind) {
        kotlin.jvm.internal.r.e(kind, "kind");
        if (kind instanceof l.b) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof bi.e) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof bi.d) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final String c(bi.f fVar, kotlinx.serialization.json.b json) {
        kotlin.jvm.internal.r.e(fVar, "<this>");
        kotlin.jvm.internal.r.e(json, "json");
        for (Annotation annotation : fVar.getAnnotations()) {
            if (annotation instanceof kotlinx.serialization.json.e) {
                return ((kotlinx.serialization.json.e) annotation).discriminator();
            }
        }
        return json.f16436a.f16446e;
    }

    public static final void d(String str, kotlinx.serialization.json.h element) {
        kotlin.jvm.internal.r.e(element, "element");
        StringBuilder sbA = e.e.a("Class with serial name ", str, " cannot be serialized polymorphically because it is represented as ");
        sbA.append(kotlin.jvm.internal.h0.a(element.getClass()).e());
        sbA.append(". Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
        throw new r(sbA.toString());
    }
}
