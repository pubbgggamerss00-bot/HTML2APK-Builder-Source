package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.gms.ads.RequestConfiguration;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d8 implements a7 {
    public final ex0 s = new ex0();

    /* renamed from: t, reason: collision with root package name */
    public final boolean f3782t;

    /* renamed from: u, reason: collision with root package name */
    public final int f3783u;

    /* renamed from: v, reason: collision with root package name */
    public final int f3784v;

    /* renamed from: w, reason: collision with root package name */
    public final String f3785w;

    /* renamed from: x, reason: collision with root package name */
    public final float f3786x;

    /* renamed from: y, reason: collision with root package name */
    public final int f3787y;

    public d8(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f3783u = 0;
            this.f3784v = -1;
            this.f3785w = "sans-serif";
            this.f3782t = false;
            this.f3786x = 0.85f;
            this.f3787y = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f3783u = bArr[24];
        this.f3784v = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        int length = bArr.length - 43;
        int i6 = j31.f5914a;
        this.f3785w = true == "Serif".equals(new String(bArr, 43, length, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i7 = bArr[25] * 20;
        this.f3787y = i7;
        boolean z6 = (bArr[0] & 32) != 0;
        this.f3782t = z6;
        if (z6) {
            this.f3786x = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i7, 0.95f));
        } else {
            this.f3786x = 0.85f;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i6, int i7, int i8, int i9, int i10) {
        if (i6 != i7) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i6 >>> 8) | ((i6 & 255) << 24)), i8, i9, i10 | 33);
        }
    }

    public static void c(SpannableStringBuilder spannableStringBuilder, int i6, int i7, int i8, int i9, int i10) {
        if (i6 != i7) {
            int i11 = i10 | 33;
            int i12 = i6 & 1;
            int i13 = i6 & 2;
            boolean z6 = true;
            if (i12 != 0) {
                if (i13 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i8, i9, i11);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i8, i9, i11);
                    z6 = false;
                }
            } else if (i13 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i8, i9, i11);
            } else {
                z6 = false;
            }
            if ((i6 & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i8, i9, i11);
            } else {
                if (i12 != 0 || z6) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i8, i9, i11);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.a7
    public final void b(byte[] bArr, int i6, int i7, c7 c7Var) {
        String strB;
        int i8;
        int i9;
        int i10;
        int i11;
        ex0 ex0Var = this.s;
        ex0Var.h(i6 + i7, bArr);
        ex0Var.j(i6);
        int i12 = 1;
        int i13 = 0;
        int i14 = 2;
        y5.n(ex0Var.o() >= 2);
        int iZ = ex0Var.z();
        if (iZ == 0) {
            strB = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        } else {
            int i15 = ex0Var.f4417b;
            Charset charsetC = ex0Var.c();
            int i16 = ex0Var.f4417b - i15;
            if (charsetC == null) {
                charsetC = StandardCharsets.UTF_8;
            }
            strB = ex0Var.b(iZ - i16, charsetC);
        }
        if (strB.isEmpty()) {
            zn1 zn1Var = bo1.f3236t;
            c7Var.mo6zza(new v6(cp1.f3636w, -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strB);
        c(spannableStringBuilder, this.f3783u, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.f3784v, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.f3785w;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fMax = this.f3786x;
        while (ex0Var.o() >= 8) {
            int i17 = ex0Var.f4417b;
            int iQ = ex0Var.q();
            int iQ2 = ex0Var.q();
            if (iQ2 == 1937013100) {
                y5.n(ex0Var.o() >= i14 ? i12 : i13);
                int iZ2 = ex0Var.z();
                int i18 = i13;
                while (i18 < iZ2) {
                    y5.n(ex0Var.o() >= 12 ? i12 : i13);
                    int iZ3 = ex0Var.z();
                    int iZ4 = ex0Var.z();
                    ex0Var.k(i14);
                    int i19 = i18;
                    int iV = ex0Var.v();
                    ex0Var.k(i12);
                    int iQ3 = ex0Var.q();
                    if (iZ4 > spannableStringBuilder.length()) {
                        i10 = i17;
                        qs0.f("Tx3gParser", "Truncating styl end (" + iZ4 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
                        iZ4 = spannableStringBuilder.length();
                    } else {
                        i10 = i17;
                    }
                    if (iZ3 >= iZ4) {
                        qs0.f("Tx3gParser", "Ignoring styl with start (" + iZ3 + ") >= end (" + iZ4 + ").");
                        i11 = i19;
                    } else {
                        i11 = i19;
                        int i20 = iZ4;
                        c(spannableStringBuilder, iV, this.f3783u, iZ3, i20, 0);
                        a(spannableStringBuilder, iQ3, this.f3784v, iZ3, i20, 0);
                    }
                    i18 = i11 + 1;
                    i17 = i10;
                    i12 = 1;
                    i13 = 0;
                    i14 = 2;
                }
                i8 = i17;
                i9 = i14;
            } else {
                i8 = i17;
                if (iQ2 == 1952608120 && this.f3782t) {
                    i9 = 2;
                    y5.n(ex0Var.o() >= 2);
                    fMax = Math.max(0.0f, Math.min(ex0Var.z() / this.f3787y, 0.95f));
                } else {
                    i9 = 2;
                }
            }
            ex0Var.j(i8 + iQ);
            i14 = i9;
            i12 = 1;
            i13 = 0;
        }
        mf0 mf0Var = new mf0();
        mf0Var.f7111a = spannableStringBuilder;
        mf0Var.f7115e = fMax;
        mf0Var.f7116f = 0;
        mf0Var.f7117g = 0;
        c7Var.mo6zza(new v6(bo1.n(mf0Var.a()), -9223372036854775807L, -9223372036854775807L));
    }
}
