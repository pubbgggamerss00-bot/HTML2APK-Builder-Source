package df;

import cf.t;
import cf.x;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;

/* loaded from: classes2.dex */
public final class g extends k {
    @Override // df.k
    public final j a(InputStream inputStream, OutputStream outputStream, t tVar, int i10) throws IOException {
        InputStream inputStream2;
        long j10;
        int i11;
        int i12;
        cf.d dVarD = k.d(tVar, i10);
        int iG0 = dVarD.G0(cf.l.U, null, 1728);
        int iG02 = dVarD.G0(cf.l.f5449a2, null, 0);
        int iG03 = tVar.G0(cf.l.T0, cf.l.R0, 0);
        if (iG02 <= 0 || iG03 <= 0) {
            iG03 = Math.max(iG02, iG03);
        }
        int iG04 = dVarD.G0(cf.l.f5470g1, null, 0);
        boolean zI0 = dVarD.i0(cf.l.f5522u0);
        int i13 = ((iG0 + 7) / 8) * iG03;
        byte[] bArr = new byte[i13];
        if (iG04 == 0) {
            byte[] bArr2 = new byte[20];
            int i14 = inputStream.read(bArr2);
            PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream, 20);
            pushbackInputStream.unread(bArr2, 0, i14);
            byte b10 = bArr2[0];
            if (b10 == 0) {
                byte b11 = bArr2[1];
                if ((b11 >> 4) == 1 || b11 == 1) {
                    i12 = 3;
                    j10 = 0;
                    inputStream2 = pushbackInputStream;
                    i11 = i12;
                }
            }
            short s10 = (short) (((b10 << 8) + (bArr2[1] & 255)) >> 4);
            for (int i15 = 12; i15 < i14 * 8; i15++) {
                s10 = (short) ((s10 << 1) + ((bArr2[i15 / 8] >> (7 - (i15 % 8))) & 1));
                if ((s10 & 4095) == 1) {
                    i12 = 3;
                    break;
                }
            }
            i12 = 2;
            j10 = 0;
            inputStream2 = pushbackInputStream;
            i11 = i12;
        } else if (iG04 > 0) {
            j10 = 1;
            i11 = 3;
            inputStream2 = inputStream;
        } else {
            inputStream2 = inputStream;
            j10 = 0;
            i11 = 4;
        }
        e eVar = new e(inputStream2, iG0, i11, j10, zI0);
        int i16 = 0;
        do {
            int i17 = eVar.read(bArr, i16, i13 - i16);
            if (i17 <= -1) {
                break;
            }
            i16 += i17;
        } while (i16 < i13);
        if (!dVarD.i0(cf.l.f5541z)) {
            for (int i18 = 0; i18 < i13; i18++) {
                bArr[i18] = (byte) ((~bArr[i18]) & 255);
            }
        }
        outputStream.write(bArr);
        return new j(tVar);
    }

    @Override // df.k
    public final void c(ef.d dVar, OutputStream outputStream, x xVar) throws IOException {
        ef.a.c(dVar, new f(outputStream, xVar.G0(cf.l.U, null, -1), xVar.G0(cf.l.f5449a2, null, -1)));
    }
}
