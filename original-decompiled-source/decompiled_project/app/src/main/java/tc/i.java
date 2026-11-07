package tc;

import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p0;
import ed.e0;
import ed.l;
import ed.m;
import ed.n;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import sc.h;
import zc.e;

/* loaded from: classes2.dex */
public final class i extends zc.e<ed.l> {

    public class a extends e.a<ed.m, ed.l> {
        @Override // zc.e.a
        public final p0 a(p0 p0Var) throws GeneralSecurityException {
            ed.m mVar = (ed.m) p0Var;
            l.a aVarC = ed.l.C();
            byte[] bArrA = gd.t.a(mVar.y());
            h.f fVarC = com.google.crypto.tink.shaded.protobuf.h.c(0, bArrA.length, bArrA);
            aVarC.e();
            ed.l.y((ed.l) aVarC.f6808b, fVarC);
            ed.n nVarZ = mVar.z();
            aVarC.e();
            ed.l.x((ed.l) aVarC.f6808b, nVarZ);
            aVarC.e();
            ed.l.w((ed.l) aVarC.f6808b);
            return aVarC.b();
        }

        @Override // zc.e.a
        public final Map<String, e.a.C0358a<ed.m>> b() throws GeneralSecurityException {
            HashMap map = new HashMap();
            h.a aVar = h.a.f24806a;
            map.put("AES128_EAX", i.h(16, aVar));
            h.a aVar2 = h.a.f24807b;
            map.put("AES128_EAX_RAW", i.h(16, aVar2));
            map.put("AES256_EAX", i.h(32, aVar));
            map.put("AES256_EAX_RAW", i.h(32, aVar2));
            return Collections.unmodifiableMap(map);
        }

        @Override // zc.e.a
        public final p0 c(com.google.crypto.tink.shaded.protobuf.h hVar) throws com.google.crypto.tink.shaded.protobuf.z {
            return ed.m.B(hVar, com.google.crypto.tink.shaded.protobuf.o.a());
        }

        @Override // zc.e.a
        public final void d(p0 p0Var) throws GeneralSecurityException {
            ed.m mVar = (ed.m) p0Var;
            gd.y.a(mVar.y());
            if (mVar.z().y() != 12 && mVar.z().y() != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }

    public static e.a.C0358a h(int i10, h.a aVar) {
        m.a aVarA = ed.m.A();
        aVarA.e();
        ed.m.x((ed.m) aVarA.f6808b, i10);
        n.a aVarZ = ed.n.z();
        aVarZ.e();
        ed.n.w((ed.n) aVarZ.f6808b);
        ed.n nVarB = aVarZ.b();
        aVarA.e();
        ed.m.w((ed.m) aVarA.f6808b, nVarB);
        return new e.a.C0358a(aVarA.b(), aVar);
    }

    @Override // zc.e
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // zc.e
    public final e.a<ed.m, ed.l> d() {
        return new a(ed.m.class);
    }

    @Override // zc.e
    public final e0.b e() {
        return e0.b.SYMMETRIC;
    }

    @Override // zc.e
    public final p0 f(com.google.crypto.tink.shaded.protobuf.h hVar) throws com.google.crypto.tink.shaded.protobuf.z {
        return ed.l.D(hVar, com.google.crypto.tink.shaded.protobuf.o.a());
    }

    @Override // zc.e
    public final void g(p0 p0Var) throws GeneralSecurityException {
        ed.l lVar = (ed.l) p0Var;
        gd.y.c(lVar.B());
        gd.y.a(lVar.z().size());
        if (lVar.A().y() != 12 && lVar.A().y() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
