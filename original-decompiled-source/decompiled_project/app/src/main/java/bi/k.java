package bi;

import bi.m;
import kotlin.jvm.internal.r;
import kotlinx.serialization.internal.s0;
import kotlinx.serialization.internal.t0;
import mh.x;
import pg.f0;
import qg.o;

/* loaded from: classes2.dex */
public final class k {
    public static final s0 a(String str, e kind) {
        r.e(kind, "kind");
        if (x.A(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        t0.a(str);
        return new s0(str, kind);
    }

    public static final n b(String str, f original) {
        r.e(original, "original");
        if (x.A(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (!str.equals(original.a())) {
            if (original.getKind() instanceof e) {
                t0.a(str);
            }
            return new n(str, original);
        }
        StringBuilder sbA = e.e.a("The name of the wrapped descriptor (", str, ") cannot be the same as the name of the original descriptor (");
        sbA.append(original.a());
        sbA.append(')');
        throw new IllegalArgumentException(sbA.toString().toString());
    }

    public static g c(String str, f[] fVarArr) {
        if (x.A(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        a aVar = new a(str);
        f0 f0Var = f0.f21461a;
        return new g(str, m.a.f4278a, aVar.f4242c.size(), o.B(fVarArr), aVar);
    }

    public static final g d(String serialName, l kind, f[] fVarArr, eh.l lVar) {
        r.e(serialName, "serialName");
        r.e(kind, "kind");
        if (x.A(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (kind.equals(m.a.f4278a)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        a aVar = new a(serialName);
        lVar.invoke(aVar);
        return new g(serialName, kind, aVar.f4242c.size(), o.B(fVarArr), aVar);
    }
}
