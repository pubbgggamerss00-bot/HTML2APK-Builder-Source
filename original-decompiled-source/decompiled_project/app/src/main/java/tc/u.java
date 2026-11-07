package tc;

import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p0;
import ed.e0;
import ed.t;
import ed.u;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import sc.h;
import zc.e;

/* loaded from: classes2.dex */
public final class u extends zc.e<ed.t> {

    public class a extends e.a<ed.u, ed.t> {
        @Override // zc.e.a
        public final p0 a(p0 p0Var) throws GeneralSecurityException {
            t.a aVarA = ed.t.A();
            byte[] bArrA = gd.t.a(((ed.u) p0Var).x());
            h.f fVarC = com.google.crypto.tink.shaded.protobuf.h.c(0, bArrA.length, bArrA);
            aVarA.e();
            ed.t.x((ed.t) aVarA.f6808b, fVarC);
            aVarA.e();
            ed.t.w((ed.t) aVarA.f6808b);
            return aVarA.b();
        }

        @Override // zc.e.a
        public final Map<String, e.a.C0358a<ed.u>> b() throws GeneralSecurityException {
            HashMap map = new HashMap();
            h.a aVar = h.a.f24806a;
            map.put("AES128_GCM_SIV", u.h(16, aVar));
            h.a aVar2 = h.a.f24807b;
            map.put("AES128_GCM_SIV_RAW", u.h(16, aVar2));
            map.put("AES256_GCM_SIV", u.h(32, aVar));
            map.put("AES256_GCM_SIV_RAW", u.h(32, aVar2));
            return Collections.unmodifiableMap(map);
        }

        @Override // zc.e.a
        public final p0 c(com.google.crypto.tink.shaded.protobuf.h hVar) throws com.google.crypto.tink.shaded.protobuf.z {
            return ed.u.z(hVar, com.google.crypto.tink.shaded.protobuf.o.a());
        }

        @Override // zc.e.a
        public final void d(p0 p0Var) throws GeneralSecurityException {
            gd.y.a(((ed.u) p0Var).x());
        }
    }

    public static e.a.C0358a h(int i10, h.a aVar) {
        u.a aVarY = ed.u.y();
        aVarY.e();
        ed.u.w((ed.u) aVarY.f6808b, i10);
        return new e.a.C0358a(aVarY.b(), aVar);
    }

    @Override // zc.e
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // zc.e
    public final e.a<ed.u, ed.t> d() {
        return new a(ed.u.class);
    }

    @Override // zc.e
    public final e0.b e() {
        return e0.b.SYMMETRIC;
    }

    @Override // zc.e
    public final p0 f(com.google.crypto.tink.shaded.protobuf.h hVar) throws com.google.crypto.tink.shaded.protobuf.z {
        return ed.t.B(hVar, com.google.crypto.tink.shaded.protobuf.o.a());
    }

    @Override // zc.e
    public final void g(p0 p0Var) throws GeneralSecurityException {
        ed.t tVar = (ed.t) p0Var;
        gd.y.c(tVar.z());
        gd.y.a(tVar.y().size());
    }
}
