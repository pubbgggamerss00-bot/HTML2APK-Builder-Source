package ai;

import kh.c;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.j0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.t;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.ByteSerializer;
import kotlinx.serialization.internal.CharSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.DurationSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.NullableSerializer;
import kotlinx.serialization.internal.ReferenceArraySerializer;
import kotlinx.serialization.internal.ShortSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.UByteSerializer;
import kotlinx.serialization.internal.UIntSerializer;
import kotlinx.serialization.internal.ULongSerializer;
import kotlinx.serialization.internal.UShortSerializer;
import kotlinx.serialization.internal.UnitSerializer;
import kotlinx.serialization.internal.UuidSerializer;
import nh.b;
import oh.a;
import pg.c0;
import pg.f0;
import pg.v;
import pg.x;
import pg.z;
import zh.b;

/* loaded from: classes2.dex */
public final class a {
    public static final ReferenceArraySerializer a(c cVar, b elementSerializer) {
        r.e(elementSerializer, "elementSerializer");
        return new ReferenceArraySerializer(cVar, elementSerializer);
    }

    public static final ArrayListSerializer b(b elementSerializer) {
        r.e(elementSerializer, "elementSerializer");
        return new ArrayListSerializer(elementSerializer);
    }

    public static final LinkedHashMapSerializer c(b keySerializer, b valueSerializer) {
        r.e(keySerializer, "keySerializer");
        r.e(valueSerializer, "valueSerializer");
        return new LinkedHashMapSerializer(keySerializer, valueSerializer);
    }

    public static final <T> b<T> d(b<T> bVar) {
        r.e(bVar, "<this>");
        return bVar.getDescriptor().c() ? bVar : new NullableSerializer(bVar);
    }

    public static final b<Character> serializer(f fVar) {
        r.e(fVar, "<this>");
        return CharSerializer.INSTANCE;
    }

    public static final b<Byte> serializer(d dVar) {
        r.e(dVar, "<this>");
        return ByteSerializer.INSTANCE;
    }

    public static final b<Short> serializer(j0 j0Var) {
        r.e(j0Var, "<this>");
        return ShortSerializer.INSTANCE;
    }

    public static final b<Integer> serializer(q qVar) {
        r.e(qVar, "<this>");
        return IntSerializer.INSTANCE;
    }

    public static final b<Long> serializer(t tVar) {
        r.e(tVar, "<this>");
        return LongSerializer.INSTANCE;
    }

    public static final b<Float> serializer(l lVar) {
        r.e(lVar, "<this>");
        return FloatSerializer.INSTANCE;
    }

    public static final b<Double> serializer(k kVar) {
        r.e(kVar, "<this>");
        return DoubleSerializer.INSTANCE;
    }

    public static final b<Boolean> serializer(kotlin.jvm.internal.c cVar) {
        r.e(cVar, "<this>");
        return BooleanSerializer.INSTANCE;
    }

    public static final b<f0> serializer(f0 f0Var) {
        r.e(f0Var, "<this>");
        return UnitSerializer.INSTANCE;
    }

    public static final b<String> serializer(l0 l0Var) {
        r.e(l0Var, "<this>");
        return StringSerializer.INSTANCE;
    }

    public static final b<x> serializer(x.a aVar) {
        r.e(aVar, "<this>");
        return UIntSerializer.INSTANCE;
    }

    public static final b<z> serializer(z.a aVar) {
        r.e(aVar, "<this>");
        return ULongSerializer.INSTANCE;
    }

    public static final b<v> serializer(v.a aVar) {
        r.e(aVar, "<this>");
        return UByteSerializer.INSTANCE;
    }

    public static final b<c0> serializer(c0.a aVar) {
        r.e(aVar, "<this>");
        return UShortSerializer.INSTANCE;
    }

    public static final b<nh.b> serializer(b.a aVar) {
        r.e(aVar, "<this>");
        return DurationSerializer.INSTANCE;
    }

    public static final zh.b<oh.a> serializer(a.C0219a c0219a) {
        r.e(c0219a, "<this>");
        return UuidSerializer.INSTANCE;
    }
}
