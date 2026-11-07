package tc;

import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p0;
import ed.e0;
import ed.r;
import ed.s;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import sc.h;
import wc.a;
import zc.e;

/* loaded from: classes2.dex */
public final class o extends zc.e<ed.r> {

    public class a extends e.a<ed.s, ed.r> {
        @Override // zc.e.a
        public final p0 a(p0 p0Var) throws GeneralSecurityException {
            r.a aVarA = ed.r.A();
            byte[] bArrA = gd.t.a(((ed.s) p0Var).x());
            h.f fVarC = com.google.crypto.tink.shaded.protobuf.h.c(0, bArrA.length, bArrA);
            aVarA.e();
            ed.r.x((ed.r) aVarA.f6808b, fVarC);
            aVarA.e();
            ed.r.w((ed.r) aVarA.f6808b);
            return aVarA.b();
        }

        @Override // zc.e.a
        public final Map<String, e.a.C0358a<ed.s>> b() throws GeneralSecurityException {
            HashMap map = new HashMap();
            h.a aVar = h.a.f24806a;
            map.put("AES128_GCM", o.h(16, aVar));
            h.a aVar2 = h.a.f24807b;
            map.put("AES128_GCM_RAW", o.h(16, aVar2));
            map.put("AES256_GCM", o.h(32, aVar));
            map.put("AES256_GCM_RAW", o.h(32, aVar2));
            return Collections.unmodifiableMap(map);
        }

        @Override // zc.e.a
        public final p0 c(com.google.crypto.tink.shaded.protobuf.h hVar) throws com.google.crypto.tink.shaded.protobuf.z {
            return ed.s.z(hVar, com.google.crypto.tink.shaded.protobuf.o.a());
        }

        @Override // zc.e.a
        public final void d(p0 p0Var) throws GeneralSecurityException {
            gd.y.a(((ed.s) p0Var).x());
        }
    }

    public static e.a.C0358a h(int i10, h.a aVar) {
        s.a aVarY = ed.s.y();
        aVarY.e();
        ed.s.w((ed.s) aVarY.f6808b, i10);
        return new e.a.C0358a(aVarY.b(), aVar);
    }

    @Override // zc.e
    public final a.EnumC0318a a() {
        return a.EnumC0318a.f31491b;
    }

    @Override // zc.e
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // zc.e
    public final e.a<ed.s, ed.r> d() {
        return new a(ed.s.class);
    }

    @Override // zc.e
    public final e0.b e() {
        return e0.b.SYMMETRIC;
    }

    @Override // zc.e
    public final p0 f(com.google.crypto.tink.shaded.protobuf.h hVar) throws com.google.crypto.tink.shaded.protobuf.z {
        return ed.r.B(hVar, com.google.crypto.tink.shaded.protobuf.o.a());
    }

    @Override // zc.e
    public final void g(p0 p0Var) throws GeneralSecurityException {
        ed.r rVar = (ed.r) p0Var;
        gd.y.c(rVar.z());
        gd.y.a(rVar.y().size());
    }
}
