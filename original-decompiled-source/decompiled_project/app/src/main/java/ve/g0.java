package ve;

import android.util.Log;
import java.io.IOException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
public final class g0 extends n0 {

    /* renamed from: f, reason: collision with root package name */
    public float f30805f;

    /* renamed from: g, reason: collision with root package name */
    public float f30806g;

    /* renamed from: h, reason: collision with root package name */
    public short f30807h;

    /* renamed from: i, reason: collision with root package name */
    public short f30808i;

    /* renamed from: j, reason: collision with root package name */
    public long f30809j;

    /* renamed from: k, reason: collision with root package name */
    public long f30810k;

    /* renamed from: l, reason: collision with root package name */
    public long f30811l;

    /* renamed from: m, reason: collision with root package name */
    public long f30812m;

    /* renamed from: n, reason: collision with root package name */
    public long f30813n;

    /* renamed from: o, reason: collision with root package name */
    public String[] f30814o;

    @Override // ve.n0
    public final void a(p0 p0Var, k0 k0Var) throws IOException {
        String[] strArr;
        this.f30805f = k0Var.E();
        this.f30806g = k0Var.E();
        this.f30807h = k0Var.Z();
        this.f30808i = k0Var.Z();
        this.f30809j = k0Var.g0();
        this.f30810k = k0Var.g0();
        this.f30811l = k0Var.g0();
        this.f30812m = k0Var.g0();
        this.f30813n = k0Var.g0();
        float f10 = this.f30805f;
        int i10 = 0;
        if (f10 == 1.0f) {
            String[] strArr2 = new String[258];
            this.f30814o = strArr2;
            System.arraycopy(t0.f30946a, 0, strArr2, 0, 258);
        } else if (f10 == 2.0f) {
            int iI0 = k0Var.i0();
            int[] iArr = new int[iI0];
            this.f30814o = new String[iI0];
            int iMax = PKIFailureInfo.systemUnavail;
            for (int i11 = 0; i11 < iI0; i11++) {
                int iI02 = k0Var.i0();
                iArr[i11] = iI02;
                if (iI02 <= 32767) {
                    iMax = Math.max(iMax, iI02);
                }
            }
            if (iMax >= 258) {
                int i12 = iMax - 257;
                strArr = new String[i12];
                int i13 = 0;
                while (i13 < i12) {
                    try {
                        strArr[i13] = k0Var.d0(k0Var.e0(), xe.a.f33561a);
                        i13++;
                    } catch (IOException e10) {
                        Log.w("PdfBox-Android", r1.f.a(i13, i12, "Error reading names in PostScript table at entry ", " of ", ", setting remaining entries to .notdef"), e10);
                        while (i13 < i12) {
                            strArr[i13] = ".notdef";
                            i13++;
                        }
                    }
                }
            } else {
                strArr = null;
            }
            while (i10 < iI0) {
                int i14 = iArr[i10];
                if (i14 >= 0 && i14 < 258) {
                    this.f30814o[i10] = t0.f30946a[i14];
                } else if (i14 < 258 || i14 > 32767) {
                    this.f30814o[i10] = ".undefined";
                } else {
                    this.f30814o[i10] = strArr[i14 - 258];
                }
                i10++;
            }
        } else if (f10 == 2.5f) {
            int iE = p0Var.E();
            int[] iArr2 = new int[iE];
            int i15 = 0;
            while (i15 < iE) {
                int i16 = k0Var.read();
                if (i16 > 127) {
                    i16 -= 256;
                }
                int i17 = i15 + 1;
                iArr2[i15] = i16 + i17;
                i15 = i17;
            }
            this.f30814o = new String[iE];
            while (true) {
                String[] strArr3 = this.f30814o;
                if (i10 >= strArr3.length) {
                    break;
                }
                int i18 = iArr2[i10];
                if (i18 < 0 || i18 >= 258) {
                    Log.d("PdfBox-Android", "incorrect glyph name index " + i18 + ", valid numbers 0..258");
                } else {
                    String str = t0.f30946a[i18];
                    if (str != null) {
                        strArr3[i10] = str;
                    }
                }
                i10++;
            }
        } else if (f10 == 3.0f) {
            Log.d("PdfBox-Android", "No PostScript name information is provided for the font " + this.f30856e.z());
        }
        this.f30855d = true;
    }
}
