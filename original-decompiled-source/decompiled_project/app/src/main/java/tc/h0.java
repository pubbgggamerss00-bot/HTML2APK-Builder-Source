package tc;

import com.google.crypto.tink.shaded.protobuf.p0;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class h0 extends zc.q<sc.a, ed.m0> {
    @Override // zc.q
    public final sc.a a(p0 p0Var) throws GeneralSecurityException {
        ed.m0 m0Var = (ed.m0) p0Var;
        String strX = m0Var.y().x();
        return new g0(m0Var.y().w(), sc.m.a(strX).b(strX));
    }
}
