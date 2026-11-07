package tc;

import com.google.crypto.tink.shaded.protobuf.p0;
import ed.e0;
import ed.k0;
import java.security.GeneralSecurityException;
import zc.e;

/* loaded from: classes2.dex */
public final class f0 extends zc.e<ed.k0> {

    public class a extends e.a<ed.l0, ed.k0> {
        @Override // zc.e.a
        public final p0 a(p0 p0Var) throws GeneralSecurityException {
            k0.a aVarA = ed.k0.A();
            aVarA.e();
            ed.k0.x((ed.k0) aVarA.f6808b, (ed.l0) p0Var);
            aVarA.e();
            ed.k0.w((ed.k0) aVarA.f6808b);
            return aVarA.b();
        }

        @Override // zc.e.a
        public final p0 c(com.google.crypto.tink.shaded.protobuf.h hVar) throws com.google.crypto.tink.shaded.protobuf.z {
            return ed.l0.x(hVar, com.google.crypto.tink.shaded.protobuf.o.a());
        }

        @Override // zc.e.a
        public final /* bridge */ /* synthetic */ void d(p0 p0Var) throws GeneralSecurityException {
        }
    }

    @Override // zc.e
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // zc.e
    public final e.a<ed.l0, ed.k0> d() {
        return new a(ed.l0.class);
    }

    @Override // zc.e
    public final e0.b e() {
        return e0.b.REMOTE;
    }

    @Override // zc.e
    public final p0 f(com.google.crypto.tink.shaded.protobuf.h hVar) throws com.google.crypto.tink.shaded.protobuf.z {
        return ed.k0.B(hVar, com.google.crypto.tink.shaded.protobuf.o.a());
    }

    @Override // zc.e
    public final void g(p0 p0Var) throws GeneralSecurityException {
        gd.y.c(((ed.k0) p0Var).z());
    }
}
