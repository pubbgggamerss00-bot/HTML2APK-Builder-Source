package ve;

import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import ve.d;

/* loaded from: classes2.dex */
public final class e extends n0 {

    /* renamed from: f, reason: collision with root package name */
    public d[] f30789f;

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0222, code lost:
    
        throw new java.io.IOException("Invalid character code ".concat(java.lang.String.format("0x%X", java.lang.Long.valueOf(r26))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0238, code lost:
    
        throw new java.io.IOException("Invalid character code ".concat(java.lang.String.format("0x%X", java.lang.Long.valueOf(r14))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0285, code lost:
    
        throw new java.io.IOException("Invalid character codes, ".concat(java.lang.String.format("startCode: 0x%X, numChars: %d", java.lang.Long.valueOf(r2), java.lang.Long.valueOf(r5))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0371, code lost:
    
        throw new java.io.IOException("Range invalid");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0159, code lost:
    
        throw new java.io.IOException("Invalid character code ".concat(java.lang.String.format("0x%X", java.lang.Long.valueOf(r30))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x016f, code lost:
    
        throw new java.io.IOException("Invalid character code ".concat(java.lang.String.format("0x%X", java.lang.Long.valueOf(r28))));
     */
    @Override // ve.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(p0 p0Var, k0 k0Var) throws IOException {
        int i10;
        int i11;
        int i12;
        d.a[] aVarArr;
        int i13;
        int i14;
        int i15;
        int[] iArr;
        int i16;
        long j10;
        long j11;
        k0Var.i0();
        int iI0 = k0Var.i0();
        this.f30789f = new d[iI0];
        for (int i17 = 0; i17 < iI0; i17++) {
            d dVar = new d();
            dVar.f30778a = k0Var.i0();
            dVar.f30779b = k0Var.i0();
            dVar.f30780c = k0Var.g0();
            this.f30789f[i17] = dVar;
        }
        int iE = p0Var.E();
        int i18 = 0;
        while (true) {
            int i19 = 1;
            if (i18 >= iI0) {
                this.f30855d = true;
                return;
            }
            d dVar2 = this.f30789f[i18];
            dVar2.getClass();
            k0Var.seek(this.f30853b + dVar2.f30780c);
            int iI02 = k0Var.i0();
            if (iI02 < 8) {
                k0Var.i0();
                k0Var.i0();
            } else {
                k0Var.i0();
                k0Var.g0();
                k0Var.g0();
            }
            if (iI02 == 0) {
                i10 = iI0;
                i11 = i18;
                byte[] bArrZ = k0Var.z(256);
                dVar2.f30781d = d.d(256);
                dVar2.f30783f = new HashMap(bArrZ.length);
                for (int i20 = 0; i20 < bArrZ.length; i20++) {
                    int i21 = bArrZ[i20] & 255;
                    dVar2.f30781d[i21] = i20;
                    dVar2.f30783f.put(Integer.valueOf(i20), Integer.valueOf(i21));
                }
            } else if (iI02 == 2) {
                i10 = iI0;
                i11 = i18;
                int[] iArr2 = new int[256];
                int iMax = 0;
                for (int i22 = 0; i22 < 256; i22++) {
                    int iI03 = k0Var.i0();
                    iArr2[i22] = iI03;
                    iMax = Math.max(iMax, iI03 / 8);
                }
                d.a[] aVarArr2 = new d.a[iMax + 1];
                for (int i23 = 0; i23 <= iMax; i23++) {
                    aVarArr2[i23] = new d.a(k0Var.i0(), k0Var.i0(), k0Var.Z(), (k0Var.i0() - (((r2 - i23) - 1) * 8)) - 2);
                }
                long jH = k0Var.h();
                dVar2.f30781d = d.d(iE);
                dVar2.f30783f = new HashMap(iE);
                if (iE == 0) {
                    Log.w("PdfBox-Android", "subtable has no glyphs");
                } else {
                    int i24 = 0;
                    while (i24 <= iMax) {
                        d.a aVar = aVarArr2[i24];
                        int i25 = aVar.f30784a;
                        int i26 = aVar.f30787d;
                        short s10 = aVar.f30786c;
                        int i27 = aVar.f30785b;
                        k0Var.seek(i26 + jH);
                        int i28 = 0;
                        while (i28 < i27) {
                            int i29 = i25 + i28 + (i24 << 8);
                            int iI04 = k0Var.i0();
                            if (iI04 > 0 && (iI04 = (iI04 + s10) % 65536) < 0) {
                                iI04 += 65536;
                            }
                            if (iI04 >= iE) {
                                i12 = i24;
                                aVarArr = aVarArr2;
                                i13 = iMax;
                                StringBuilder sbA = p.g0.a(iI04, i29, "glyphId ", " for charcode ", " ignored, numGlyphs is ");
                                sbA.append(iE);
                                Log.w("PdfBox-Android", sbA.toString());
                            } else {
                                i12 = i24;
                                aVarArr = aVarArr2;
                                i13 = iMax;
                                dVar2.f30781d[iI04] = i29;
                                dVar2.f30783f.put(Integer.valueOf(i29), Integer.valueOf(iI04));
                            }
                            i28++;
                            i24 = i12;
                            aVarArr2 = aVarArr;
                            iMax = i13;
                        }
                        i24++;
                    }
                }
            } else if (iI02 != 4) {
                if (iI02 != 6) {
                    char c10 = '\n';
                    if (iI02 == 8) {
                        i16 = iI0;
                        i11 = i18;
                        int[] iArrF0 = k0Var.f0(8192);
                        long jG0 = k0Var.g0();
                        if (jG0 > 65536) {
                            throw new IOException("CMap ( Subtype8 ) is invalid");
                        }
                        dVar2.f30781d = d.d(iE);
                        dVar2.f30783f = new HashMap(iE);
                        if (iE == 0) {
                            Log.w("PdfBox-Android", "subtable has no glyphs");
                        } else {
                            long j12 = 0;
                            while (j12 < jG0) {
                                long jG02 = k0Var.g0();
                                long jG03 = k0Var.g0();
                                long jG04 = k0Var.g0();
                                if (jG02 <= jG03 && 0 <= jG02) {
                                    char c11 = c10;
                                    long j13 = j12;
                                    long j14 = jG02;
                                    while (j14 <= jG03) {
                                        if (j14 > 2147483647L) {
                                            throw new IOException(m0.r.a("[Sub Format 8] Invalid character code ", j14));
                                        }
                                        int i30 = (int) j14;
                                        int i31 = i30 / 8;
                                        if (i31 >= iArrF0.length) {
                                            throw new IOException(m0.r.a("[Sub Format 8] Invalid character code ", j14));
                                        }
                                        if ((iArrF0[i31] & (i19 << (i30 % 8))) != 0) {
                                            long j15 = ((((j14 >> c11) + 55232) << c11) + ((1023 & j14) + 56320)) - 56613888;
                                            if (j15 > 2147483647L) {
                                                throw new IOException(m0.r.a("[Sub Format 8] Invalid character code ", j15));
                                            }
                                            i30 = (int) j15;
                                        }
                                        long j16 = (j14 - jG02) + jG04;
                                        int i32 = i19;
                                        d dVar3 = dVar2;
                                        if (j16 <= iE && j16 <= 2147483647L) {
                                            int i33 = (int) j16;
                                            dVar3.f30781d[i33] = i30;
                                            dVar3.f30783f.put(Integer.valueOf(i30), Integer.valueOf(i33));
                                            j14++;
                                            dVar2 = dVar3;
                                            i19 = i32;
                                        }
                                    }
                                    j12 = j13 + 1;
                                    c10 = c11;
                                    i19 = i19;
                                }
                            }
                        }
                    } else if (iI02 != 10) {
                        switch (iI02) {
                            case 12:
                                i16 = iI0;
                                i11 = i18;
                                long jG05 = k0Var.g0();
                                dVar2.f30781d = d.d(iE);
                                dVar2.f30783f = new HashMap(iE);
                                if (iE == 0) {
                                    Log.w("PdfBox-Android", "subtable has no glyphs");
                                    break;
                                } else {
                                    long j17 = 0;
                                    int iMax2 = 0;
                                    while (j17 < jG05) {
                                        long jG06 = k0Var.g0();
                                        long jG07 = k0Var.g0();
                                        long jG08 = k0Var.g0();
                                        if (jG06 < 0 || jG06 > 1114111 || (jG06 >= 55296 && jG06 <= 57343)) {
                                            break;
                                        } else if ((jG07 > 0 && jG07 < jG06) || jG07 > 1114111 || (jG07 >= 55296 && jG07 <= 57343)) {
                                            break;
                                        } else {
                                            long j18 = 0;
                                            while (true) {
                                                j10 = jG05;
                                                if (j18 <= jG07 - jG06) {
                                                    long j19 = jG08 + j18;
                                                    j11 = j17;
                                                    if (j19 >= iE) {
                                                        Log.w("PdfBox-Android", "Format 12 cmap contains an invalid glyph index");
                                                    } else {
                                                        long j20 = jG06 + j18;
                                                        if (j20 > 1114111) {
                                                            Log.w("PdfBox-Android", "Format 12 cmap contains character beyond UCS-4");
                                                        }
                                                        int i34 = (int) j19;
                                                        iMax2 = Math.max(iMax2, i34);
                                                        dVar2.f30783f.put(Integer.valueOf((int) j20), Integer.valueOf(i34));
                                                        j18++;
                                                        jG05 = j10;
                                                        j17 = j11;
                                                    }
                                                } else {
                                                    j11 = j17;
                                                }
                                            }
                                            j17 = j11 + 1;
                                            jG05 = j10;
                                        }
                                    }
                                    dVar2.c(iMax2);
                                    break;
                                }
                                break;
                            case 13:
                                long jG09 = k0Var.g0();
                                dVar2.f30781d = d.d(iE);
                                dVar2.f30783f = new HashMap(iE);
                                if (iE == 0) {
                                    Log.w("PdfBox-Android", "subtable has no glyphs");
                                    i10 = iI0;
                                    i11 = i18;
                                    break;
                                } else {
                                    long j21 = 0;
                                    while (j21 < jG09) {
                                        long jG010 = k0Var.g0();
                                        long jG011 = k0Var.g0();
                                        long jG012 = k0Var.g0();
                                        i16 = iI0;
                                        if (jG012 > iE) {
                                            Log.w("PdfBox-Android", "Format 13 cmap contains an invalid glyph index");
                                            i11 = i18;
                                            break;
                                        } else if (jG010 < 0 || jG010 > 1114111 || (jG010 >= 55296 && jG010 <= 57343)) {
                                            break;
                                        } else if ((jG011 > 0 && jG011 < jG010) || jG011 > 1114111 || (jG011 >= 55296 && jG011 <= 57343)) {
                                            break;
                                        } else {
                                            long j22 = 0;
                                            while (j22 <= jG011 - jG010) {
                                                long j23 = j22;
                                                long j24 = jG010 + j23;
                                                if (j24 > 2147483647L) {
                                                    throw new IOException("Character Code greater than Integer.MAX_VALUE");
                                                }
                                                if (j24 > 1114111) {
                                                    Log.w("PdfBox-Android", "Format 13 cmap contains character beyond UCS-4");
                                                }
                                                int i35 = i18;
                                                int i36 = (int) jG012;
                                                int i37 = (int) j24;
                                                dVar2.f30781d[i36] = i37;
                                                dVar2.f30783f.put(Integer.valueOf(i37), Integer.valueOf(i36));
                                                j22 = j23 + 1;
                                                i18 = i35;
                                            }
                                            j21++;
                                            iI0 = i16;
                                        }
                                    }
                                    i11 = i18;
                                    i10 = iI0;
                                    break;
                                }
                            case 14:
                                Log.w("PdfBox-Android", "Format 14 cmap table is not supported and will be ignored");
                                i10 = iI0;
                                i11 = i18;
                                break;
                            default:
                                throw new IOException(j2.y.a(iI02, "Unknown cmap format:"));
                        }
                    } else {
                        i16 = iI0;
                        i11 = i18;
                        long jG013 = k0Var.g0();
                        long jG014 = k0Var.g0();
                        if (jG014 > 2147483647L) {
                            throw new IOException("Invalid number of Characters");
                        }
                        if (jG013 >= 0 && jG013 <= 1114111) {
                            long j25 = jG013 + jG014;
                            if (j25 > 1114111 || (j25 >= 55296 && j25 <= 57343)) {
                            }
                        }
                    }
                } else {
                    i16 = iI0;
                    i11 = i18;
                    int iI05 = k0Var.i0();
                    int iI06 = k0Var.i0();
                    if (iI06 != 0) {
                        dVar2.f30783f = new HashMap(iE);
                        int[] iArrK0 = k0Var.k0(iI06);
                        int iMax3 = 0;
                        for (int i38 = 0; i38 < iI06; i38++) {
                            iMax3 = Math.max(iMax3, iArrK0[i38]);
                            dVar2.f30783f.put(Integer.valueOf(iI05 + i38), Integer.valueOf(iArrK0[i38]));
                        }
                        dVar2.c(iMax3);
                    }
                }
                i10 = i16;
            } else {
                int i39 = iI0;
                i11 = i18;
                int iI07 = k0Var.i0() / 2;
                k0Var.i0();
                k0Var.i0();
                k0Var.i0();
                int[] iArrK02 = k0Var.k0(iI07);
                k0Var.i0();
                int[] iArrK03 = k0Var.k0(iI07);
                int[] iArrK04 = k0Var.k0(iI07);
                long jH2 = k0Var.h();
                int[] iArrK05 = k0Var.k0(iI07);
                dVar2.f30783f = new HashMap(iE);
                int i40 = 0;
                int iMax4 = 0;
                while (i40 < iI07) {
                    int i41 = iArrK03[i40];
                    int i42 = iI07;
                    int i43 = iArrK02[i40];
                    int i44 = iArrK04[i40];
                    int[] iArr3 = iArrK02;
                    int i45 = iArrK05[i40];
                    int[] iArr4 = iArrK04;
                    int i46 = i39;
                    long j26 = (i40 * 2) + jH2 + i45;
                    if (i41 != 65535 && i43 != 65535) {
                        int i47 = i41;
                        while (i47 <= i43) {
                            if (i45 == 0) {
                                i14 = i43;
                                int i48 = (i47 + i44) & 65535;
                                iMax4 = Math.max(i48, iMax4);
                                i15 = i47;
                                iArr = iArrK03;
                                dVar2.f30783f.put(Integer.valueOf(i15), Integer.valueOf(i48));
                            } else {
                                i14 = i43;
                                i15 = i47;
                                iArr = iArrK03;
                                k0Var.seek(((i15 - i41) * 2) + j26);
                                int iI08 = k0Var.i0();
                                if (iI08 != 0) {
                                    int i49 = (iI08 + i44) & 65535;
                                    int iMax5 = Math.max(i49, iMax4);
                                    dVar2.f30783f.put(Integer.valueOf(i15), Integer.valueOf(i49));
                                    iMax4 = iMax5;
                                }
                            }
                            i47 = i15 + 1;
                            i43 = i14;
                            iArrK03 = iArr;
                        }
                    }
                    i40++;
                    iI07 = i42;
                    iArrK02 = iArr3;
                    i39 = i46;
                    iArrK04 = iArr4;
                    iArrK03 = iArrK03;
                }
                i10 = i39;
                if (dVar2.f30783f.isEmpty()) {
                    Log.w("PdfBox-Android", "cmap format 4 subtable is empty");
                } else {
                    dVar2.c(iMax4);
                }
            }
            i18 = i11 + 1;
            iI0 = i10;
        }
        throw new IOException("CMap contains an invalid glyph index");
    }

    public final d b(int i10, int i11) {
        for (d dVar : this.f30789f) {
            if (dVar.f30778a == i10 && dVar.f30779b == i11) {
                return dVar;
            }
        }
        return null;
    }
}
