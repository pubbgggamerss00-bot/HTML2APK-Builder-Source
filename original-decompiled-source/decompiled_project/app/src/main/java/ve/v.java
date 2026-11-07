package ve;

import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import ve.u;

/* loaded from: classes2.dex */
public final class v extends n0 {

    /* renamed from: f, reason: collision with root package name */
    public u[] f30949f;

    @Override // ve.n0
    public final void a(p0 p0Var, k0 k0Var) throws IOException {
        int iG0;
        int iI0 = k0Var.i0();
        if (iI0 != 0) {
            iI0 = (iI0 << 16) | k0Var.i0();
        }
        if (iI0 == 0) {
            iG0 = k0Var.i0();
        } else if (iI0 == 1) {
            iG0 = (int) k0Var.g0();
        } else {
            a5.a.a(iI0, "Skipped kerning table due to an unsupported kerning table version: ", "PdfBox-Android");
            iG0 = 0;
        }
        if (iG0 > 0) {
            this.f30949f = new u[iG0];
            for (int i10 = 0; i10 < iG0; i10++) {
                u uVar = new u();
                if (iI0 == 0) {
                    int iI02 = k0Var.i0();
                    if (iI02 != 0) {
                        Log.i("PdfBox-Android", "Unsupported kerning sub-table version: " + iI02);
                    } else {
                        int iI03 = k0Var.i0();
                        if (iI03 < 6) {
                            throw new IOException(ad.b.b(iI03, "Kerning sub-table too short, got ", " bytes, expect 6 or more."));
                        }
                        int iI04 = (k0Var.i0() & 65280) >> 8;
                        if (iI04 == 0) {
                            u.a aVar = new u.a();
                            int iI05 = k0Var.i0();
                            k0Var.i0();
                            k0Var.i0();
                            k0Var.i0();
                            aVar.f30948a = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iI05, 3);
                            for (int i11 = 0; i11 < iI05; i11++) {
                                int iI06 = k0Var.i0();
                                int iI07 = k0Var.i0();
                                short sZ = k0Var.Z();
                                int[] iArr = aVar.f30948a[i11];
                                iArr[0] = iI06;
                                iArr[1] = iI07;
                                iArr[2] = sZ;
                            }
                        } else if (iI04 == 2) {
                            Log.i("PdfBox-Android", "Kerning subtable format 2 not yet supported.");
                        } else {
                            a5.a.a(iI04, "Skipped kerning subtable due to an unsupported kerning subtable version: ", "PdfBox-Android");
                        }
                    }
                } else {
                    if (iI0 != 1) {
                        throw new IllegalStateException();
                    }
                    Log.i("PdfBox-Android", "Kerning subtable format 1 not yet supported.");
                }
                this.f30949f[i10] = uVar;
            }
        }
        this.f30855d = true;
    }
}
