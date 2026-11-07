package xc;

import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.o;
import com.google.crypto.tink.shaded.protobuf.p0;
import com.google.crypto.tink.shaded.protobuf.z;
import ed.e0;
import ed.v;
import ed.w;
import gd.t;
import gd.y;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import sc.h;
import zc.e;

/* loaded from: classes2.dex */
public final class b extends e<v> {

    public class a extends e.a<w, v> {
        @Override // zc.e.a
        public final p0 a(p0 p0Var) throws GeneralSecurityException {
            v.a aVarA = v.A();
            byte[] bArrA = t.a(((w) p0Var).x());
            h.f fVarC = h.c(0, bArrA.length, bArrA);
            aVarA.e();
            v.x((v) aVarA.f6808b, fVarC);
            aVarA.e();
            v.w((v) aVarA.f6808b);
            return aVarA.b();
        }

        @Override // zc.e.a
        public final Map<String, e.a.C0358a<w>> b() throws GeneralSecurityException {
            HashMap map = new HashMap();
            w.a aVarY = w.y();
            aVarY.e();
            w.w((w) aVarY.f6808b);
            map.put("AES256_SIV", new e.a.C0358a(aVarY.b(), h.a.f24806a));
            w.a aVarY2 = w.y();
            aVarY2.e();
            w.w((w) aVarY2.f6808b);
            map.put("AES256_SIV_RAW", new e.a.C0358a(aVarY2.b(), h.a.f24807b));
            return Collections.unmodifiableMap(map);
        }

        @Override // zc.e.a
        public final p0 c(com.google.crypto.tink.shaded.protobuf.h hVar) throws z {
            return w.z(hVar, o.a());
        }

        @Override // zc.e.a
        public final void d(p0 p0Var) throws GeneralSecurityException {
            w wVar = (w) p0Var;
            if (wVar.x() == 64) {
                return;
            }
            throw new InvalidAlgorithmParameterException("invalid key size: " + wVar.x() + ". Valid keys must have 64 bytes.");
        }
    }

    @Override // zc.e
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // zc.e
    public final e.a<w, v> d() {
        return new a(w.class);
    }

    @Override // zc.e
    public final e0.b e() {
        return e0.b.SYMMETRIC;
    }

    @Override // zc.e
    public final p0 f(com.google.crypto.tink.shaded.protobuf.h hVar) throws z {
        return v.B(hVar, o.a());
    }

    @Override // zc.e
    public final void g(p0 p0Var) throws GeneralSecurityException {
        v vVar = (v) p0Var;
        y.c(vVar.z());
        if (vVar.y().size() == 64) {
            return;
        }
        throw new InvalidKeyException("invalid key size: " + vVar.y().size() + ". Valid keys must have 64 bytes.");
    }
}
