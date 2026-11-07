package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.camera.core.impl.ImageFormatConstants;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l7 implements a7 {
    public final Paint s;

    /* renamed from: t, reason: collision with root package name */
    public final Paint f6589t;

    /* renamed from: u, reason: collision with root package name */
    public final Canvas f6590u;

    /* renamed from: v, reason: collision with root package name */
    public final f7 f6591v;

    /* renamed from: w, reason: collision with root package name */
    public final e7 f6592w;

    /* renamed from: x, reason: collision with root package name */
    public final k7 f6593x;

    /* renamed from: y, reason: collision with root package name */
    public Bitmap f6594y;

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f6588z = {0, 7, 8, 15};
    public static final byte[] A = {0, 119, -120, -1};
    public static final byte[] B = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    public l7(List list) {
        ex0 ex0Var = new ex0((byte[]) list.get(0));
        int iZ = ex0Var.z();
        int iZ2 = ex0Var.z();
        Paint paint = new Paint();
        this.s = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f6589t = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f6590u = new Canvas();
        this.f6591v = new f7(719, 575, 0, 719, 0, 575);
        this.f6592w = new e7(0, new int[]{0, -1, -16777216, -8421505}, g(), h());
        this.f6593x = new k7(iZ, iZ2);
    }

    public static int a(int i6, int i7, int i8, int i9) {
        return (i6 << 24) | (i7 << 16) | (i8 << 8) | i9;
    }

    public static e7 c(l42 l42Var, int i6) {
        int iW;
        int iW2;
        int iW3;
        int iW4;
        int i7 = 8;
        int iW5 = l42Var.w(8);
        l42Var.D(8);
        int i8 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] iArrG = g();
        int[] iArrH = h();
        int i9 = i6 - 2;
        while (i9 > 0) {
            int iW6 = l42Var.w(i7);
            int iW7 = l42Var.w(i7);
            int[] iArr2 = (iW7 & 128) != 0 ? iArr : (iW7 & 64) != 0 ? iArrG : iArrH;
            if ((iW7 & 1) != 0) {
                iW3 = l42Var.w(i7);
                iW4 = l42Var.w(i7);
                iW = l42Var.w(i7);
                iW2 = l42Var.w(i7);
                i9 -= 6;
            } else {
                int iW8 = l42Var.w(6) << 2;
                int iW9 = l42Var.w(4) << 4;
                i9 -= 4;
                iW = l42Var.w(4) << 4;
                iW2 = l42Var.w(2) << 6;
                iW3 = iW8;
                iW4 = iW9;
            }
            if (iW3 == 0) {
                iW2 = 255;
            }
            if (iW3 == 0) {
                iW = i8;
            }
            if (iW3 == 0) {
                iW4 = i8;
            }
            double d7 = iW3;
            double d8 = iW4 - 128;
            double d9 = iW - 128;
            iArr2[iW6] = a((byte) (255 - (iW2 & 255)), Math.max(0, Math.min((int) ((1.402d * d8) + d7), 255)), Math.max(0, Math.min((int) ((d7 - (0.34414d * d9)) - (d8 * 0.71414d)), 255)), Math.max(0, Math.min((int) ((d9 * 1.772d) + d7), 255)));
            i8 = 0;
            iW5 = iW5;
            iArrH = iArrH;
            i7 = 8;
        }
        return new e7(iW5, iArr, iArrG, iArrH);
    }

    public static g7 d(l42 l42Var) {
        byte[] bArr;
        int iW = l42Var.w(16);
        l42Var.D(4);
        int iW2 = l42Var.w(2);
        boolean zG = l42Var.G();
        l42Var.D(1);
        byte[] bArr2 = j31.f5919f;
        if (iW2 != 1) {
            if (iW2 == 0) {
                int iW3 = l42Var.w(16);
                int iW4 = l42Var.w(16);
                if (iW3 > 0) {
                    bArr2 = new byte[iW3];
                    y5.r(l42Var.f6574b == 0);
                    System.arraycopy((byte[]) l42Var.f6576d, l42Var.f6573a, bArr2, 0, iW3);
                    l42Var.f6573a += iW3;
                    l42Var.H();
                }
                if (iW4 > 0) {
                    bArr = new byte[iW4];
                    y5.r(l42Var.f6574b == 0);
                    System.arraycopy((byte[]) l42Var.f6576d, l42Var.f6573a, bArr, 0, iW4);
                    l42Var.f6573a += iW4;
                    l42Var.H();
                }
            }
            return new g7(iW, zG, bArr2, bArr);
        }
        l42Var.D(l42Var.w(8) * 16);
        bArr = bArr2;
        return new g7(iW, zG, bArr2, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0201 A[LOOP:3: B:89:0x0163->B:122:0x0201, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(byte[] bArr, int[] iArr, int i6, int i7, int i8, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        int i9;
        int iW;
        char c7;
        int i10;
        int iW2;
        int iW3;
        int iW4;
        int i11;
        int i12;
        boolean z6;
        int iW5;
        int iW6;
        int i13;
        int i14;
        int i15;
        int iW7;
        int i16;
        Paint paint2 = paint;
        l42 l42Var = new l42(bArr.length, bArr);
        int i17 = i7;
        int i18 = i8;
        byte[] bArrF = null;
        byte[] bArrF2 = null;
        byte[] bArrF3 = null;
        while (l42Var.t() != 0) {
            int iW8 = l42Var.w(8);
            if (iW8 != 240) {
                int i19 = 4;
                int i20 = 1;
                int i21 = 2;
                switch (iW8) {
                    case 16:
                        int i22 = 1;
                        if (i6 != 3) {
                            if (i6 != 2) {
                                bArr2 = null;
                            } else if (bArrF3 == null) {
                                bArr3 = f6588z;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArrF3;
                            }
                            i9 = 0;
                            while (true) {
                                iW = l42Var.w(2);
                                if (iW != 0) {
                                }
                                i10 = i9;
                                c7 = 4;
                                if (iW3 == 0) {
                                }
                                paint2 = paint;
                                i9 = i10;
                                i22 = 1;
                            }
                        } else if (bArrF == null) {
                            bArr3 = A;
                            bArr2 = bArr3;
                            i9 = 0;
                            while (true) {
                                iW = l42Var.w(2);
                                if (iW != 0) {
                                    iW3 = i22;
                                    iW2 = iW;
                                } else {
                                    if (l42Var.G()) {
                                        iW4 = l42Var.w(3) + 3;
                                        iW2 = l42Var.w(2);
                                    } else {
                                        if (l42Var.G()) {
                                            iW3 = i22;
                                            i10 = i9;
                                            iW2 = 0;
                                        } else {
                                            int iW9 = l42Var.w(2);
                                            if (iW9 == 0) {
                                                c7 = 4;
                                                i10 = i22;
                                                iW2 = 0;
                                                iW3 = 0;
                                            } else if (iW9 == i22) {
                                                c7 = 4;
                                                i10 = i9;
                                                iW3 = 2;
                                                iW2 = 0;
                                            } else if (iW9 == 2) {
                                                c7 = 4;
                                                i10 = i9;
                                                iW3 = l42Var.w(4) + 12;
                                                iW2 = l42Var.w(2);
                                            } else if (iW9 != 3) {
                                                i10 = i9;
                                                iW2 = 0;
                                                iW3 = 0;
                                            } else {
                                                iW4 = l42Var.w(8) + 29;
                                                iW2 = l42Var.w(2);
                                            }
                                            if (iW3 == 0 || paint2 == null) {
                                                i11 = i17;
                                            } else {
                                                int i23 = i18 + 1;
                                                float f6 = i18;
                                                if (bArr2 != 0) {
                                                    iW2 = bArr2[iW2];
                                                }
                                                paint2.setColor(iArr[iW2]);
                                                i11 = i17;
                                                canvas.drawRect(i17, f6, i17 + iW3, i23, paint2);
                                            }
                                            i17 = i11 + iW3;
                                            if (i10 == 0) {
                                                l42Var.y();
                                                break;
                                            } else {
                                                paint2 = paint;
                                                i9 = i10;
                                                i22 = 1;
                                            }
                                        }
                                        c7 = 4;
                                        if (iW3 == 0) {
                                            i11 = i17;
                                            i17 = i11 + iW3;
                                            if (i10 == 0) {
                                            }
                                        }
                                    }
                                    iW3 = iW4;
                                }
                                i10 = i9;
                                c7 = 4;
                                if (iW3 == 0) {
                                }
                            }
                        } else {
                            bArr2 = bArrF;
                            i9 = 0;
                            while (true) {
                                iW = l42Var.w(2);
                                if (iW != 0) {
                                }
                                i10 = i9;
                                c7 = 4;
                                if (iW3 == 0) {
                                }
                                paint2 = paint;
                                i9 = i10;
                                i22 = 1;
                            }
                        }
                    case 17:
                        byte[] bArr4 = i6 == 3 ? bArrF2 == null ? B : bArrF2 : null;
                        boolean z7 = false;
                        while (true) {
                            int iW10 = l42Var.w(i19);
                            if (iW10 != 0) {
                                i12 = 1;
                                z6 = z7;
                            } else if (l42Var.G()) {
                                if (l42Var.G()) {
                                    int iW11 = l42Var.w(i21);
                                    if (iW11 == 0) {
                                        i12 = 1;
                                        z6 = z7;
                                        iW10 = 0;
                                    } else if (iW11 == 1) {
                                        z6 = z7;
                                        i12 = i21;
                                        iW10 = 0;
                                    } else if (iW11 == i21) {
                                        iW5 = l42Var.w(i19) + 9;
                                        iW6 = l42Var.w(i19);
                                    } else if (iW11 != 3) {
                                        z6 = z7;
                                        iW10 = 0;
                                        i12 = 0;
                                    } else {
                                        iW5 = l42Var.w(8) + 25;
                                        iW6 = l42Var.w(i19);
                                    }
                                } else {
                                    iW5 = l42Var.w(i21) + i19;
                                    iW6 = l42Var.w(i19);
                                }
                                i12 = iW5;
                                z6 = z7;
                                iW10 = iW6;
                            } else {
                                int iW12 = l42Var.w(3);
                                if (iW12 != 0) {
                                    i12 = iW12 + 2;
                                    z6 = z7;
                                    iW10 = 0;
                                } else {
                                    z6 = true;
                                    iW10 = 0;
                                    i12 = 0;
                                }
                            }
                            if (i12 == 0 || paint2 == null) {
                                i13 = i17;
                                i14 = i21;
                            } else {
                                int i24 = i18 + 1;
                                float f7 = i18;
                                if (bArr4 != 0) {
                                    iW10 = bArr4[iW10];
                                }
                                paint2.setColor(iArr[iW10]);
                                i13 = i17;
                                i14 = 2;
                                canvas.drawRect(i17, f7, i17 + i12, i24, paint2);
                            }
                            i17 = i13 + i12;
                            if (z6) {
                                l42Var.y();
                                continue;
                            } else {
                                i21 = i14;
                                z7 = z6;
                                i19 = 4;
                            }
                        }
                    case 18:
                        int i25 = i17;
                        int i26 = 0;
                        while (true) {
                            int iW13 = l42Var.w(8);
                            if (iW13 != 0) {
                                i15 = i26;
                                iW7 = i20;
                            } else if (l42Var.G()) {
                                i15 = i26;
                                iW7 = l42Var.w(7);
                                iW13 = l42Var.w(8);
                            } else {
                                int iW14 = l42Var.w(7);
                                if (iW14 != 0) {
                                    i15 = i26;
                                    iW7 = iW14;
                                    iW13 = 0;
                                } else {
                                    i15 = i20;
                                    iW13 = 0;
                                    iW7 = 0;
                                }
                            }
                            if (iW7 == 0 || paint2 == null) {
                                i16 = i20;
                            } else {
                                paint2.setColor(iArr[iW13]);
                                i16 = i20;
                                canvas.drawRect(i25, i18, i25 + iW7, i18 + 1, paint2);
                            }
                            i25 += iW7;
                            if (i15 == 0) {
                                i20 = i16;
                                i26 = i15;
                            } else {
                                i17 = i25;
                                continue;
                            }
                        }
                    default:
                        switch (iW8) {
                            case 32:
                                bArrF3 = f(4, 4, l42Var);
                                break;
                            case ImageFormatConstants.INTERNAL_DEFINED_IMAGE_FORMAT_JPEG /* 33 */:
                                bArrF = f(4, 8, l42Var);
                                break;
                            case ImageFormatConstants.INTERNAL_DEFINED_IMAGE_FORMAT_PRIVATE /* 34 */:
                                bArrF2 = f(16, 8, l42Var);
                                break;
                            default:
                                continue;
                        }
                }
            } else {
                i18 += 2;
                i17 = i7;
            }
            paint2 = paint;
        }
    }

    public static byte[] f(int i6, int i7, l42 l42Var) {
        byte[] bArr = new byte[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            bArr[i8] = (byte) l42Var.w(i7);
        }
        return bArr;
    }

    public static int[] g() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i6 = 1; i6 < 16; i6++) {
            int i7 = i6 & 4;
            int i8 = i6 & 2;
            int i9 = i6 & 1;
            if (i6 < 8) {
                iArr[i6] = a(255, 1 != i9 ? 0 : 255, i8 != 0 ? 255 : 0, i7 != 0 ? 255 : 0);
            } else {
                iArr[i6] = a(255, 1 != i9 ? 0 : 127, i8 != 0 ? 127 : 0, i7 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] h() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i6 = 0; i6 < 256; i6++) {
            if (i6 < 8) {
                iArr[i6] = a(63, 1 != (i6 & 1) ? 0 : 255, (i6 & 2) != 0 ? 255 : 0, (i6 & 4) == 0 ? 0 : 255);
            } else {
                int i7 = i6 & 136;
                if (i7 == 0) {
                    iArr[i6] = a(255, (1 != (i6 & 1) ? 0 : 85) + ((i6 & 16) != 0 ? 170 : 0), ((i6 & 2) != 0 ? 85 : 0) + ((i6 & 32) != 0 ? 170 : 0), ((i6 & 4) == 0 ? 0 : 85) + ((i6 & 64) == 0 ? 0 : 170));
                } else if (i7 == 8) {
                    iArr[i6] = a(127, (1 != (i6 & 1) ? 0 : 85) + ((i6 & 16) != 0 ? 170 : 0), ((i6 & 2) != 0 ? 85 : 0) + ((i6 & 32) != 0 ? 170 : 0), ((i6 & 4) == 0 ? 0 : 85) + ((i6 & 64) == 0 ? 0 : 170));
                } else if (i7 == 128) {
                    iArr[i6] = a(255, (1 != (i6 & 1) ? 0 : 43) + 127 + ((i6 & 16) != 0 ? 85 : 0), ((i6 & 2) != 0 ? 43 : 0) + 127 + ((i6 & 32) != 0 ? 85 : 0), ((i6 & 4) == 0 ? 0 : 43) + 127 + ((i6 & 64) == 0 ? 0 : 85));
                } else if (i7 == 136) {
                    iArr[i6] = a(255, (1 != (i6 & 1) ? 0 : 43) + ((i6 & 16) != 0 ? 85 : 0), ((i6 & 2) != 0 ? 43 : 0) + ((i6 & 32) != 0 ? 85 : 0), ((i6 & 4) == 0 ? 0 : 43) + ((i6 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    @Override // com.google.android.gms.internal.ads.a7
    public final void b(byte[] bArr, int i6, int i7, c7 c7Var) {
        k7 k7Var;
        boolean z6;
        v6 v6Var;
        char c7;
        char c8;
        char c9;
        int i8;
        int i9;
        int i10;
        f7 f7Var;
        ArrayList arrayList;
        k7 k7Var2;
        i7 i7Var;
        int i11;
        int i12;
        int i13;
        int i14;
        i7 i7Var2;
        int iW;
        int iW2;
        int i15;
        int iW3;
        l42 l42Var = new l42(i6 + i7, bArr);
        l42Var.B(i6);
        while (true) {
            int iT = l42Var.t();
            k7Var = this.f6593x;
            z6 = true;
            if (iT >= 48 && l42Var.w(8) == 15) {
                int iW4 = l42Var.w(8);
                int iW5 = l42Var.w(16);
                int iW6 = l42Var.w(16);
                int iU = l42Var.u() + iW6;
                if (iW6 * 8 > l42Var.t()) {
                    qs0.f("DvbParser", "Data field length exceeds limit");
                    l42Var.D(l42Var.t());
                } else {
                    switch (iW4) {
                        case 16:
                            if (iW5 == k7Var.f6268a) {
                                v0 v0Var = k7Var.f6275i;
                                l42Var.w(8);
                                int iW7 = l42Var.w(4);
                                int iW8 = l42Var.w(2);
                                l42Var.D(2);
                                SparseArray sparseArray = new SparseArray();
                                for (int i16 = iW6 - 2; i16 > 0; i16 -= 6) {
                                    int iW9 = l42Var.w(8);
                                    l42Var.D(8);
                                    sparseArray.put(iW9, new h7(l42Var.w(16), l42Var.w(16)));
                                }
                                v0 v0Var2 = new v0(iW7, iW8, sparseArray);
                                if (iW8 != 0) {
                                    k7Var.f6275i = v0Var2;
                                    k7Var.f6270c.clear();
                                    k7Var.f6271d.clear();
                                    k7Var.f6272e.clear();
                                    break;
                                } else if (v0Var != null && v0Var.f9677a != iW7) {
                                    k7Var.f6275i = v0Var2;
                                    break;
                                }
                            }
                            break;
                        case 17:
                            v0 v0Var3 = k7Var.f6275i;
                            SparseArray sparseArray2 = k7Var.f6270c;
                            if (iW5 == k7Var.f6268a && v0Var3 != null) {
                                int iW10 = l42Var.w(8);
                                l42Var.D(4);
                                boolean zG = l42Var.G();
                                l42Var.D(3);
                                int iW11 = l42Var.w(16);
                                int iW12 = l42Var.w(16);
                                l42Var.w(3);
                                int iW13 = l42Var.w(3);
                                l42Var.D(2);
                                int iW14 = l42Var.w(8);
                                int iW15 = l42Var.w(8);
                                int iW16 = l42Var.w(4);
                                int iW17 = l42Var.w(2);
                                l42Var.D(2);
                                int i17 = iW6 - 10;
                                SparseArray sparseArray3 = new SparseArray();
                                while (i17 > 0) {
                                    int iW18 = l42Var.w(16);
                                    int iW19 = l42Var.w(2);
                                    l42Var.w(2);
                                    int iW20 = l42Var.w(12);
                                    l42Var.D(4);
                                    int iW21 = l42Var.w(12);
                                    int i18 = i17 - 6;
                                    if (iW19 == 1 || iW19 == 2) {
                                        l42Var.w(8);
                                        l42Var.w(8);
                                        i17 -= 8;
                                    } else {
                                        i17 = i18;
                                    }
                                    sparseArray3.put(iW18, new j7(iW20, iW21));
                                }
                                i7 i7Var3 = new i7(iW10, zG, iW11, iW12, iW13, iW14, iW15, iW16, iW17, sparseArray3);
                                if (v0Var3.f9678b == 0 && (i7Var2 = (i7) sparseArray2.get(iW10)) != null) {
                                    int i19 = 0;
                                    while (true) {
                                        SparseArray sparseArray4 = i7Var2.f5585j;
                                        if (i19 < sparseArray4.size()) {
                                            i7Var3.f5585j.put(sparseArray4.keyAt(i19), (j7) sparseArray4.valueAt(i19));
                                            i19++;
                                        }
                                    }
                                }
                                sparseArray2.put(i7Var3.f5577a, i7Var3);
                                break;
                            }
                            break;
                        case 18:
                            if (iW5 == k7Var.f6268a) {
                                e7 e7VarC = c(l42Var, iW6);
                                k7Var.f6271d.put(e7VarC.f4136a, e7VarC);
                                break;
                            } else if (iW5 == k7Var.f6269b) {
                                e7 e7VarC2 = c(l42Var, iW6);
                                k7Var.f6273f.put(e7VarC2.f4136a, e7VarC2);
                                break;
                            }
                            break;
                        case 19:
                            if (iW5 == k7Var.f6268a) {
                                g7 g7VarD = d(l42Var);
                                k7Var.f6272e.put(g7VarD.f4917a, g7VarD);
                                break;
                            } else if (iW5 == k7Var.f6269b) {
                                g7 g7VarD2 = d(l42Var);
                                k7Var.f6274g.put(g7VarD2.f4917a, g7VarD2);
                                break;
                            }
                            break;
                        case 20:
                            if (iW5 == k7Var.f6268a) {
                                l42Var.D(4);
                                boolean zG2 = l42Var.G();
                                l42Var.D(3);
                                int iW22 = l42Var.w(16);
                                int iW23 = l42Var.w(16);
                                if (zG2) {
                                    int iW24 = l42Var.w(16);
                                    iW = l42Var.w(16);
                                    iW3 = l42Var.w(16);
                                    iW2 = l42Var.w(16);
                                    i15 = iW24;
                                } else {
                                    iW = iW22;
                                    iW2 = iW23;
                                    i15 = 0;
                                    iW3 = 0;
                                }
                                k7Var.h = new f7(iW22, iW23, i15, iW, iW3, iW2);
                                break;
                            }
                            break;
                    }
                    l42Var.E(iU - l42Var.u());
                }
            }
        }
        v0 v0Var4 = k7Var.f6275i;
        if (v0Var4 == null) {
            zn1 zn1Var = bo1.f3236t;
            v6Var = new v6(cp1.f3636w, -9223372036854775807L, -9223372036854775807L);
        } else {
            f7 f7Var2 = k7Var.h;
            if (f7Var2 == null) {
                f7Var2 = this.f6591v;
            }
            Bitmap bitmap = this.f6594y;
            Canvas canvas = this.f6590u;
            if (bitmap == null || f7Var2.f4509a + 1 != bitmap.getWidth() || f7Var2.f4510b + 1 != this.f6594y.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(f7Var2.f4509a + 1, f7Var2.f4510b + 1, Bitmap.Config.ARGB_8888);
                this.f6594y = bitmapCreateBitmap;
                canvas.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray5 = (SparseArray) v0Var4.f9679c;
            int i20 = 0;
            while (i20 < sparseArray5.size()) {
                canvas.save();
                h7 h7Var = (h7) sparseArray5.valueAt(i20);
                i7 i7Var4 = (i7) k7Var.f6270c.get(sparseArray5.keyAt(i20));
                int i21 = h7Var.f5285a + f7Var2.f4511c;
                int i22 = h7Var.f5286b + f7Var2.f4513e;
                int i23 = i7Var4.f5579c;
                int i24 = i7Var4.f5582f;
                int i25 = i7Var4.f5580d;
                boolean z7 = z6;
                int i26 = i22 + i25;
                canvas.clipRect(i21, i22, Math.min(i21 + i23, f7Var2.f4512d), Math.min(i26, f7Var2.f4514f));
                e7 e7Var = (e7) k7Var.f6271d.get(i24);
                if (e7Var == null && (e7Var = (e7) k7Var.f6273f.get(i24)) == null) {
                    e7Var = this.f6592w;
                }
                SparseArray sparseArray6 = i7Var4.f5585j;
                SparseArray sparseArray7 = sparseArray5;
                int i27 = 0;
                while (i27 < sparseArray6.size()) {
                    int iKeyAt = sparseArray6.keyAt(i27);
                    SparseArray sparseArray8 = sparseArray6;
                    j7 j7Var = (j7) sparseArray6.valueAt(i27);
                    int i28 = i22;
                    g7 g7Var = (g7) k7Var.f6272e.get(iKeyAt);
                    if (g7Var == null) {
                        g7Var = (g7) k7Var.f6274g.get(iKeyAt);
                    }
                    g7 g7Var2 = g7Var;
                    if (g7Var2 != null) {
                        Paint paint = g7Var2.f4918b ? null : this.s;
                        int i29 = i21;
                        int i30 = i7Var4.f5581e;
                        k7Var2 = k7Var;
                        int i31 = i29 + j7Var.f5955a;
                        int i32 = i28 + j7Var.f5956b;
                        int i33 = i25;
                        Paint paint2 = paint;
                        f7Var = f7Var2;
                        i14 = i33;
                        i13 = i27;
                        i11 = i29;
                        arrayList = arrayList2;
                        i12 = i23;
                        i7 i7Var5 = i7Var4;
                        int[] iArr = i30 == 3 ? e7Var.f4139d : i30 == 2 ? e7Var.f4138c : e7Var.f4137b;
                        i7Var = i7Var5;
                        i9 = i20;
                        i10 = i28;
                        e(g7Var2.f4919c, iArr, i30, i31, i32, paint2, canvas);
                        e(g7Var2.f4920d, iArr, i30, i31, i32 + 1, paint2, canvas);
                    } else {
                        i9 = i20;
                        i10 = i28;
                        f7Var = f7Var2;
                        arrayList = arrayList2;
                        k7Var2 = k7Var;
                        i7Var = i7Var4;
                        i11 = i21;
                        i12 = i23;
                        i13 = i27;
                        i14 = i25;
                    }
                    i27 = i13 + 1;
                    i25 = i14;
                    i23 = i12;
                    i7Var4 = i7Var;
                    i21 = i11;
                    i22 = i10;
                    i20 = i9;
                    sparseArray6 = sparseArray8;
                    arrayList2 = arrayList;
                    k7Var = k7Var2;
                    f7Var2 = f7Var;
                }
                f7 f7Var3 = f7Var2;
                ArrayList arrayList3 = arrayList2;
                k7 k7Var3 = k7Var;
                i7 i7Var6 = i7Var4;
                int i34 = i21;
                int i35 = i23;
                int i36 = i25;
                int i37 = i20;
                int i38 = i22;
                float f6 = i38;
                float f7 = i34;
                if (i7Var6.f5578b) {
                    int i39 = i7Var6.f5581e;
                    if (i39 == 3) {
                        i8 = e7Var.f4139d[i7Var6.f5583g];
                        c9 = 2;
                    } else {
                        c9 = 2;
                        i8 = i39 == 2 ? e7Var.f4138c[i7Var6.h] : e7Var.f4137b[i7Var6.f5584i];
                    }
                    Paint paint3 = this.f6589t;
                    paint3.setColor(i8);
                    c8 = 3;
                    c7 = c9;
                    canvas.drawRect(f7, f6, i34 + i35, i26, paint3);
                } else {
                    c7 = 2;
                    c8 = 3;
                }
                mf0 mf0Var = new mf0();
                mf0Var.f7112b = Bitmap.createBitmap(this.f6594y, i34, i38, i35, i36);
                float f8 = f7Var3.f4509a;
                mf0Var.h = f7 / f8;
                mf0Var.f7118i = 0;
                float f9 = f7Var3.f4510b;
                mf0Var.f7115e = f6 / f9;
                mf0Var.f7116f = 0;
                mf0Var.f7117g = 0;
                mf0Var.f7121l = i35 / f8;
                mf0Var.f7122m = i36 / f9;
                arrayList3.add(mf0Var.a());
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i20 = i37 + 1;
                z6 = z7;
                f7Var2 = f7Var3;
                arrayList2 = arrayList3;
                sparseArray5 = sparseArray7;
                k7Var = k7Var3;
            }
            v6Var = new v6(arrayList2, -9223372036854775807L, -9223372036854775807L);
        }
        c7Var.mo6zza(v6Var);
    }
}
