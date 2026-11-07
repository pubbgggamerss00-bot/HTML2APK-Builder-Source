package ve;

import android.graphics.Path;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class d0 extends p0 {

    /* renamed from: f, reason: collision with root package name */
    public boolean f30788f;

    @Override // ve.p0
    public final Path N(String str) throws NumberFormatException, IOException {
        int iG0 = g0(str);
        if (this.f30788f) {
            return ((b) Z("CFF ")).f30776f.b(iG0).a();
        }
        throw new UnsupportedOperationException("TTF fonts do not have a CFF table");
    }

    @Override // ve.p0
    public final p h() throws IOException {
        if (this.f30788f) {
            throw new UnsupportedOperationException("OTF fonts do not have a glyf table");
        }
        return super.h();
    }

    @Override // ve.p0
    public final void k0(float f10) {
        this.f30788f = Float.floatToIntBits(f10) == 1184802985;
    }
}
