package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.MissingResourceException;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class w {
    public static final /* synthetic */ int K = 0;
    public final mb2 A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public int J;

    /* renamed from: a, reason: collision with root package name */
    public final String f9967a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9968b;

    /* renamed from: c, reason: collision with root package name */
    public final bo1 f9969c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9970d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9971e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9972f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9973g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final int f9974i;

    /* renamed from: j, reason: collision with root package name */
    public final String f9975j;

    /* renamed from: k, reason: collision with root package name */
    public final qh f9976k;

    /* renamed from: l, reason: collision with root package name */
    public final String f9977l;

    /* renamed from: m, reason: collision with root package name */
    public final String f9978m;

    /* renamed from: n, reason: collision with root package name */
    public final int f9979n;

    /* renamed from: o, reason: collision with root package name */
    public final int f9980o;

    /* renamed from: p, reason: collision with root package name */
    public final List f9981p;

    /* renamed from: q, reason: collision with root package name */
    public final ih2 f9982q;

    /* renamed from: r, reason: collision with root package name */
    public final long f9983r;
    public final boolean s;

    /* renamed from: t, reason: collision with root package name */
    public final int f9984t;

    /* renamed from: u, reason: collision with root package name */
    public final int f9985u;

    /* renamed from: v, reason: collision with root package name */
    public final float f9986v;

    /* renamed from: w, reason: collision with root package name */
    public final int f9987w;

    /* renamed from: x, reason: collision with root package name */
    public final float f9988x;

    /* renamed from: y, reason: collision with root package name */
    public final byte[] f9989y;

    /* renamed from: z, reason: collision with root package name */
    public final int f9990z;

    static {
        new w(new tk2());
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
    }

    public w(tk2 tk2Var) throws MissingResourceException {
        boolean z6;
        String str;
        this.f9967a = tk2Var.f9320a;
        String strA = j31.a(tk2Var.f9323d);
        this.f9970d = strA;
        if (tk2Var.f9322c.isEmpty() && tk2Var.f9321b != null) {
            this.f9969c = bo1.n(new e1(strA, tk2Var.f9321b));
            this.f9968b = tk2Var.f9321b;
        } else if (!tk2Var.f9322c.isEmpty() && tk2Var.f9321b == null) {
            bo1 bo1Var = tk2Var.f9322c;
            this.f9969c = bo1Var;
            Iterator it = bo1Var.iterator();
            while (true) {
                zn1 zn1Var = (zn1) it;
                if (!zn1Var.hasNext()) {
                    str = ((e1) bo1Var.get(0)).f4074b;
                    break;
                }
                e1 e1Var = (e1) zn1Var.next();
                if (TextUtils.equals(e1Var.f4073a, strA)) {
                    str = e1Var.f4074b;
                    break;
                }
            }
            this.f9968b = str;
        } else if (tk2Var.f9322c.isEmpty() && tk2Var.f9321b == null) {
            z6 = true;
            y5.r(z6);
            this.f9969c = tk2Var.f9322c;
            this.f9968b = tk2Var.f9321b;
        } else {
            for (int i6 = 0; i6 < tk2Var.f9322c.size(); i6++) {
                if (((e1) tk2Var.f9322c.get(i6)).f4074b.equals(tk2Var.f9321b)) {
                    z6 = true;
                    break;
                }
            }
            z6 = false;
            y5.r(z6);
            this.f9969c = tk2Var.f9322c;
            this.f9968b = tk2Var.f9321b;
        }
        this.f9971e = tk2Var.f9324e;
        this.f9972f = tk2Var.f9325f;
        int i7 = tk2Var.f9326g;
        this.f9973g = i7;
        int i8 = tk2Var.h;
        this.h = i8;
        this.f9974i = i8 != -1 ? i8 : i7;
        this.f9975j = tk2Var.f9327i;
        this.f9976k = tk2Var.f9328j;
        this.f9977l = tk2Var.f9329k;
        this.f9978m = tk2Var.f9330l;
        this.f9979n = tk2Var.f9331m;
        this.f9980o = tk2Var.f9332n;
        List list = tk2Var.f9333o;
        this.f9981p = list == null ? Collections.EMPTY_LIST : list;
        ih2 ih2Var = tk2Var.f9334p;
        this.f9982q = ih2Var;
        this.f9983r = tk2Var.f9335q;
        this.s = tk2Var.f9336r;
        this.f9984t = tk2Var.s;
        this.f9985u = tk2Var.f9337t;
        this.f9986v = tk2Var.f9338u;
        int i9 = tk2Var.f9339v;
        this.f9987w = i9 == -1 ? 0 : i9;
        float f6 = tk2Var.f9340w;
        this.f9988x = f6 == -1.0f ? 1.0f : f6;
        this.f9989y = tk2Var.f9341x;
        this.f9990z = tk2Var.f9342y;
        this.A = tk2Var.f9343z;
        this.B = tk2Var.A;
        this.C = tk2Var.B;
        this.D = tk2Var.C;
        int i10 = tk2Var.D;
        this.E = i10 == -1 ? 0 : i10;
        int i11 = tk2Var.E;
        this.F = i11 != -1 ? i11 : 0;
        this.G = tk2Var.F;
        this.H = tk2Var.G;
        int i12 = tk2Var.H;
        if (i12 != 0 || ih2Var == null) {
            this.I = i12;
        } else {
            this.I = 1;
        }
    }

    public final tk2 a() {
        return new tk2(this);
    }

    public final boolean b(w wVar) {
        List list = this.f9981p;
        if (list.size() != wVar.f9981p.size()) {
            return false;
        }
        for (int i6 = 0; i6 < list.size(); i6++) {
            if (!Arrays.equals((byte[]) list.get(i6), (byte[]) wVar.f9981p.get(i6))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i6;
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        int i7 = this.J;
        return (i7 == 0 || (i6 = wVar.J) == 0 || i7 == i6) && this.f9971e == wVar.f9971e && this.f9972f == wVar.f9972f && this.f9973g == wVar.f9973g && this.h == wVar.h && this.f9979n == wVar.f9979n && this.f9983r == wVar.f9983r && this.f9984t == wVar.f9984t && this.f9985u == wVar.f9985u && this.f9987w == wVar.f9987w && this.f9990z == wVar.f9990z && this.B == wVar.B && this.C == wVar.C && this.D == wVar.D && this.E == wVar.E && this.F == wVar.F && this.G == wVar.G && this.I == wVar.I && Float.compare(this.f9986v, wVar.f9986v) == 0 && Float.compare(this.f9988x, wVar.f9988x) == 0 && Objects.equals(this.f9967a, wVar.f9967a) && Objects.equals(this.f9968b, wVar.f9968b) && this.f9969c.equals(wVar.f9969c) && Objects.equals(this.f9975j, wVar.f9975j) && Objects.equals(this.f9977l, wVar.f9977l) && Objects.equals(this.f9978m, wVar.f9978m) && Objects.equals(this.f9970d, wVar.f9970d) && Arrays.equals(this.f9989y, wVar.f9989y) && Objects.equals(this.f9976k, wVar.f9976k) && Objects.equals(this.A, wVar.A) && Objects.equals(this.f9982q, wVar.f9982q) && b(wVar);
    }

    public final int hashCode() {
        int i6 = this.J;
        if (i6 != 0) {
            return i6;
        }
        String str = this.f9967a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f9968b;
        int iHashCode2 = this.f9969c.hashCode() + ((((iHashCode + 527) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31);
        String str3 = this.f9970d;
        int iHashCode3 = ((((((((((iHashCode2 * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f9971e) * 31) + this.f9972f) * 961) + this.f9973g) * 31) + this.h) * 31;
        String str4 = this.f9975j;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        qh qhVar = this.f9976k;
        int iHashCode5 = (iHashCode4 + (qhVar == null ? 0 : qhVar.hashCode())) * 961;
        String str5 = this.f9977l;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        int iFloatToIntBits = ((((((((((((((((((((Float.floatToIntBits(this.f9988x) + ((((Float.floatToIntBits(this.f9986v) + ((((((((((iHashCode6 + (this.f9978m != null ? r1.hashCode() : 0)) * 31) + this.f9979n) * 31) + ((int) this.f9983r)) * 31) + this.f9984t) * 31) + this.f9985u) * 31)) * 31) + this.f9987w) * 31)) * 31) + this.f9990z) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) - 1) * 31) - 1) * 31) + this.I;
        this.J = iFloatToIntBits;
        return iFloatToIntBits;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.A);
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.f9967a);
        sb.append(", ");
        sb.append(this.f9968b);
        sb.append(", ");
        sb.append(this.f9977l);
        sb.append(", ");
        sb.append(this.f9978m);
        sb.append(", ");
        sb.append(this.f9975j);
        sb.append(", ");
        sb.append(this.f9974i);
        sb.append(", ");
        sb.append(this.f9970d);
        sb.append(", [");
        sb.append(this.f9984t);
        sb.append(", ");
        sb.append(this.f9985u);
        sb.append(", ");
        sb.append(this.f9986v);
        sb.append(", ");
        sb.append(strValueOf);
        sb.append("], [");
        sb.append(this.B);
        sb.append(", ");
        return androidx.camera.camera2.internal.p0.a(sb, this.C, "])");
    }
}
