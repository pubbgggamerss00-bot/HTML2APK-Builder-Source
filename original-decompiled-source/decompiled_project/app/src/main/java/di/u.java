package di;

import bi.m;
import di.n;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final n.a<Map<String, Integer>> f8077a = new n.a<>();

    public static final int a(bi.f fVar, kotlinx.serialization.json.b json, String name) {
        kotlin.jvm.internal.r.e(fVar, "<this>");
        kotlin.jvm.internal.r.e(json, "json");
        kotlin.jvm.internal.r.e(name, "name");
        d(fVar, json);
        int iD = fVar.d(name);
        if (iD != -3 || !json.f16436a.f16447f) {
            return iD;
        }
        n nVar = json.f16438c;
        androidx.credentials.playservices.controllers.identityauth.createpassword.b bVar = new androidx.credentials.playservices.controllers.identityauth.createpassword.b(1, fVar, json);
        nVar.getClass();
        n.a<Map<String, Integer>> aVar = f8077a;
        Object objA = nVar.a(fVar, aVar);
        if (objA == null) {
            objA = bVar.invoke();
            ConcurrentHashMap concurrentHashMap = nVar.f8055a;
            Object concurrentHashMap2 = concurrentHashMap.get(fVar);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(fVar, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(aVar, objA);
        }
        Integer num = (Integer) ((Map) objA).get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int b(bi.f fVar, kotlinx.serialization.json.b json, String name, String suffix) {
        kotlin.jvm.internal.r.e(fVar, "<this>");
        kotlin.jvm.internal.r.e(json, "json");
        kotlin.jvm.internal.r.e(name, "name");
        kotlin.jvm.internal.r.e(suffix, "suffix");
        int iA = a(fVar, json, name);
        if (iA != -3) {
            return iA;
        }
        throw new zh.h(fVar.a() + " does not contain element with name '" + name + '\'' + suffix);
    }

    public static final boolean c(bi.f fVar, kotlinx.serialization.json.b json) {
        kotlin.jvm.internal.r.e(fVar, "<this>");
        kotlin.jvm.internal.r.e(json, "json");
        if (json.f16436a.f16442a) {
            return true;
        }
        List<Annotation> annotations = fVar.getAnnotations();
        if (annotations != null && annotations.isEmpty()) {
            return false;
        }
        Iterator<T> it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof kotlinx.serialization.json.o) {
                return true;
            }
        }
        return false;
    }

    public static final void d(bi.f fVar, kotlinx.serialization.json.b json) {
        kotlin.jvm.internal.r.e(fVar, "<this>");
        kotlin.jvm.internal.r.e(json, "json");
        kotlin.jvm.internal.r.a(fVar.getKind(), m.a.f4278a);
    }
}
