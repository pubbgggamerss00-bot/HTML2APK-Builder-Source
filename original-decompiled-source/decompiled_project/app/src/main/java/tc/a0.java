package tc;

import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p0;
import ed.e0;
import ed.x;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import sc.h;
import zc.e;

/* loaded from: classes2.dex */
public final class a0 extends zc.e<ed.x> {

    public class a extends e.a<ed.y, ed.x> {
        @Override // zc.e.a
        public final p0 a(p0 p0Var) throws GeneralSecurityException {
            x.a aVarA = ed.x.A();
            aVarA.e();
            ed.x.w((ed.x) aVarA.f6808b);
            byte[] bArrA = gd.t.a(32);
            h.f fVarC = com.google.crypto.tink.shaded.protobuf.h.c(0, bArrA.length, bArrA);
            aVarA.e();
            ed.x.x((ed.x) aVarA.f6808b, fVarC);
            return aVarA.b();
        }

        @Override // zc.e.a
        public final Map<String, e.a.C0358a<ed.y>> b() throws GeneralSecurityException {
            HashMap map = new HashMap();
            map.put("CHACHA20_POLY1305", new e.a.C0358a(ed.y.v(), h.a.f24806a));
            map.put("CHACHA20_POLY1305_RAW", new e.a.C0358a(ed.y.v(), h.a.f24807b));
            return Collections.unmodifiableMap(map);
        }

        @Override // zc.e.a
        public final p0 c(com.google.crypto.tink.shaded.protobuf.h hVar) throws com.google.crypto.tink.shaded.protobuf.z {
            return ed.y.w(hVar, com.google.crypto.tink.shaded.protobuf.o.a());
        }

        @Override // zc.e.a
        public final /* bridge */ /* synthetic */ void d(p0 p0Var) throws GeneralSecurityException {
        }
    }

    @Override // zc.e
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // zc.e
    public final e.a<ed.y, ed.x> d() {
        return new a(ed.y.class);
    }

    @Override // zc.e
    public final e0.b e() {
        return e0.b.SYMMETRIC;
    }

    @Override // zc.e
    public final p0 f(com.google.crypto.tink.shaded.protobuf.h hVar) throws com.google.crypto.tink.shaded.protobuf.z {
        return ed.x.B(hVar, com.google.crypto.tink.shaded.protobuf.o.a());
    }

    @Override // zc.e
    public final void g(p0 p0Var) throws GeneralSecurityException {
        ed.x xVar = (ed.x) p0Var;
        gd.y.c(xVar.z());
        if (xVar.y().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
