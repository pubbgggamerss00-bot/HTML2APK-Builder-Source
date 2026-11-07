package u2;

import android.graphics.RectF;
import android.text.Layout;
import com.yalantis.ucrop.view.CropImageView;
import java.text.Bidi;
import t2.a;
import u2.t;

/* loaded from: classes.dex */
public final class k0 {
    public static final float a(int i10, int i11, float[] fArr) {
        return fArr[((i10 - i11) * 2) + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0263 A[EDGE_INSN: B:203:0x0263->B:144:0x0263 BREAK  A[LOOP:5: B:154:0x027f->B:206:0x027f], EDGE_INSN: B:204:0x0263->B:144:0x0263 BREAK  A[LOOP:5: B:154:0x027f->B:206:0x027f]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int b(j0 j0Var, Layout layout, t tVar, int i10, RectF rectF, v2.f fVar, a.C0287a c0287a, boolean z10) {
        t.a[] aVarArr;
        int i11;
        t.a[] aVarArr2;
        int i12;
        int iF;
        int i13;
        int i14;
        int iE;
        Bidi bidiCreateLineBidi;
        boolean z11;
        float fA;
        float fA2;
        float fA3;
        int lineTop = layout.getLineTop(i10);
        int lineBottom = layout.getLineBottom(i10);
        int lineStart = layout.getLineStart(i10);
        int lineEnd = layout.getLineEnd(i10);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i15 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i15];
        Layout layout2 = j0Var.f29206f;
        int lineStart2 = layout2.getLineStart(i10);
        int iF2 = j0Var.f(i10);
        if (i15 < (iF2 - lineStart2) * 2) {
            z2.a.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        r rVar = new r(j0Var);
        boolean z12 = false;
        boolean z13 = layout2.getParagraphDirection(i10) == 1;
        int i16 = 0;
        while (lineStart2 < iF2) {
            boolean zIsRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z13 && !zIsRtlCharAt) {
                fA = rVar.a(lineStart2, z12, z12, true);
                fA3 = rVar.a(lineStart2 + 1, true, true, true);
                z11 = z13;
            } else if (z13 && zIsRtlCharAt) {
                z11 = z13;
                fA3 = rVar.a(lineStart2, false, false, false);
                fA = rVar.a(lineStart2 + 1, true, true, false);
            } else {
                z11 = z13;
                if (zIsRtlCharAt) {
                    fA2 = rVar.a(lineStart2, false, false, true);
                    fA = rVar.a(lineStart2 + 1, true, true, true);
                } else {
                    fA = rVar.a(lineStart2, false, false, false);
                    fA2 = rVar.a(lineStart2 + 1, true, true, false);
                }
                fA3 = fA2;
            }
            fArr[i16] = fA;
            fArr[i16 + 1] = fA3;
            i16 += 2;
            lineStart2++;
            z13 = z11;
            z12 = false;
        }
        Layout layout3 = tVar.f29227a;
        int lineStart3 = layout3.getLineStart(i10);
        int lineEnd2 = layout3.getLineEnd(i10);
        int iD = tVar.d(lineStart3, false);
        int iE2 = tVar.e(iD);
        int i17 = lineStart3 - iE2;
        int i18 = lineEnd2 - iE2;
        Bidi bidiA = tVar.a(iD);
        if (bidiA == null || (bidiCreateLineBidi = bidiA.createLineBidi(i17, i18)) == null) {
            aVarArr = new t.a[]{new t.a(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = bidiCreateLineBidi.getRunCount();
            aVarArr = new t.a[runCount];
            int i19 = 0;
            while (i19 < runCount) {
                int i20 = runCount;
                aVarArr[i19] = new t.a(bidiCreateLineBidi.getRunStart(i19) + lineStart3, bidiCreateLineBidi.getRunLimit(i19) + lineStart3, bidiCreateLineBidi.getRunLevel(i19) % 2 == 1);
                i19++;
                runCount = i20;
            }
        }
        jh.e gVar = z10 ? new jh.g(0, aVarArr.length - 1, 1) : new jh.e(aVarArr.length - 1, 0, -1);
        int i21 = gVar.f15744a;
        int i22 = gVar.f15745b;
        int i23 = gVar.f15746c;
        if ((i23 <= 0 || i21 > i22) && (i23 >= 0 || i22 > i21)) {
            return -1;
        }
        while (true) {
            t.a aVar = aVarArr[i21];
            boolean z14 = aVar.f29234c;
            int iW = aVar.f29232a;
            int iX = aVar.f29233b;
            float f10 = z14 ? fArr[((iX - 1) - lineStart) * 2] : fArr[(iW - lineStart) * 2];
            float fA4 = z14 ? a(iW, lineStart, fArr) : a(iX - 1, lineStart, fArr);
            if (z10) {
                float f11 = rectF.left;
                if (fA4 >= f11) {
                    i11 = i23;
                    float f12 = rectF.right;
                    if (f10 <= f12) {
                        if ((z14 || f11 > f10) && (!z14 || f12 < fA4)) {
                            int i24 = iX;
                            int i25 = iW;
                            while (true) {
                                i13 = i24;
                                if (i24 - i25 <= 1) {
                                    break;
                                }
                                int i26 = (i13 + i25) / 2;
                                float f13 = fArr[(i26 - lineStart) * 2];
                                if ((z14 || f13 <= rectF.left) && (!z14 || f13 >= rectF.right)) {
                                    i24 = i13;
                                    i25 = i26;
                                } else {
                                    i24 = i26;
                                }
                            }
                            i14 = z14 ? i13 : i25;
                        } else {
                            i14 = iW;
                        }
                        int iF3 = fVar.F(i14);
                        if (iF3 != -1 && (iE = fVar.E(iF3)) < iX) {
                            if (iE >= iW) {
                                iW = iE;
                            }
                            if (iF3 > iX) {
                                iF3 = iX;
                            }
                            aVarArr2 = aVarArr;
                            RectF rectF2 = new RectF(CropImageView.DEFAULT_ASPECT_RATIO, lineTop, CropImageView.DEFAULT_ASPECT_RATIO, lineBottom);
                            int iF4 = iF3;
                            while (true) {
                                rectF2.left = z14 ? fArr[((iF4 - 1) - lineStart) * 2] : fArr[(iW - lineStart) * 2];
                                rectF2.right = z14 ? a(iW, lineStart, fArr) : a(iF4 - 1, lineStart, fArr);
                                if (((Boolean) c0287a.invoke(rectF2, rectF)).booleanValue()) {
                                    break;
                                }
                                iW = fVar.w(iW);
                                if (iW == -1 || iW >= iX) {
                                    break;
                                }
                                iF4 = fVar.F(iW);
                                if (iF4 > iX) {
                                    iF4 = iX;
                                }
                            }
                        }
                        iW = -1;
                    }
                } else {
                    i11 = i23;
                }
                aVarArr2 = aVarArr;
                iW = -1;
            } else {
                i11 = i23;
                aVarArr2 = aVarArr;
                float f14 = rectF.left;
                if (fA4 >= f14) {
                    float f15 = rectF.right;
                    if (f10 > f15) {
                        iX = -1;
                        iW = iX;
                    } else {
                        if ((z14 || f15 < fA4) && (!z14 || f14 > f10)) {
                            int i27 = iX;
                            int i28 = iW;
                            while (i27 - i28 > 1) {
                                int i29 = (i27 + i28) / 2;
                                float f16 = fArr[(i29 - lineStart) * 2];
                                int i30 = i27;
                                if ((z14 || f16 <= rectF.right) && (!z14 || f16 >= rectF.left)) {
                                    i27 = i30;
                                    i28 = i29;
                                } else {
                                    i27 = i29;
                                }
                            }
                            i12 = z14 ? i27 : i28;
                        } else {
                            i12 = iX - 1;
                        }
                        int iE3 = fVar.E(i12 + 1);
                        if (iE3 != -1 && (iF = fVar.F(iE3)) > iW) {
                            if (iE3 < iW) {
                                iE3 = iW;
                            }
                            if (iF <= iX) {
                                iX = iF;
                            }
                            RectF rectF3 = new RectF(CropImageView.DEFAULT_ASPECT_RATIO, lineTop, CropImageView.DEFAULT_ASPECT_RATIO, lineBottom);
                            int iE4 = iE3;
                            while (true) {
                                rectF3.left = z14 ? fArr[((iX - 1) - lineStart) * 2] : fArr[(iE4 - lineStart) * 2];
                                rectF3.right = z14 ? a(iE4, lineStart, fArr) : a(iX - 1, lineStart, fArr);
                                if (((Boolean) c0287a.invoke(rectF3, rectF)).booleanValue()) {
                                    break;
                                }
                                iX = fVar.x(iX);
                                if (iX == -1 || iX <= iW) {
                                    break;
                                }
                                iE4 = fVar.E(iX);
                                if (iE4 < iW) {
                                    iE4 = iW;
                                }
                            }
                            iX = -1;
                            iW = iX;
                        }
                    }
                }
            }
            if (iW >= 0) {
                return iW;
            }
            if (i21 == i22) {
                return -1;
            }
            i21 += i11;
            i23 = i11;
            aVarArr = aVarArr2;
        }
    }
}
