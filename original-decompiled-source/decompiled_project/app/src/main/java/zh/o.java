package zh;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.r;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.MapEntrySerializer;
import kotlinx.serialization.internal.PairSerializer;
import kotlinx.serialization.internal.TripleSerializer;
import kotlinx.serialization.internal.k0;
import kotlinx.serialization.internal.l0;
import kotlinx.serialization.internal.t0;
import pg.t;
import qg.z;

/* loaded from: classes2.dex */
public final /* synthetic */ class o {
    public static final Class<?> a(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            r.d(rawType, "getRawType(...)");
            return a(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            r.d(upperBounds, "getUpperBounds(...)");
            Object objT = qg.o.t(upperBounds);
            r.d(objT, "first(...)");
            return a((Type) objT);
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            r.d(genericComponentType, "getGenericComponentType(...)");
            return a(genericComponentType);
        }
        throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + h0.a(type.getClass()));
    }

    public static final <T> b<T> b(ei.b bVar, Class<T> cls, List<? extends b<Object>> list) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        b[] bVarArr = (b[]) list.toArray(new b[0]);
        b<T> bVarA = k0.a(cls, (b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        if (bVarA != null) {
            return bVarA;
        }
        kotlin.jvm.internal.h hVarA = h0.a(cls);
        rg.c cVar = t0.f16413a;
        b<T> bVar2 = (b) t0.f16413a.get(hVarA);
        if (bVar2 != null) {
            return bVar2;
        }
        b<T> bVarB = bVar.b(hVarA, list);
        if (bVarB != null) {
            return bVarB;
        }
        if (cls.isInterface()) {
            return new PolymorphicSerializer(h0.a(cls));
        }
        return null;
    }

    public static final b<Object> c(ei.b bVar, Type type, boolean z10) {
        ArrayList arrayList;
        b<Object> bVarB;
        b<Object> bVarB2;
        kh.c cVarA;
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            if (genericComponentType instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) genericComponentType).getUpperBounds();
                r.d(upperBounds, "getUpperBounds(...)");
                genericComponentType = (Type) qg.o.t(upperBounds);
            }
            r.b(genericComponentType);
            if (z10) {
                bVarB2 = n.serializer(bVar, genericComponentType);
            } else {
                bVarB2 = n.b(bVar, genericComponentType);
                if (bVarB2 == null) {
                    return null;
                }
            }
            if (genericComponentType instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) genericComponentType).getRawType();
                r.c(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
                cVarA = h0.a((Class) rawType);
            } else {
                if (!(genericComponentType instanceof kh.c)) {
                    throw new IllegalStateException("unsupported type in GenericArray: " + h0.a(genericComponentType.getClass()));
                }
                cVarA = (kh.c) genericComponentType;
            }
            r.c(cVarA, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            return ai.a.a(cVarA, bVarB2);
        }
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (!cls.isArray() || cls.getComponentType().isPrimitive()) {
                return b(bVar, cls, z.f22752a);
            }
            Class<?> componentType = cls.getComponentType();
            r.d(componentType, "getComponentType(...)");
            if (z10) {
                bVarB = n.serializer(bVar, componentType);
            } else {
                bVarB = n.b(bVar, componentType);
                if (bVarB == null) {
                    return null;
                }
            }
            return ai.a.a(h0.a(componentType), bVarB);
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof WildcardType) {
                Type[] upperBounds2 = ((WildcardType) type).getUpperBounds();
                r.d(upperBounds2, "getUpperBounds(...)");
                Object objT = qg.o.t(upperBounds2);
                r.d(objT, "first(...)");
                return c(bVar, (Type) objT, true);
            }
            throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + h0.a(type.getClass()));
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType2 = parameterizedType.getRawType();
        r.c(rawType2, "null cannot be cast to non-null type java.lang.Class<*>");
        Class cls2 = (Class) rawType2;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        int i10 = 0;
        r.b(actualTypeArguments);
        if (z10) {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type2 : actualTypeArguments) {
                r.b(type2);
                arrayList.add(n.serializer(bVar, type2));
            }
        } else {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type3 : actualTypeArguments) {
                r.b(type3);
                b<Object> bVarB3 = n.b(bVar, type3);
                if (bVarB3 == null) {
                    return null;
                }
                arrayList.add(bVarB3);
            }
        }
        if (Set.class.isAssignableFrom(cls2)) {
            b elementSerializer = (b) arrayList.get(0);
            r.e(elementSerializer, "elementSerializer");
            return new LinkedHashSetSerializer(elementSerializer);
        }
        if (List.class.isAssignableFrom(cls2) || Collection.class.isAssignableFrom(cls2)) {
            return ai.a.b((b) arrayList.get(0));
        }
        if (Map.class.isAssignableFrom(cls2)) {
            return ai.a.c((b) arrayList.get(0), (b) arrayList.get(1));
        }
        if (Map.Entry.class.isAssignableFrom(cls2)) {
            b keySerializer = (b) arrayList.get(0);
            b valueSerializer = (b) arrayList.get(1);
            r.e(keySerializer, "keySerializer");
            r.e(valueSerializer, "valueSerializer");
            return new MapEntrySerializer(keySerializer, valueSerializer);
        }
        if (pg.n.class.isAssignableFrom(cls2)) {
            b keySerializer2 = (b) arrayList.get(0);
            b valueSerializer2 = (b) arrayList.get(1);
            r.e(keySerializer2, "keySerializer");
            r.e(valueSerializer2, "valueSerializer");
            return new PairSerializer(keySerializer2, valueSerializer2);
        }
        if (t.class.isAssignableFrom(cls2)) {
            b aSerializer = (b) arrayList.get(0);
            b bSerializer = (b) arrayList.get(1);
            b cSerializer = (b) arrayList.get(2);
            r.e(aSerializer, "aSerializer");
            r.e(bSerializer, "bSerializer");
            r.e(cSerializer, "cSerializer");
            return new TripleSerializer(aSerializer, bSerializer, cSerializer);
        }
        ArrayList arrayList2 = new ArrayList(qg.p.h(arrayList, 10));
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            b bVar2 = (b) obj;
            r.c(bVar2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            arrayList2.add(bVar2);
        }
        return b(bVar, cls2, arrayList2);
    }

    public static final b<Object> serializer(ei.b bVar, Type type) {
        r.e(bVar, "<this>");
        r.e(type, "type");
        b<Object> bVarC = c(bVar, type, true);
        if (bVarC != null) {
            return bVarC;
        }
        Class<?> clsA = a(type);
        r.e(clsA, "<this>");
        throw new h(l0.d(h0.a(clsA)));
    }

    public static final b<Object> serializer(Type type) {
        r.e(type, "type");
        return n.serializer(ei.c.f8743a, type);
    }
}
