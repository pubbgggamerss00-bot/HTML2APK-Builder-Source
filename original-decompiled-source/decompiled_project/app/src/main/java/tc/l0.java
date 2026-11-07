package tc;

import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p0;
import ed.e0;
import ed.q0;
import ed.r0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import sc.h;
import zc.e;

/* loaded from: classes2.dex */
public final class l0 extends zc.e<q0> {

    public class a extends e.a<r0, q0> {
        @Override // zc.e.a
        public final p0 a(p0 p0Var) throws GeneralSecurityException {
            q0.a aVarA = q0.A();
            aVarA.e();
            q0.w((q0) aVarA.f6808b);
            byte[] bArrA = gd.t.a(32);
            h.f fVarC = com.google.crypto.tink.shaded.protobuf.h.c(0, bArrA.length, bArrA);
            aVarA.e();
            q0.x((q0) aVarA.f6808b, fVarC);
            return aVarA.b();
        }

        @Override // zc.e.a
        public final Map<String, e.a.C0358a<r0>> b() throws GeneralSecurityException {
            HashMap map = new HashMap();
            map.put("XCHACHA20_POLY1305", new e.a.C0358a(r0.v(), h.a.f24806a));
            map.put("XCHACHA20_POLY1305_RAW", new e.a.C0358a(r0.v(), h.a.f24807b));
            return Collections.unmodifiableMap(map);
        }

        @Override // zc.e.a
        public final p0 c(com.google.crypto.tink.shaded.protobuf.h hVar) throws com.google.crypto.tink.shaded.protobuf.z {
            return r0.w(hVar, com.google.crypto.tink.shaded.protobuf.o.a());
        }

        @Override // zc.e.a
        public final /* bridge */ /* synthetic */ void d(p0 p0Var) throws GeneralSecurityException {
        }
    }

    @Override // zc.e
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // zc.e
    public final e.a<r0, q0> d() {
        return new a(r0.class);
    }

    @Override // zc.e
    public final e0.b e() {
        return e0.b.SYMMETRIC;
    }

    @Override // zc.e
    public final p0 f(com.google.crypto.tink.shaded.protobuf.h hVar) throws com.google.crypto.tink.shaded.protobuf.z {
        return q0.B(hVar, com.google.crypto.tink.shaded.protobuf.o.a());
    }

    @Override // zc.e
    public final void g(p0 p0Var) throws GeneralSecurityException {
        q0 q0Var = (q0) p0Var;
        gd.y.c(q0Var.z());
        if (q0Var.y().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}
