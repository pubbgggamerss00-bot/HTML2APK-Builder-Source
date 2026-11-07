package fd;

import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.o;
import com.google.crypto.tink.shaded.protobuf.p0;
import com.google.crypto.tink.shaded.protobuf.z;
import ed.a0;
import ed.d0;
import ed.e0;
import ed.f;
import ed.g;
import ed.h;
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
public final class b extends zc.e<ed.f> {

    public class a extends e.a<ed.g, ed.f> {
        @Override // zc.e.a
        public final p0 a(p0 p0Var) throws GeneralSecurityException {
            ed.g gVar = (ed.g) p0Var;
            f.a aVarC = ed.f.C();
            byte[] bArrA = t.a(gVar.y());
            h.f fVarC = com.google.crypto.tink.shaded.protobuf.h.c(0, bArrA.length, bArrA);
            aVarC.e();
            ed.f.y((ed.f) aVarC.f6808b, fVarC);
            ed.h hVarZ = gVar.z();
            aVarC.e();
            ed.f.x((ed.f) aVarC.f6808b, hVarZ);
            aVarC.e();
            ed.f.w((ed.f) aVarC.f6808b);
            return aVarC.b();
        }

        @Override // zc.e.a
        public final Map<String, e.a.C0358a<ed.g>> b() throws GeneralSecurityException {
            HashMap map = new HashMap();
            ed.g gVarH = b.h(16, 16, 4096);
            h.a aVar = h.a.f24807b;
            map.put("AES128_CTR_HMAC_SHA256_4KB", new e.a.C0358a(gVarH, aVar));
            map.put("AES128_CTR_HMAC_SHA256_1MB", new e.a.C0358a(b.h(16, 16, PKIFailureInfo.badCertTemplate), aVar));
            map.put("AES256_CTR_HMAC_SHA256_4KB", new e.a.C0358a(b.h(32, 32, 4096), aVar));
            map.put("AES256_CTR_HMAC_SHA256_1MB", new e.a.C0358a(b.h(32, 32, PKIFailureInfo.badCertTemplate), aVar));
            return Collections.unmodifiableMap(map);
        }

        @Override // zc.e.a
        public final p0 c(com.google.crypto.tink.shaded.protobuf.h hVar) throws z {
            return ed.g.B(hVar, o.a());
        }

        @Override // zc.e.a
        public final void d(p0 p0Var) throws GeneralSecurityException {
            ed.g gVar = (ed.g) p0Var;
            if (gVar.y() < 16) {
                throw new GeneralSecurityException("key_size must be at least 16 bytes");
            }
            b.i(gVar.z());
        }
    }

    public static ed.g h(int i10, int i11, int i12) {
        d0.a aVarB = d0.B();
        aVarB.e();
        d0.w((d0) aVarB.f6808b, a0.SHA256);
        aVarB.e();
        d0.x((d0) aVarB.f6808b, 32);
        d0 d0VarB = aVarB.b();
        h.a aVarF = ed.h.F();
        aVarF.e();
        ed.h.w((ed.h) aVarF.f6808b, i12);
        aVarF.e();
        ed.h.x((ed.h) aVarF.f6808b, i11);
        aVarF.e();
        ed.h.y((ed.h) aVarF.f6808b);
        aVarF.e();
        ed.h.z((ed.h) aVarF.f6808b, d0VarB);
        ed.h hVarB = aVarF.b();
        g.a aVarA = ed.g.A();
        aVarA.e();
        ed.g.w((ed.g) aVarA.f6808b, hVarB);
        aVarA.e();
        ed.g.x((ed.g) aVarA.f6808b, i10);
        return aVarA.b();
    }

    public static void i(ed.h hVar) throws GeneralSecurityException {
        y.a(hVar.C());
        if (hVar.D() != a0.SHA1 && hVar.D() != a0.SHA256 && hVar.D() != a0.SHA512) {
            throw new GeneralSecurityException("Invalid HKDF hash type: " + hVar.D().getNumber());
        }
        if (hVar.E().z() == a0.UNKNOWN_HASH) {
            throw new GeneralSecurityException("unknown HMAC hash type");
        }
        d0 d0VarE = hVar.E();
        if (d0VarE.A() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int iOrdinal = d0VarE.z().ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new GeneralSecurityException("unknown hash type");
                }
                if (d0VarE.A() > 64) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (d0VarE.A() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (d0VarE.A() > 20) {
            throw new GeneralSecurityException("tag size too big");
        }
        if (hVar.A() < hVar.E().A() + hVar.C() + 9) {
            throw new GeneralSecurityException("ciphertext_segment_size must be at least (derived_key_size + tag_size + NONCE_PREFIX_IN_BYTES + 2)");
        }
    }

    @Override // zc.e
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey";
    }

    @Override // zc.e
    public final e.a<ed.g, ed.f> d() {
        return new a(ed.g.class);
    }

    @Override // zc.e
    public final e0.b e() {
        return e0.b.SYMMETRIC;
    }

    @Override // zc.e
    public final p0 f(com.google.crypto.tink.shaded.protobuf.h hVar) throws z {
        return ed.f.D(hVar, o.a());
    }

    @Override // zc.e
    public final void g(p0 p0Var) throws GeneralSecurityException {
        ed.f fVar = (ed.f) p0Var;
        y.c(fVar.B());
        if (fVar.z().size() < 16) {
            throw new GeneralSecurityException("key_value must have at least 16 bytes");
        }
        if (fVar.z().size() < fVar.A().C()) {
            throw new GeneralSecurityException("key_value must have at least as many bits as derived keys");
        }
        i(fVar.A());
    }
}
