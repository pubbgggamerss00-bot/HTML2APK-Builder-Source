package kotlinx.serialization;

import androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.m;
import bi.d;
import bi.f;
import bi.l;
import ci.e;
import e9.w0;
import eh.a;
import f9.cd;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kh.c;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import pg.f0;
import pg.j;
import pg.k;
import pg.n;
import qg.j0;
import qg.k0;
import qg.z;
import zh.b;
import zh.i;

/* loaded from: classes2.dex */
public final class SealedClassSerializer<T> extends AbstractPolymorphicSerializer<T> {
    private List<? extends Annotation> _annotations;
    private final c<T> baseClass;
    private final Map<c<? extends T>, b<? extends T>> class2Serializer;
    private final j descriptor$delegate;
    private final Map<String, b<? extends T>> serialName2Serializer;

    public SealedClassSerializer(final String serialName, c<T> baseClass, c<? extends T>[] subclasses, b<? extends T>[] subclassSerializers) {
        r.e(serialName, "serialName");
        r.e(baseClass, "baseClass");
        r.e(subclasses, "subclasses");
        r.e(subclassSerializers, "subclassSerializers");
        this.baseClass = baseClass;
        this._annotations = z.f22752a;
        this.descriptor$delegate = w0.a(k.f21466a, new a() { // from class: zh.f
            @Override // eh.a
            public final Object invoke() {
                return SealedClassSerializer.descriptor_delegate$lambda$3(serialName, this);
            }
        });
        if (subclasses.length != subclassSerializers.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + getBaseClass().e() + " should be marked @Serializable");
        }
        int iMin = Math.min(subclasses.length, subclassSerializers.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(new n(subclasses[i10], subclassSerializers[i10]));
        }
        Map<c<? extends T>, b<? extends T>> mapI = k0.i(arrayList);
        this.class2Serializer = mapI;
        Set<Map.Entry<c<? extends T>, b<? extends T>>> setEntrySet = mapI.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String strA = ((b) entry.getValue()).getDescriptor().a();
            Object obj = linkedHashMap.get(strA);
            if (obj == null) {
                linkedHashMap.containsKey(strA);
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + getBaseClass() + "' have the same serial name '" + strA + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(strA, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(j0.a(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (b) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.serialName2Serializer = linkedHashMap2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f descriptor_delegate$lambda$3(String str, SealedClassSerializer sealedClassSerializer) {
        return bi.k.d(str, d.b.f4251a, new f[0], new cd(sealedClassSerializer, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 descriptor_delegate$lambda$3$lambda$2(SealedClassSerializer sealedClassSerializer, bi.a buildSerialDescriptor) {
        r.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
        bi.a.a(buildSerialDescriptor, "type", ai.a.serializer(l0.f16339a).getDescriptor());
        bi.a.a(buildSerialDescriptor, "value", bi.k.d("kotlinx.serialization.Sealed<" + sealedClassSerializer.getBaseClass().e() + '>', l.a.f4276a, new f[0], new m(sealedClassSerializer, 3)));
        List<? extends Annotation> list = sealedClassSerializer._annotations;
        r.e(list, "<set-?>");
        buildSerialDescriptor.f4241b = list;
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 descriptor_delegate$lambda$3$lambda$2$lambda$1(SealedClassSerializer sealedClassSerializer, bi.a buildSerialDescriptor) {
        r.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
        for (Map.Entry<String, b<? extends T>> entry : sealedClassSerializer.serialName2Serializer.entrySet()) {
            bi.a.a(buildSerialDescriptor, entry.getKey(), entry.getValue().getDescriptor());
        }
        return f0.f21461a;
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public zh.a<T> findPolymorphicSerializerOrNull(ci.b decoder, String str) {
        r.e(decoder, "decoder");
        b<? extends T> bVar = this.serialName2Serializer.get(str);
        return bVar != null ? bVar : super.findPolymorphicSerializerOrNull(decoder, str);
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public c<T> getBaseClass() {
        return this.baseClass;
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer, zh.i, zh.a
    public f getDescriptor() {
        return (f) this.descriptor$delegate.getValue();
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public i<T> findPolymorphicSerializerOrNull(e encoder, T value) {
        r.e(encoder, "encoder");
        r.e(value, "value");
        b<? extends T> bVar = this.class2Serializer.get(h0.a(value.getClass()));
        b<? extends T> bVarFindPolymorphicSerializerOrNull = bVar != null ? bVar : super.findPolymorphicSerializerOrNull(encoder, (e) value);
        if (bVarFindPolymorphicSerializerOrNull != null) {
            return bVarFindPolymorphicSerializerOrNull;
        }
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SealedClassSerializer(String serialName, c<T> baseClass, c<? extends T>[] subclasses, b<? extends T>[] subclassSerializers, Annotation[] classAnnotations) {
        this(serialName, baseClass, subclasses, subclassSerializers);
        r.e(serialName, "serialName");
        r.e(baseClass, "baseClass");
        r.e(subclasses, "subclasses");
        r.e(subclassSerializers, "subclassSerializers");
        r.e(classAnnotations, "classAnnotations");
        this._annotations = qg.m.a(classAnnotations);
    }
}
