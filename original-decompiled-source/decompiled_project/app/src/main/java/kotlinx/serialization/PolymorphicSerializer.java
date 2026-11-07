package kotlinx.serialization;

import bi.a;
import bi.d;
import bi.f;
import bi.g;
import bi.l;
import c9.o0;
import e9.w0;
import f9.yc;
import java.lang.annotation.Annotation;
import java.util.List;
import kh.c;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import pg.f0;
import pg.j;
import pg.k;
import qg.m;
import qg.z;

/* loaded from: classes2.dex */
public final class PolymorphicSerializer<T> extends AbstractPolymorphicSerializer<T> {
    private List<? extends Annotation> _annotations;
    private final c<T> baseClass;
    private final j descriptor$delegate;

    public PolymorphicSerializer(c<T> baseClass) {
        r.e(baseClass, "baseClass");
        this.baseClass = baseClass;
        this._annotations = z.f22752a;
        this.descriptor$delegate = w0.a(k.f21466a, new o0(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f descriptor_delegate$lambda$1(PolymorphicSerializer polymorphicSerializer) {
        g gVarD = bi.k.d("kotlinx.serialization.Polymorphic", d.a.f4250a, new f[0], new yc(polymorphicSerializer, 3));
        c<T> context = polymorphicSerializer.getBaseClass();
        r.e(context, "context");
        return new bi.c(gVarD, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 descriptor_delegate$lambda$1$lambda$0(PolymorphicSerializer polymorphicSerializer, a buildSerialDescriptor) {
        r.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
        a.a(buildSerialDescriptor, "type", ai.a.serializer(l0.f16339a).getDescriptor());
        a.a(buildSerialDescriptor, "value", bi.k.d("kotlinx.serialization.Polymorphic<" + polymorphicSerializer.getBaseClass().e() + '>', l.a.f4276a, new f[0], new bi.j()));
        List<? extends Annotation> list = polymorphicSerializer._annotations;
        r.e(list, "<set-?>");
        buildSerialDescriptor.f4241b = list;
        return f0.f21461a;
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public c<T> getBaseClass() {
        return this.baseClass;
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer, zh.i, zh.a
    public f getDescriptor() {
        return (f) this.descriptor$delegate.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + getBaseClass() + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PolymorphicSerializer(c<T> baseClass, Annotation[] classAnnotations) {
        this(baseClass);
        r.e(baseClass, "baseClass");
        r.e(classAnnotations, "classAnnotations");
        this._annotations = m.a(classAnnotations);
    }
}
