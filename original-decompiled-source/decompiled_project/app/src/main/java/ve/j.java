package ve;

import android.util.Log;
import java.io.IOException;
import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes2.dex */
public final class j extends i {

    /* renamed from: b, reason: collision with root package name */
    public final int[] f30828b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f30829c;

    /* renamed from: d, reason: collision with root package name */
    public final short[] f30830d;

    /* renamed from: e, reason: collision with root package name */
    public final short[] f30831e;

    /* renamed from: f, reason: collision with root package name */
    public final int f30832f;

    public j() throws IOException {
        super((short) 0);
        this.f30832f = 0;
    }

    @Override // ve.l
    public final int a() {
        return this.f30832f;
    }

    @Override // ve.l
    public final short b(int i10) {
        return this.f30830d[i10];
    }

    @Override // ve.l
    public final boolean c() {
        return false;
    }

    @Override // ve.l
    public final short d(int i10) {
        return this.f30831e[i10];
    }

    @Override // ve.l
    public final int e(int i10) {
        return this.f30828b[i10];
    }

    @Override // ve.l
    public final byte f(int i10) {
        return this.f30829c[i10];
    }

    public j(short s10, k0 k0Var, short s11) throws IOException {
        int iE0;
        int iE02;
        super(s10);
        if (s10 == 0) {
            this.f30832f = 0;
            return;
        }
        int[] iArrK0 = k0Var.k0(s10);
        this.f30828b = iArrK0;
        int i10 = iArrK0[s10 - 1];
        if (s10 == 1 && i10 == 65535) {
            this.f30832f = 0;
            return;
        }
        int i11 = i10 + 1;
        this.f30832f = i11;
        byte[] bArr = new byte[i11];
        this.f30829c = bArr;
        this.f30830d = new short[i11];
        this.f30831e = new short[i11];
        k0Var.f0(k0Var.i0());
        int i12 = 0;
        loop0: while (true) {
            if (i12 >= i11) {
                break;
            }
            byte bE0 = (byte) k0Var.e0();
            bArr[i12] = bE0;
            if ((bE0 & 8) != 0) {
                int iE03 = k0Var.e0();
                for (int i13 = 1; i13 <= iE03; i13++) {
                    int i14 = i12 + i13;
                    if (i14 >= i11) {
                        Log.e("PdfBox-Android", "repeat count (" + iE03 + ") higher than remaining space");
                        break loop0;
                    }
                    bArr[i14] = bArr[i12];
                }
                i12 += iE03;
            }
            i12++;
        }
        int i15 = this.f30832f;
        byte[] bArr2 = this.f30829c;
        for (int i16 = 0; i16 < i15; i16++) {
            byte b10 = bArr2[i16];
            if ((b10 & RegisterType.UNINIT_REF) != 0) {
                if ((b10 & 2) != 0) {
                    iE02 = s11 + ((short) k0Var.e0());
                    s11 = (short) iE02;
                }
            } else if ((b10 & 2) != 0) {
                iE02 = s11 - ((short) k0Var.e0());
                s11 = (short) iE02;
            } else {
                s11 = (short) (k0Var.Z() + s11);
            }
            this.f30830d[i16] = s11;
        }
        short sZ = 0;
        for (int i17 = 0; i17 < i15; i17++) {
            byte b11 = bArr2[i17];
            if ((b11 & 32) != 0) {
                if ((b11 & 4) != 0) {
                    iE0 = sZ + ((short) k0Var.e0());
                    sZ = (short) iE0;
                }
            } else if ((b11 & 4) != 0) {
                iE0 = sZ - ((short) k0Var.e0());
                sZ = (short) iE0;
            } else {
                sZ = (short) (k0Var.Z() + sZ);
            }
            this.f30831e[i17] = sZ;
        }
    }
}
