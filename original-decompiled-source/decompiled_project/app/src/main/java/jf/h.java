package jf;

import cf.l;
import cf.r;
import cf.t;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class h implements c {

    /* renamed from: a, reason: collision with root package name */
    public final t f15719a;

    public h(t tVar) {
        this.f15719a = tVar;
    }

    @Override // jf.c
    public final cf.b Z() {
        return this.f15719a;
    }

    public h(hf.b bVar, InputStream inputStream, l lVar) throws IOException {
        r rVarV0 = null;
        try {
            t tVarG0 = bVar.f12997a.g0();
            this.f15719a = tVarG0;
            rVarV0 = tVarG0.V0(lVar);
            ef.a.c(inputStream, rVarV0);
            rVarV0.close();
            inputStream.close();
        } catch (Throwable th2) {
            if (rVarV0 != null) {
                rVarV0.close();
            }
            inputStream.close();
            throw th2;
        }
    }
}
