package kotlinx.serialization.json;

import di.a0;
import di.c0;
import di.k0;
import di.l0;
import di.n0;
import di.r0;
import di.z;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: d, reason: collision with root package name */
    public static final a f16435d = new a(new f(false, false, true, "    ", "type", true, kotlinx.serialization.json.a.f16433b), ei.c.f8743a);

    /* renamed from: a, reason: collision with root package name */
    public final f f16436a;

    /* renamed from: b, reason: collision with root package name */
    public final ei.b f16437b;

    /* renamed from: c, reason: collision with root package name */
    public final di.n f16438c = new di.n();

    public static final class a extends b {
    }

    public b(f fVar, ei.b bVar) {
        this.f16436a = fVar;
        this.f16437b = bVar;
    }

    public final <T> T a(zh.a<? extends T> deserializer, h element) {
        ci.d wVar;
        kotlin.jvm.internal.r.e(deserializer, "deserializer");
        kotlin.jvm.internal.r.e(element, "element");
        String str = null;
        if (element instanceof v) {
            wVar = new a0(this, (v) element, str, 12);
        } else if (element instanceof c) {
            wVar = new c0(this, (c) element);
        } else {
            if (!(element instanceof r) && !element.equals(t.INSTANCE)) {
                throw new pg.l();
            }
            wVar = new di.w(this, (x) element, null);
        }
        return (T) wVar.q(deserializer);
    }

    public final <T> T b(zh.a<? extends T> deserializer, String string) {
        kotlin.jvm.internal.r.e(deserializer, "deserializer");
        kotlin.jvm.internal.r.e(string, "string");
        n0 n0Var = new n0(string);
        T t3 = (T) new k0(this, r0.f8068c, n0Var, deserializer.getDescriptor(), null).q(deserializer);
        if (n0Var.e() == 10) {
            return t3;
        }
        n0.n(n0Var, "Expected EOF after parsing, but had " + n0Var.f8060e.charAt(n0Var.f8056a - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final <T> String c(zh.i<? super T> serializer, T t3) {
        char[] cArr;
        kotlin.jvm.internal.r.e(serializer, "serializer");
        z zVar = new z();
        di.h hVar = di.h.f8017c;
        synchronized (hVar) {
            qg.l<char[]> lVar = hVar.f8025a;
            cArr = null;
            char[] cArrRemoveLast = lVar.isEmpty() ? null : lVar.removeLast();
            if (cArrRemoveLast != null) {
                hVar.f8026b -= cArrRemoveLast.length;
                cArr = cArrRemoveLast;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        zVar.f8084a = cArr;
        try {
            new l0(new di.k(zVar), this, r0.f8068c, new n[r0.f8073h.c()]).J(serializer, t3);
            return zVar.toString();
        } finally {
            zVar.b();
        }
    }

    public final h d(String string) {
        kotlin.jvm.internal.r.e(string, "string");
        return (h) b(JsonElementSerializer.INSTANCE, string);
    }
}
