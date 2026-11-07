package df;

import android.util.Log;
import cf.t;
import cf.x;
import h1.y;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class p extends k {
    public static int e(int i10, int i11) {
        if (i10 >= 2048 - i11) {
            return 12;
        }
        if (i10 >= 1024 - i11) {
            return 11;
        }
        return i10 >= 512 - i11 ? 10 : 9;
    }

    public static void f(ArrayList arrayList, long j10, af.b bVar) throws IOException {
        if (j10 < 0) {
            StringBuilder sb = new StringBuilder("negative array index: ");
            sb.append(j10);
            sb.append(" near offset ");
            bVar.a();
            sb.append(bVar.f524b);
            throw new IOException(sb.toString());
        }
        if (j10 < arrayList.size()) {
            return;
        }
        StringBuilder sbA = y.a("array index overflow: ", " >= ", j10);
        sbA.append(arrayList.size());
        sbA.append(" near offset ");
        bVar.a();
        sbA.append(bVar.f524b);
        throw new IOException(sbA.toString());
    }

    public static ArrayList g() {
        ArrayList arrayList = new ArrayList(4096);
        for (int i10 = 0; i10 < 256; i10++) {
            arrayList.add(new byte[]{(byte) (i10 & 255)});
        }
        arrayList.add(null);
        arrayList.add(null);
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f4, code lost:
    
        throw new java.lang.IllegalArgumentException();
     */
    @Override // df.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j a(InputStream inputStream, OutputStream outputStream, t tVar, int i10) throws IOException {
        int i11;
        cf.d dVarD = k.d(tVar, i10);
        char c10 = 1;
        int iG0 = dVarD.G0(cf.l.f5519t0, null, 1);
        if (iG0 != 0 && iG0 != 1) {
            iG0 = 1;
        }
        OutputStream outputStreamA = r.a(outputStream, dVarD);
        ArrayList arrayList = new ArrayList();
        af.b bVar = new af.b();
        bVar.f530h = new af.d();
        bVar.f529g = inputStream;
        int iE = 9;
        long j10 = -1;
        while (true) {
            try {
                bVar.a();
                if (iE >= 0 && iE <= 64) {
                    long j11 = 0;
                    int i12 = 0;
                    while (i12 < iE) {
                        long j12 = j11 << c10;
                        bVar.a();
                        int i13 = bVar.f526d;
                        char c11 = c10;
                        int i14 = bVar.read();
                        if (i14 == -1) {
                            throw new EOFException();
                        }
                        int i15 = (i13 + 1) & 7;
                        if (i15 != 0) {
                            i14 >>= 8 - i15;
                            bVar.a();
                            i11 = iE;
                            bVar.c(bVar.f524b - 1);
                        } else {
                            i11 = iE;
                        }
                        bVar.f526d = i15;
                        j11 = j12 | (i14 & 1);
                        i12++;
                        c10 = c11;
                        iE = i11;
                    }
                    char c12 = c10;
                    if (j11 == 257) {
                        break;
                    }
                    if (j11 == 256) {
                        arrayList = g();
                        j10 = -1;
                        c10 = c12;
                        iE = 9;
                    } else {
                        if (j11 < arrayList.size()) {
                            byte[] bArr = (byte[]) arrayList.get((int) j11);
                            byte b10 = bArr[0];
                            outputStreamA.write(bArr);
                            if (j10 != -1) {
                                f(arrayList, j10, bVar);
                                byte[] bArr2 = (byte[]) arrayList.get((int) j10);
                                byte[] bArrCopyOf = Arrays.copyOf(bArr2, bArr2.length + 1);
                                bArrCopyOf[bArr2.length] = b10;
                                arrayList.add(bArrCopyOf);
                            }
                        } else {
                            f(arrayList, j10, bVar);
                            byte[] bArr3 = (byte[]) arrayList.get((int) j10);
                            byte[] bArrCopyOf2 = Arrays.copyOf(bArr3, bArr3.length + 1);
                            bArrCopyOf2[bArr3.length] = bArr3[0];
                            outputStreamA.write(bArrCopyOf2);
                            arrayList.add(bArrCopyOf2);
                        }
                        iE = e(arrayList.size(), iG0);
                        c10 = c12;
                        j10 = j11;
                    }
                } else {
                    break;
                }
            } catch (EOFException unused) {
                Log.w("PdfBox-Android", "Premature EOF in LZW stream, EOD code missing");
            }
        }
        outputStreamA.flush();
        return new j(tVar);
    }

    @Override // df.k
    public final void c(ef.d dVar, OutputStream outputStream, x xVar) throws IOException {
        ArrayList arrayListG = g();
        af.c cVar = new af.c(outputStream);
        cVar.e(9, 256L);
        byte[] bArrCopyOf = null;
        int i10 = -1;
        while (true) {
            int i11 = dVar.read();
            if (i11 == -1) {
                break;
            }
            byte b10 = (byte) i11;
            if (bArrCopyOf == null) {
                bArrCopyOf = new byte[]{b10};
            } else {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length + 1);
                bArrCopyOf[bArrCopyOf.length - 1] = b10;
                int size = arrayListG.size() - 1;
                int i12 = -1;
                int length = 0;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    if (size <= 257) {
                        if (i12 != -1) {
                            break;
                        } else if (bArrCopyOf.length > 1) {
                            i12 = -1;
                            break;
                        }
                    }
                    byte[] bArr = (byte[]) arrayListG.get(size);
                    if ((i12 != -1 || bArr.length > length) && Arrays.equals(bArr, bArrCopyOf)) {
                        length = bArr.length;
                        i12 = size;
                    }
                    size--;
                }
                if (i12 == -1) {
                    int iE = e(arrayListG.size() - 1, 1);
                    cVar.e(iE, i10);
                    arrayListG.add(bArrCopyOf);
                    if (arrayListG.size() == 4096) {
                        cVar.e(iE, 256L);
                        arrayListG = g();
                    }
                    bArrCopyOf = new byte[]{b10};
                } else {
                    i10 = i12;
                }
            }
            i10 = b10 & 255;
        }
        if (i10 != -1) {
            cVar.e(e(arrayListG.size() - 1, 1), i10);
        }
        cVar.e(e(arrayListG.size(), 1), 257L);
        cVar.e(7, 0L);
        cVar.a();
        cVar.b(cVar.f524b);
        cVar.close();
    }
}
