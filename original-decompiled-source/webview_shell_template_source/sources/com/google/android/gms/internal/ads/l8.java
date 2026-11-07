package com.google.android.gms.internal.ads;

import android.text.Layout;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l8 {

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f6599c;

    /* renamed from: a, reason: collision with root package name */
    public long f6597a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f6598b = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f6600d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f6601e = -3.4028235E38f;

    /* renamed from: f, reason: collision with root package name */
    public int f6602f = 1;

    /* renamed from: g, reason: collision with root package name */
    public int f6603g = 0;
    public float h = -3.4028235E38f;

    /* renamed from: i, reason: collision with root package name */
    public int f6604i = Integer.MIN_VALUE;

    /* renamed from: j, reason: collision with root package name */
    public float f6605j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    public int f6606k = Integer.MIN_VALUE;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final mf0 a() {
        Layout.Alignment alignment;
        float f6 = this.h;
        float f7 = -3.4028235E38f;
        if (f6 == -3.4028235E38f) {
            int i6 = this.f6600d;
            f6 = i6 != 4 ? i6 != 5 ? 0.5f : 1.0f : 0.0f;
        }
        int i7 = this.f6604i;
        if (i7 == Integer.MIN_VALUE) {
            int i8 = this.f6600d;
            if (i8 == 1) {
                i7 = 0;
            } else if (i8 == 3) {
                i7 = 2;
            } else if (i8 != 4) {
                if (i8 != 5) {
                    i7 = 1;
                }
            }
        }
        mf0 mf0Var = new mf0();
        int i9 = this.f6600d;
        if (i9 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i9 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i9 == 3) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i9 != 4) {
            if (i9 != 5) {
                androidx.activity.m.g(i9, "Unknown textAlignment: ", "WebvttCueParser");
                alignment = null;
            }
        }
        mf0Var.f7113c = alignment;
        float f8 = this.f6601e;
        int i10 = this.f6602f;
        if (f8 == -3.4028235E38f || i10 != 0 || (f8 >= 0.0f && f8 <= 1.0f)) {
            if (f8 != -3.4028235E38f) {
                f7 = f8;
            } else if (i10 == 0) {
                f7 = 1.0f;
            }
        }
        mf0Var.f7115e = f7;
        mf0Var.f7116f = i10;
        mf0Var.f7117g = this.f6603g;
        mf0Var.h = f6;
        mf0Var.f7118i = i7;
        float f9 = this.f6605j;
        if (i7 == 0) {
            f6 = 1.0f - f6;
        } else if (i7 != 1) {
            if (i7 != 2) {
                throw new IllegalStateException(String.valueOf(i7));
            }
        } else if (f6 <= 0.5f) {
            f6 += f6;
        } else {
            float f10 = 1.0f - f6;
            f6 = f10 + f10;
        }
        mf0Var.f7121l = Math.min(f9, f6);
        mf0Var.f7123n = this.f6606k;
        CharSequence charSequence = this.f6599c;
        if (charSequence != null) {
            mf0Var.f7111a = charSequence;
        }
        return mf0Var;
    }
}
