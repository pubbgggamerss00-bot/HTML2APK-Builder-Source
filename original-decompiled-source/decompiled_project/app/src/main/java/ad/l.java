package ad;

import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p0;
import com.google.crypto.tink.shaded.protobuf.z;
import ed.a0;
import ed.b0;
import ed.c0;
import ed.d0;
import ed.e0;
import gd.t;
import gd.y;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;
import sc.h;
import wc.a;
import zc.e;

/* loaded from: classes2.dex */
public final class l extends zc.e<b0> {

    /* renamed from: d, reason: collision with root package name */
    public static final zc.o f425d = new zc.o(j.class, new k());

    public final class a extends zc.q<sc.n, b0> {
        @Override // zc.q
        public final sc.n a(p0 p0Var) throws GeneralSecurityException {
            b0 b0Var = (b0) p0Var;
            a0 a0VarZ = b0Var.B().z();
            SecretKeySpec secretKeySpec = new SecretKeySpec(b0Var.A().k(), "HMAC");
            int iA = b0Var.B().A();
            int iOrdinal = a0VarZ.ordinal();
            if (iOrdinal == 1) {
                return new gd.s(new gd.r("HMACSHA1", secretKeySpec), iA);
            }
            if (iOrdinal == 2) {
                return new gd.s(new gd.r("HMACSHA384", secretKeySpec), iA);
            }
            if (iOrdinal == 3) {
                return new gd.s(new gd.r("HMACSHA256", secretKeySpec), iA);
            }
            if (iOrdinal == 4) {
                return new gd.s(new gd.r("HMACSHA512", secretKeySpec), iA);
            }
            if (iOrdinal == 5) {
                return new gd.s(new gd.r("HMACSHA224", secretKeySpec), iA);
            }
            throw new GeneralSecurityException("unknown hash");
        }
    }

    public class b extends e.a<c0, b0> {
        @Override // zc.e.a
        public final p0 a(p0 p0Var) throws GeneralSecurityException {
            c0 c0Var = (c0) p0Var;
            b0.a aVarD = b0.D();
            aVarD.e();
            b0.w((b0) aVarD.f6808b);
            d0 d0VarA = c0Var.A();
            aVarD.e();
            b0.x((b0) aVarD.f6808b, d0VarA);
            byte[] bArrA = t.a(c0Var.z());
            h.f fVarC = com.google.crypto.tink.shaded.protobuf.h.c(0, bArrA.length, bArrA);
            aVarD.e();
            b0.y((b0) aVarD.f6808b, fVarC);
            return aVarD.b();
        }

        @Override // zc.e.a
        public final Map<String, e.a.C0358a<c0>> b() throws GeneralSecurityException {
            HashMap map = new HashMap();
            a0 a0Var = a0.SHA256;
            h.a aVar = h.a.f24806a;
            map.put("HMAC_SHA256_128BITTAG", l.h(32, 16, a0Var, aVar));
            h.a aVar2 = h.a.f24807b;
            map.put("HMAC_SHA256_128BITTAG_RAW", l.h(32, 16, a0Var, aVar2));
            map.put("HMAC_SHA256_256BITTAG", l.h(32, 32, a0Var, aVar));
            map.put("HMAC_SHA256_256BITTAG_RAW", l.h(32, 32, a0Var, aVar2));
            a0 a0Var2 = a0.SHA512;
            map.put("HMAC_SHA512_128BITTAG", l.h(64, 16, a0Var2, aVar));
            map.put("HMAC_SHA512_128BITTAG_RAW", l.h(64, 16, a0Var2, aVar2));
            map.put("HMAC_SHA512_256BITTAG", l.h(64, 32, a0Var2, aVar));
            map.put("HMAC_SHA512_256BITTAG_RAW", l.h(64, 32, a0Var2, aVar2));
            map.put("HMAC_SHA512_512BITTAG", l.h(64, 64, a0Var2, aVar));
            map.put("HMAC_SHA512_512BITTAG_RAW", l.h(64, 64, a0Var2, aVar2));
            return Collections.unmodifiableMap(map);
        }

        @Override // zc.e.a
        public final p0 c(com.google.crypto.tink.shaded.protobuf.h hVar) throws z {
            return c0.C(hVar, com.google.crypto.tink.shaded.protobuf.o.a());
        }

        @Override // zc.e.a
        public final void d(p0 p0Var) throws GeneralSecurityException {
            c0 c0Var = (c0) p0Var;
            if (c0Var.z() < 16) {
                throw new GeneralSecurityException("key too short");
            }
            l.i(c0Var.A());
        }
    }

    public static e.a.C0358a h(int i10, int i11, a0 a0Var, h.a aVar) {
        c0.a aVarB = c0.B();
        d0.a aVarB2 = d0.B();
        aVarB2.e();
        d0.w((d0) aVarB2.f6808b, a0Var);
        aVarB2.e();
        d0.x((d0) aVarB2.f6808b, i11);
        d0 d0VarB = aVarB2.b();
        aVarB.e();
        c0.w((c0) aVarB.f6808b, d0VarB);
        aVarB.e();
        c0.x((c0) aVarB.f6808b, i10);
        return new e.a.C0358a(aVarB.b(), aVar);
    }

    public static void i(d0 d0Var) throws GeneralSecurityException {
        if (d0Var.A() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int iOrdinal = d0Var.z().ordinal();
        if (iOrdinal == 1) {
            if (d0Var.A() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (iOrdinal == 2) {
            if (d0Var.A() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (iOrdinal == 3) {
            if (d0Var.A() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (iOrdinal == 4) {
            if (d0Var.A() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (iOrdinal != 5) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (d0Var.A() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // zc.e
    public final a.EnumC0318a a() {
        return a.EnumC0318a.f31491b;
    }

    @Override // zc.e
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // zc.e
    public final e.a<c0, b0> d() {
        return new b(c0.class);
    }

    @Override // zc.e
    public final e0.b e() {
        return e0.b.SYMMETRIC;
    }

    @Override // zc.e
    public final p0 f(com.google.crypto.tink.shaded.protobuf.h hVar) throws z {
        return b0.E(hVar, com.google.crypto.tink.shaded.protobuf.o.a());
    }

    @Override // zc.e
    public final void g(p0 p0Var) throws GeneralSecurityException {
        b0 b0Var = (b0) p0Var;
        y.c(b0Var.C());
        if (b0Var.A().size() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        i(b0Var.B());
    }
}
