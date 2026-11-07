package ve;

import java.io.File;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class b0 extends l0 {
    @Override // ve.l0
    public final p0 a(k0 k0Var) {
        return new d0(k0Var);
    }

    @Override // ve.l0
    public final p0 b(File file) throws IOException {
        throw null;
    }

    @Override // ve.l0
    public final p0 c(k0 k0Var) throws IOException {
        return (d0) super.c(k0Var);
    }

    @Override // ve.l0
    public final n0 d(p0 p0Var, String str) {
        return (str.equals("BASE") || str.equals("GDEF") || str.equals("GPOS") || str.equals("GSUB") || str.equals("JSTF")) ? new c0(p0Var) : str.equals("CFF ") ? new b(p0Var) : new n0(p0Var);
    }

    public final d0 e(File file) throws IOException {
        return (d0) super.b(file);
    }
}
