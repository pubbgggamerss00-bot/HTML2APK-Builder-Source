package zh;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.r;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.MapEntrySerializer;
import kotlinx.serialization.internal.PairSerializer;
import kotlinx.serialization.internal.TripleSerializer;
import kotlinx.serialization.internal.k0;
import kotlinx.serialization.internal.t0;
import pg.t;

/* loaded from: classes2.dex */
public final class n {
    public static final b<? extends Object> a(kh.c<Object> cVar, List<? extends b<Object>> list, eh.a<? extends kh.c> aVar) {
        b<? extends Object> arrayListSerializer;
        b<? extends Object> pairSerializer;
        r.e(cVar, "<this>");
        if (cVar.equals(h0.a(Collection.class)) || cVar.equals(h0.a(List.class)) || cVar.equals(h0.a(List.class)) || cVar.equals(h0.a(ArrayList.class))) {
            arrayListSerializer = new ArrayListSerializer<>(list.get(0));
        } else if (cVar.equals(h0.a(HashSet.class))) {
            arrayListSerializer = new HashSetSerializer<>(list.get(0));
        } else if (cVar.equals(h0.a(Set.class)) || cVar.equals(h0.a(Set.class)) || cVar.equals(h0.a(LinkedHashSet.class))) {
            arrayListSerializer = new LinkedHashSetSerializer<>(list.get(0));
        } else if (cVar.equals(h0.a(HashMap.class))) {
            arrayListSerializer = new HashMapSerializer<>(list.get(0), list.get(1));
        } else if (cVar.equals(h0.a(Map.class)) || cVar.equals(h0.a(Map.class)) || cVar.equals(h0.a(LinkedHashMap.class))) {
            arrayListSerializer = new LinkedHashMapSerializer<>(list.get(0), list.get(1));
        } else {
            if (cVar.equals(h0.a(Map.Entry.class))) {
                b<Object> keySerializer = list.get(0);
                b<Object> valueSerializer = list.get(1);
                r.e(keySerializer, "keySerializer");
                r.e(valueSerializer, "valueSerializer");
                pairSerializer = new MapEntrySerializer<>(keySerializer, valueSerializer);
            } else if (cVar.equals(h0.a(pg.n.class))) {
                b<Object> keySerializer2 = list.get(0);
                b<Object> valueSerializer2 = list.get(1);
                r.e(keySerializer2, "keySerializer");
                r.e(valueSerializer2, "valueSerializer");
                pairSerializer = new PairSerializer<>(keySerializer2, valueSerializer2);
            } else if (cVar.equals(h0.a(t.class))) {
                b<Object> aSerializer = list.get(0);
                b<Object> bSerializer = list.get(1);
                b<Object> cSerializer = list.get(2);
                r.e(aSerializer, "aSerializer");
                r.e(bSerializer, "bSerializer");
                r.e(cSerializer, "cSerializer");
                arrayListSerializer = new TripleSerializer(aSerializer, bSerializer, cSerializer);
            } else if (b3.e.c(cVar).isArray()) {
                kh.c cVarInvoke = aVar.invoke();
                r.c(cVarInvoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                arrayListSerializer = ai.a.a(cVarInvoke, list.get(0));
            } else {
                arrayListSerializer = null;
            }
            arrayListSerializer = pairSerializer;
        }
        if (arrayListSerializer != null) {
            return arrayListSerializer;
        }
        b[] bVarArr = (b[]) list.toArray(new b[0]);
        b[] args = (b[]) Arrays.copyOf(bVarArr, bVarArr.length);
        r.e(args, "args");
        return k0.a(b3.e.c(cVar), (b[]) Arrays.copyOf(args, args.length));
    }

    public static final b<Object> b(ei.b bVar, Type type) {
        return o.c(bVar, type, false);
    }

    public static final <T> b<T> c(kh.c<T> cVar) {
        r.e(cVar, "<this>");
        b<T> bVarA = k0.a(b3.e.c(cVar), (b[]) Arrays.copyOf(new b[0], 0));
        if (bVarA != null) {
            return bVarA;
        }
        rg.c cVar2 = t0.f16413a;
        return (b) t0.f16413a.get(cVar);
    }

    public static final ArrayList d(ei.b bVar, List typeArguments, boolean z10) {
        r.e(bVar, "<this>");
        r.e(typeArguments, "typeArguments");
        if (z10) {
            ArrayList arrayList = new ArrayList(qg.p.h(typeArguments, 10));
            Iterator it = typeArguments.iterator();
            while (it.hasNext()) {
                arrayList.add(serializer(bVar, (kh.j) it.next()));
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(qg.p.h(typeArguments, 10));
        Iterator it2 = typeArguments.iterator();
        while (it2.hasNext()) {
            kh.j type = (kh.j) it2.next();
            r.e(type, "type");
            b<Object> bVarA = p.a(bVar, type, false);
            if (bVarA == null) {
                return null;
            }
            arrayList2.add(bVarA);
        }
        return arrayList2;
    }

    public static final b<Object> serializer(ei.b bVar, Type type) {
        return o.serializer(bVar, type);
    }

    public static final b<Object> serializer(ei.b bVar, kh.c<?> cVar, List<? extends b<?>> list, boolean z10) {
        return p.serializer(bVar, cVar, list, z10);
    }

    public static final b<Object> serializer(ei.b bVar, kh.j jVar) {
        return p.serializer(bVar, jVar);
    }

    public static final b<Object> serializer(Type type) {
        return o.serializer(type);
    }

    public static final <T> b<T> serializer(kh.c<T> cVar) {
        return p.serializer(cVar);
    }

    public static final b<Object> serializer(kh.c<?> cVar, List<? extends b<?>> list, boolean z10) {
        return p.serializer(cVar, list, z10);
    }

    public static final b<Object> serializer(kh.j jVar) {
        return p.serializer(jVar);
    }

    public static final <T> b<T> serializer() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static final <T> b<T> serializer(ei.b bVar) {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }
}
