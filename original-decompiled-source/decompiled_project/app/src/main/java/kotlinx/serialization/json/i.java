package kotlinx.serialization.json;

import di.n0;
import di.o0;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.l0;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlinx.serialization.internal.u f16449a = kotlinx.serialization.internal.v.a("kotlinx.serialization.json.JsonUnquotedLiteral", ai.a.serializer(l0.f16339a));

    public static final x a(Number number) {
        return number == null ? t.INSTANCE : new r(number, false, null);
    }

    public static final x b(String str) {
        return str == null ? t.INSTANCE : new r(str, true, null);
    }

    public static final void c(String str, h hVar) {
        throw new IllegalArgumentException("Element " + h0.a(hVar.getClass()) + " is not a " + str);
    }

    public static final Boolean d(x xVar) {
        String strC = xVar.c();
        String[] strArr = o0.f8063a;
        kotlin.jvm.internal.r.e(strC, "<this>");
        if (strC.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (strC.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final v e(h hVar) {
        kotlin.jvm.internal.r.e(hVar, "<this>");
        v vVar = hVar instanceof v ? (v) hVar : null;
        if (vVar != null) {
            return vVar;
        }
        c("JsonObject", hVar);
        throw null;
    }

    public static final x f(h hVar) {
        kotlin.jvm.internal.r.e(hVar, "<this>");
        x xVar = hVar instanceof x ? (x) hVar : null;
        if (xVar != null) {
            return xVar;
        }
        c("JsonPrimitive", hVar);
        throw null;
    }

    public static final long g(x xVar) {
        n0 n0Var = new n0(xVar.c());
        long jH = n0Var.h();
        if (n0Var.e() == 10) {
            return jH;
        }
        int i10 = n0Var.f8056a;
        int i11 = i10 - 1;
        String str = n0Var.f8060e;
        n0.n(n0Var, i8.n.d("Expected input to contain a single valid number, but got '", (i10 == str.length() || i11 < 0) ? "EOF" : String.valueOf(str.charAt(i11)), "' after it"), i11, null, 4);
        throw null;
    }
}
