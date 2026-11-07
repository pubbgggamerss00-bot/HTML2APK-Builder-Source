package di;

import di.n;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class a0 extends b {

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.serialization.json.v f7982f;

    /* renamed from: g, reason: collision with root package name */
    public final bi.f f7983g;

    /* renamed from: h, reason: collision with root package name */
    public int f7984h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7985i;

    public /* synthetic */ a0(kotlinx.serialization.json.b bVar, kotlinx.serialization.json.v vVar, String str, int i10) {
        this(bVar, vVar, (i10 & 4) != 0 ? null : str, (bi.f) null);
    }

    @Override // kotlinx.serialization.internal.f0
    public String Q(bi.f descriptor, int i10) {
        Object next;
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        kotlinx.serialization.json.b bVar = this.f7986c;
        u.d(descriptor, bVar);
        String strF = descriptor.f(i10);
        if (this.f7988e.f16447f && !W().f16457a.keySet().contains(strF)) {
            kotlin.jvm.internal.r.e(bVar, "<this>");
            n nVar = bVar.f16438c;
            androidx.credentials.playservices.controllers.identityauth.createpassword.b bVar2 = new androidx.credentials.playservices.controllers.identityauth.createpassword.b(1, descriptor, bVar);
            nVar.getClass();
            n.a<Map<String, Integer>> aVar = u.f8077a;
            Object objA = nVar.a(descriptor, aVar);
            if (objA == null) {
                objA = bVar2.invoke();
                ConcurrentHashMap concurrentHashMap = nVar.f8055a;
                Object concurrentHashMap2 = concurrentHashMap.get(descriptor);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(descriptor, concurrentHashMap2);
                }
                ((Map) concurrentHashMap2).put(aVar, objA);
            }
            Map map = (Map) objA;
            Iterator<T> it = W().f16457a.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Integer num = (Integer) map.get((String) next);
                if (num != null && num.intValue() == i10) {
                    break;
                }
            }
            String str = (String) next;
            if (str != null) {
                return str;
            }
        }
        return strF;
    }

    @Override // di.b
    public kotlinx.serialization.json.h U(String tag) {
        kotlin.jvm.internal.r.e(tag, "tag");
        return (kotlinx.serialization.json.h) qg.k0.c(tag, W());
    }

    @Override // di.b
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public kotlinx.serialization.json.v W() {
        return this.f7982f;
    }

    @Override // di.b, ci.b
    public void b(bi.f descriptor) {
        Set<String> setA;
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        kotlinx.serialization.json.b bVar = this.f7986c;
        if (u.c(descriptor, bVar) || (descriptor.getKind() instanceof bi.d)) {
            return;
        }
        u.d(descriptor, bVar);
        if (this.f7988e.f16447f) {
            Set<String> setA2 = kotlinx.serialization.internal.l0.a(descriptor);
            Map map = (Map) bVar.f16438c.a(descriptor, u.f8077a);
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = qg.b0.f22711a;
            }
            Set set = setKeySet;
            kotlin.jvm.internal.r.e(setA2, "<this>");
            Integer numValueOf = set instanceof Collection ? Integer.valueOf(set.size()) : null;
            LinkedHashSet linkedHashSet = new LinkedHashSet(qg.j0.a(numValueOf != null ? setA2.size() + numValueOf.intValue() : setA2.size() * 2));
            linkedHashSet.addAll(setA2);
            qg.t.p(set, linkedHashSet);
            setA = linkedHashSet;
        } else {
            setA = kotlinx.serialization.internal.l0.a(descriptor);
        }
        for (String str : W().f16457a.keySet()) {
            if (!setA.contains(str) && !kotlin.jvm.internal.r.a(str, this.f7987d)) {
                StringBuilder sbA = e.e.a("Encountered an unknown key '", str, "' at element: ");
                sbA.append(T());
                sbA.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
                sbA.append((Object) t.g(W().toString(), -1));
                throw t.d(-1, sbA.toString());
            }
        }
    }

    @Override // di.b, ci.d
    public final ci.b c(bi.f descriptor) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        bi.f fVar = this.f7983g;
        if (descriptor != fVar) {
            return super.c(descriptor);
        }
        kotlinx.serialization.json.h hVarV = V();
        String strA = fVar.a();
        if (hVarV instanceof kotlinx.serialization.json.v) {
            return new a0(this.f7986c, (kotlinx.serialization.json.v) hVarV, this.f7987d, fVar);
        }
        throw t.c(-1, hVarV.toString(), "Expected " + kotlin.jvm.internal.h0.a(kotlinx.serialization.json.v.class).e() + ", but had " + kotlin.jvm.internal.h0.a(hVarV.getClass()).e() + " as the serialized body of " + strA + " at element: " + T());
    }

    @Override // ci.b
    public int g(bi.f descriptor) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        while (this.f7984h < descriptor.e()) {
            int i10 = this.f7984h;
            this.f7984h = i10 + 1;
            String nestedName = Q(descriptor, i10);
            kotlin.jvm.internal.r.e(nestedName, "nestedName");
            int i11 = this.f7984h - 1;
            this.f7985i = false;
            if (!W().containsKey(nestedName)) {
                boolean z10 = (this.f7986c.f16436a.f16444c || descriptor.i(i11) || !descriptor.h(i11).c()) ? false : true;
                this.f7985i = z10;
                if (z10) {
                }
            }
            this.f7988e.getClass();
            return i11;
        }
        return -1;
    }

    @Override // di.b, ci.d
    public final boolean x() {
        return !this.f7985i && super.x();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(kotlinx.serialization.json.b json, kotlinx.serialization.json.v value, String str, bi.f fVar) {
        super(json, value, str);
        kotlin.jvm.internal.r.e(json, "json");
        kotlin.jvm.internal.r.e(value, "value");
        this.f7982f = value;
        this.f7983g = fVar;
    }
}
