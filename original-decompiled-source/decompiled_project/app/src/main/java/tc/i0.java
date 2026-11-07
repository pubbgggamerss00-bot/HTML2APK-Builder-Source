package tc;

import com.google.crypto.tink.shaded.protobuf.p0;
import ed.e0;
import ed.m0;
import java.security.GeneralSecurityException;
import zc.e;

/* loaded from: classes2.dex */
public final class i0 extends zc.e<ed.m0> {

    public class a extends e.a<ed.n0, ed.m0> {
        @Override // zc.e.a
        public final p0 a(p0 p0Var) throws GeneralSecurityException {
            m0.a aVarA = ed.m0.A();
            aVarA.e();
            ed.m0.x((ed.m0) aVarA.f6808b, (ed.n0) p0Var);
            aVarA.e();
            ed.m0.w((ed.m0) aVarA.f6808b);
            return aVarA.b();
        }

        @Override // zc.e.a
        public final p0 c(com.google.crypto.tink.shaded.protobuf.h hVar) throws com.google.crypto.tink.shaded.protobuf.z {
            return ed.n0.z(hVar, com.google.crypto.tink.shaded.protobuf.o.a());
        }

        @Override // zc.e.a
        public final void d(p0 p0Var) throws GeneralSecurityException {
            ed.n0 n0Var = (ed.n0) p0Var;
            if (n0Var.x().isEmpty() || !n0Var.y()) {
                throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
            }
        }
    }

    @Override // zc.e
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // zc.e
    public final e.a<ed.n0, ed.m0> d() {
        return new a(ed.n0.class);
    }

    @Override // zc.e
    public final e0.b e() {
        return e0.b.REMOTE;
    }

    @Override // zc.e
    public final p0 f(com.google.crypto.tink.shaded.protobuf.h hVar) throws com.google.crypto.tink.shaded.protobuf.z {
        return ed.m0.B(hVar, com.google.crypto.tink.shaded.protobuf.o.a());
    }

    @Override // zc.e
    public final void g(p0 p0Var) throws GeneralSecurityException {
        gd.y.c(((ed.m0) p0Var).z());
    }
}
