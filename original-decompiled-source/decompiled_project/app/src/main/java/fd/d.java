package fd;

import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p0;
import com.google.crypto.tink.shaded.protobuf.z;
import ed.a0;
import ed.e0;
import ed.o;
import ed.p;
import ed.q;
import gd.t;
import gd.y;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import sc.h;
import zc.e;

/* loaded from: classes2.dex */
public final class d extends zc.e<o> {

    public class a extends e.a<p, o> {
        @Override // zc.e.a
        public final p0 a(p0 p0Var) throws GeneralSecurityException {
            p pVar = (p) p0Var;
            o.a aVarC = o.C();
            byte[] bArrA = t.a(pVar.y());
            h.f fVarC = com.google.crypto.tink.shaded.protobuf.h.c(0, bArrA.length, bArrA);
            aVarC.e();
            o.y((o) aVarC.f6808b, fVarC);
            q qVarZ = pVar.z();
            aVarC.e();
            o.x((o) aVarC.f6808b, qVarZ);
            aVarC.e();
            o.w((o) aVarC.f6808b);
            return aVarC.b();
        }

        @Override // zc.e.a
        public final Map<String, e.a.C0358a<p>> b() throws GeneralSecurityException {
            HashMap map = new HashMap();
            p pVarH = d.h(16, 16, 4096);
            h.a aVar = h.a.f24807b;
            map.put("AES128_GCM_HKDF_4KB", new e.a.C0358a(pVarH, aVar));
            map.put("AES128_GCM_HKDF_1MB", new e.a.C0358a(d.h(16, 16, PKIFailureInfo.badCertTemplate), aVar));
            map.put("AES256_GCM_HKDF_4KB", new e.a.C0358a(d.h(32, 32, 4096), aVar));
            map.put("AES256_GCM_HKDF_1MB", new e.a.C0358a(d.h(32, 32, PKIFailureInfo.badCertTemplate), aVar));
            return Collections.unmodifiableMap(map);
        }

        @Override // zc.e.a
        public final p0 c(com.google.crypto.tink.shaded.protobuf.h hVar) throws z {
            return p.B(hVar, com.google.crypto.tink.shaded.protobuf.o.a());
        }

        @Override // zc.e.a
        public final void d(p0 p0Var) throws GeneralSecurityException {
            p pVar = (p) p0Var;
            if (pVar.y() < 16) {
                throw new GeneralSecurityException("key_size must be at least 16 bytes");
            }
            d.i(pVar.z());
        }
    }

    public static p h(int i10, int i11, int i12) {
        q.a aVarD = q.D();
        aVarD.e();
        q.w((q) aVarD.f6808b, i12);
        aVarD.e();
        q.x((q) aVarD.f6808b, i11);
        aVarD.e();
        q.y((q) aVarD.f6808b);
        q qVarB = aVarD.b();
        p.a aVarA = p.A();
        aVarA.e();
        p.x((p) aVarA.f6808b, i10);
        aVarA.e();
        p.w((p) aVarA.f6808b, qVarB);
        return aVarA.b();
    }

    public static void i(q qVar) throws GeneralSecurityException {
        y.a(qVar.B());
        if (qVar.C() == a0.UNKNOWN_HASH) {
            throw new GeneralSecurityException("unknown HKDF hash type");
        }
        if (qVar.z() < qVar.B() + 25) {
            throw new GeneralSecurityException("ciphertext_segment_size must be at least (derived_key_size + NONCE_PREFIX_IN_BYTES + TAG_SIZE_IN_BYTES + 2)");
        }
    }

    @Override // zc.e
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey";
    }

    @Override // zc.e
    public final e.a<p, o> d() {
        return new a(p.class);
    }

    @Override // zc.e
    public final e0.b e() {
        return e0.b.SYMMETRIC;
    }

    @Override // zc.e
    public final p0 f(com.google.crypto.tink.shaded.protobuf.h hVar) throws z {
        return o.D(hVar, com.google.crypto.tink.shaded.protobuf.o.a());
    }

    @Override // zc.e
    public final void g(p0 p0Var) throws GeneralSecurityException {
        o oVar = (o) p0Var;
        y.c(oVar.B());
        i(oVar.A());
    }
}
