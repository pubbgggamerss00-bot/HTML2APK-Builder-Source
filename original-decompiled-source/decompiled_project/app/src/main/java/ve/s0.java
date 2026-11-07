package ve;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class s0 extends n0 {

    /* renamed from: f, reason: collision with root package name */
    public ConcurrentHashMap f30944f;

    @Override // ve.n0
    public final void a(p0 p0Var, k0 k0Var) throws IOException {
        k0Var.E();
        k0Var.Z();
        int iI0 = k0Var.i0();
        this.f30944f = new ConcurrentHashMap(iI0);
        for (int i10 = 0; i10 < iI0; i10++) {
            this.f30944f.put(Integer.valueOf(k0Var.i0()), Integer.valueOf(k0Var.Z()));
        }
        this.f30855d = true;
    }
}
