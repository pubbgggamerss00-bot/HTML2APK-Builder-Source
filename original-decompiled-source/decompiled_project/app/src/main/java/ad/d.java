package ad;

import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p0;
import com.google.crypto.tink.shaded.protobuf.z;
import ed.a;
import ed.b;
import ed.c;
import ed.e0;
import gd.t;
import gd.y;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import sc.h;
import zc.e;

/* loaded from: classes2.dex */
public final class d extends zc.e<ed.a> {

    /* renamed from: d, reason: collision with root package name */
    public static final zc.o f403d = new zc.o(ad.a.class, new b());

    public class a extends e.a<ed.b, ed.a> {
        @Override // zc.e.a
        public final p0 a(p0 p0Var) throws GeneralSecurityException {
            ed.b bVar = (ed.b) p0Var;
            a.C0089a c0089aC = ed.a.C();
            c0089aC.e();
            ed.a.w((ed.a) c0089aC.f6808b);
            byte[] bArrA = t.a(bVar.y());
            h.f fVarC = com.google.crypto.tink.shaded.protobuf.h.c(0, bArrA.length, bArrA);
            c0089aC.e();
            ed.a.x((ed.a) c0089aC.f6808b, fVarC);
            ed.c cVarZ = bVar.z();
            c0089aC.e();
            ed.a.y((ed.a) c0089aC.f6808b, cVarZ);
            return c0089aC.b();
        }

        @Override // zc.e.a
        public final Map<String, e.a.C0358a<ed.b>> b() throws GeneralSecurityException {
            HashMap map = new HashMap();
            b.a aVarA = ed.b.A();
            aVarA.e();
            ed.b.w((ed.b) aVarA.f6808b);
            c.a aVarZ = ed.c.z();
            aVarZ.e();
            ed.c.w((ed.c) aVarZ.f6808b);
            ed.c cVarB = aVarZ.b();
            aVarA.e();
            ed.b.x((ed.b) aVarA.f6808b, cVarB);
            ed.b bVarB = aVarA.b();
            h.a aVar = h.a.f24806a;
            map.put("AES_CMAC", new e.a.C0358a(bVarB, aVar));
            b.a aVarA2 = ed.b.A();
            aVarA2.e();
            ed.b.w((ed.b) aVarA2.f6808b);
            c.a aVarZ2 = ed.c.z();
            aVarZ2.e();
            ed.c.w((ed.c) aVarZ2.f6808b);
            ed.c cVarB2 = aVarZ2.b();
            aVarA2.e();
            ed.b.x((ed.b) aVarA2.f6808b, cVarB2);
            map.put("AES256_CMAC", new e.a.C0358a(aVarA2.b(), aVar));
            b.a aVarA3 = ed.b.A();
            aVarA3.e();
            ed.b.w((ed.b) aVarA3.f6808b);
            c.a aVarZ3 = ed.c.z();
            aVarZ3.e();
            ed.c.w((ed.c) aVarZ3.f6808b);
            ed.c cVarB3 = aVarZ3.b();
            aVarA3.e();
            ed.b.x((ed.b) aVarA3.f6808b, cVarB3);
            map.put("AES256_CMAC_RAW", new e.a.C0358a(aVarA3.b(), h.a.f24807b));
            return Collections.unmodifiableMap(map);
        }

        @Override // zc.e.a
        public final p0 c(com.google.crypto.tink.shaded.protobuf.h hVar) throws z {
            return ed.b.B(hVar, com.google.crypto.tink.shaded.protobuf.o.a());
        }

        @Override // zc.e.a
        public final void d(p0 p0Var) throws GeneralSecurityException {
            ed.b bVar = (ed.b) p0Var;
            d.h(bVar.z());
            if (bVar.y() != 32) {
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            }
        }
    }

    public static void h(ed.c cVar) throws GeneralSecurityException {
        if (cVar.y() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (cVar.y() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    @Override // zc.e
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // zc.e
    public final e.a<ed.b, ed.a> d() {
        return new a(ed.b.class);
    }

    @Override // zc.e
    public final e0.b e() {
        return e0.b.SYMMETRIC;
    }

    @Override // zc.e
    public final p0 f(com.google.crypto.tink.shaded.protobuf.h hVar) throws z {
        return ed.a.D(hVar, com.google.crypto.tink.shaded.protobuf.o.a());
    }

    @Override // zc.e
    public final void g(p0 p0Var) throws GeneralSecurityException {
        ed.a aVar = (ed.a) p0Var;
        y.c(aVar.B());
        if (aVar.z().size() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
        h(aVar.A());
    }
}
