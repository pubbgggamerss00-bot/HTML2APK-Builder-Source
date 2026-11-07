package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xg0 {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;

    /* renamed from: p, reason: collision with root package name */
    public static final String f10560p;

    /* renamed from: q, reason: collision with root package name */
    public static final String f10561q;

    /* renamed from: r, reason: collision with root package name */
    public static final String f10562r;
    public static final String s;

    /* renamed from: t, reason: collision with root package name */
    public static final String f10563t;

    /* renamed from: u, reason: collision with root package name */
    public static final String f10564u;

    /* renamed from: v, reason: collision with root package name */
    public static final String f10565v;

    /* renamed from: w, reason: collision with root package name */
    public static final String f10566w;

    /* renamed from: x, reason: collision with root package name */
    public static final String f10567x;

    /* renamed from: y, reason: collision with root package name */
    public static final String f10568y;

    /* renamed from: z, reason: collision with root package name */
    public static final String f10569z;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f10570a;

    /* renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f10571b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f10572c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f10573d;

    /* renamed from: e, reason: collision with root package name */
    public final float f10574e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10575f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10576g;
    public final float h;

    /* renamed from: i, reason: collision with root package name */
    public final int f10577i;

    /* renamed from: j, reason: collision with root package name */
    public final float f10578j;

    /* renamed from: k, reason: collision with root package name */
    public final float f10579k;

    /* renamed from: l, reason: collision with root package name */
    public final int f10580l;

    /* renamed from: m, reason: collision with root package name */
    public final float f10581m;

    /* renamed from: n, reason: collision with root package name */
    public final int f10582n;

    /* renamed from: o, reason: collision with root package name */
    public final float f10583o;

    static {
        mf0 mf0Var = new mf0();
        mf0Var.f7111a = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        mf0Var.a();
        f10560p = Integer.toString(0, 36);
        f10561q = Integer.toString(17, 36);
        f10562r = Integer.toString(1, 36);
        s = Integer.toString(2, 36);
        Integer.toString(3, 36);
        f10563t = Integer.toString(18, 36);
        f10564u = Integer.toString(4, 36);
        f10565v = Integer.toString(5, 36);
        f10566w = Integer.toString(6, 36);
        f10567x = Integer.toString(7, 36);
        f10568y = Integer.toString(8, 36);
        f10569z = Integer.toString(9, 36);
        A = Integer.toString(10, 36);
        B = Integer.toString(11, 36);
        C = Integer.toString(12, 36);
        D = Integer.toString(13, 36);
        E = Integer.toString(14, 36);
        F = Integer.toString(15, 36);
        G = Integer.toString(16, 36);
    }

    public /* synthetic */ xg0(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f6, int i6, int i7, float f7, int i8, int i9, float f8, float f9, float f10, int i10, float f11) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            y5.n(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f10570a = SpannedString.valueOf(charSequence);
        } else {
            this.f10570a = charSequence != null ? charSequence.toString() : null;
        }
        this.f10571b = alignment;
        this.f10572c = alignment2;
        this.f10573d = bitmap;
        this.f10574e = f6;
        this.f10575f = i6;
        this.f10576g = i7;
        this.h = f7;
        this.f10577i = i8;
        this.f10578j = f9;
        this.f10579k = f10;
        this.f10580l = i9;
        this.f10581m = f8;
        this.f10582n = i10;
        this.f10583o = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xg0.class != obj.getClass()) {
            return false;
        }
        xg0 xg0Var = (xg0) obj;
        Bitmap bitmap = xg0Var.f10573d;
        if (!TextUtils.equals(this.f10570a, xg0Var.f10570a) || this.f10571b != xg0Var.f10571b || this.f10572c != xg0Var.f10572c) {
            return false;
        }
        Bitmap bitmap2 = this.f10573d;
        if (bitmap2 == null) {
            if (bitmap != null) {
                return false;
            }
        } else if (bitmap == null || !bitmap2.sameAs(bitmap)) {
            return false;
        }
        return this.f10574e == xg0Var.f10574e && this.f10575f == xg0Var.f10575f && this.f10576g == xg0Var.f10576g && this.h == xg0Var.h && this.f10577i == xg0Var.f10577i && this.f10578j == xg0Var.f10578j && this.f10579k == xg0Var.f10579k && this.f10580l == xg0Var.f10580l && this.f10581m == xg0Var.f10581m && this.f10582n == xg0Var.f10582n && this.f10583o == xg0Var.f10583o;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10570a, this.f10571b, this.f10572c, this.f10573d, Float.valueOf(this.f10574e), Integer.valueOf(this.f10575f), Integer.valueOf(this.f10576g), Float.valueOf(this.h), Integer.valueOf(this.f10577i), Float.valueOf(this.f10578j), Float.valueOf(this.f10579k), Boolean.FALSE, -16777216, Integer.valueOf(this.f10580l), Float.valueOf(this.f10581m), Integer.valueOf(this.f10582n), Float.valueOf(this.f10583o)});
    }
}
