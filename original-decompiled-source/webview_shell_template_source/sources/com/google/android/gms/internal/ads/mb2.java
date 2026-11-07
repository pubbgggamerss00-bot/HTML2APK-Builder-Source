package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class mb2 {
    public static final mb2 h;

    /* renamed from: a, reason: collision with root package name */
    public final int f7075a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7076b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7077c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f7078d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7079e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7080f;

    /* renamed from: g, reason: collision with root package name */
    public int f7081g;

    static {
        int i6 = -1;
        h = new mb2(1, 2, 3, i6, i6, null);
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ mb2(int i6, int i7, int i8, int i9, int i10, byte[] bArr) {
        this.f7075a = i6;
        this.f7076b = i7;
        this.f7077c = i8;
        this.f7078d = bArr;
        this.f7079e = i9;
        this.f7080f = i10;
    }

    public static int a(int i6) {
        if (i6 == 1) {
            return 1;
        }
        if (i6 != 9) {
            return (i6 == 4 || i6 == 5 || i6 == 6 || i6 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int b(int i6) {
        if (i6 == 1) {
            return 3;
        }
        if (i6 == 4) {
            return 10;
        }
        if (i6 == 13) {
            return 2;
        }
        if (i6 == 16) {
            return 6;
        }
        if (i6 != 18) {
            return (i6 == 6 || i6 == 7) ? 3 : -1;
        }
        return 7;
    }

    public static boolean e(mb2 mb2Var) {
        if (mb2Var == null) {
            return true;
        }
        int i6 = mb2Var.f7075a;
        if (i6 != -1 && i6 != 1 && i6 != 2) {
            return false;
        }
        int i7 = mb2Var.f7076b;
        if (i7 != -1 && i7 != 2) {
            return false;
        }
        int i8 = mb2Var.f7077c;
        if ((i8 != -1 && i8 != 3) || mb2Var.f7078d != null) {
            return false;
        }
        int i9 = mb2Var.f7080f;
        if (i9 != -1 && i9 != 8) {
            return false;
        }
        int i10 = mb2Var.f7079e;
        return i10 == -1 || i10 == 8;
    }

    public static String f(int i6) {
        return i6 != -1 ? i6 != 1 ? i6 != 2 ? androidx.camera.camera2.internal.compat.workaround.c.d(i6, "Undefined color range ") : "Limited range" : "Full range" : "Unset color range";
    }

    public static String g(int i6) {
        return i6 != -1 ? i6 != 6 ? i6 != 1 ? i6 != 2 ? androidx.camera.camera2.internal.compat.workaround.c.d(i6, "Undefined color space ") : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static String h(int i6) {
        return i6 != -1 ? i6 != 10 ? i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 6 ? i6 != 7 ? androidx.camera.camera2.internal.compat.workaround.c.d(i6, "Undefined color transfer ") : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public final String c() {
        String str;
        String str2;
        int i6;
        if (d()) {
            String strG = g(this.f7075a);
            String strF = f(this.f7076b);
            String strH = h(this.f7077c);
            Locale locale = Locale.US;
            str = strG + "/" + strF + "/" + strH;
        } else {
            str = "NA/NA/NA";
        }
        int i7 = this.f7079e;
        if (i7 == -1 || (i6 = this.f7080f) == -1) {
            str2 = "NA/NA";
        } else {
            str2 = i7 + "/" + i6;
        }
        return androidx.activity.m.d(str, "/", str2);
    }

    public final boolean d() {
        return (this.f7075a == -1 || this.f7076b == -1 || this.f7077c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mb2.class == obj.getClass()) {
            mb2 mb2Var = (mb2) obj;
            if (this.f7075a == mb2Var.f7075a && this.f7076b == mb2Var.f7076b && this.f7077c == mb2Var.f7077c && Arrays.equals(this.f7078d, mb2Var.f7078d) && this.f7079e == mb2Var.f7079e && this.f7080f == mb2Var.f7080f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6 = this.f7081g;
        if (i6 != 0) {
            return i6;
        }
        int iHashCode = ((((Arrays.hashCode(this.f7078d) + ((((((this.f7075a + 527) * 31) + this.f7076b) * 31) + this.f7077c) * 31)) * 31) + this.f7079e) * 31) + this.f7080f;
        this.f7081g = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String str;
        String strG = g(this.f7075a);
        String strF = f(this.f7076b);
        String strH = h(this.f7077c);
        String str2 = "NA";
        int i6 = this.f7079e;
        if (i6 != -1) {
            str = i6 + "bit Luma";
        } else {
            str = "NA";
        }
        int i7 = this.f7080f;
        if (i7 != -1) {
            str2 = i7 + "bit Chroma";
        }
        boolean z6 = this.f7078d != null;
        StringBuilder sbA = androidx.camera.camera2.internal.i0.a("ColorInfo(", strG, ", ", strF, ", ");
        sbA.append(strH);
        sbA.append(", ");
        sbA.append(z6);
        sbA.append(", ");
        sbA.append(str);
        sbA.append(", ");
        sbA.append(str2);
        sbA.append(")");
        return sbA.toString();
    }
}
