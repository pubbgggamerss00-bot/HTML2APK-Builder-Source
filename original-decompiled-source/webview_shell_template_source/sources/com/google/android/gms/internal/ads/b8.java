package com.google.android.gms.internal.ads;

import android.text.Layout;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b8 {

    /* renamed from: a, reason: collision with root package name */
    public String f2962a;

    /* renamed from: b, reason: collision with root package name */
    public int f2963b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2964c;

    /* renamed from: d, reason: collision with root package name */
    public int f2965d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2966e;

    /* renamed from: k, reason: collision with root package name */
    public float f2971k;

    /* renamed from: l, reason: collision with root package name */
    public String f2972l;

    /* renamed from: o, reason: collision with root package name */
    public Layout.Alignment f2975o;

    /* renamed from: p, reason: collision with root package name */
    public Layout.Alignment f2976p;

    /* renamed from: r, reason: collision with root package name */
    public v7 f2978r;

    /* renamed from: f, reason: collision with root package name */
    public int f2967f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f2968g = -1;
    public int h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f2969i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f2970j = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f2973m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f2974n = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f2977q = -1;
    public float s = Float.MAX_VALUE;

    public final String a() {
        return this.f2972l;
    }

    public final void b(b8 b8Var) {
        int i6;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (b8Var != null) {
            if (!this.f2964c && b8Var.f2964c) {
                this.f2963b = b8Var.f2963b;
                this.f2964c = true;
            }
            if (this.h == -1) {
                this.h = b8Var.h;
            }
            if (this.f2969i == -1) {
                this.f2969i = b8Var.f2969i;
            }
            if (this.f2962a == null && (str = b8Var.f2962a) != null) {
                this.f2962a = str;
            }
            if (this.f2967f == -1) {
                this.f2967f = b8Var.f2967f;
            }
            if (this.f2968g == -1) {
                this.f2968g = b8Var.f2968g;
            }
            if (this.f2974n == -1) {
                this.f2974n = b8Var.f2974n;
            }
            if (this.f2975o == null && (alignment2 = b8Var.f2975o) != null) {
                this.f2975o = alignment2;
            }
            if (this.f2976p == null && (alignment = b8Var.f2976p) != null) {
                this.f2976p = alignment;
            }
            if (this.f2977q == -1) {
                this.f2977q = b8Var.f2977q;
            }
            if (this.f2970j == -1) {
                this.f2970j = b8Var.f2970j;
                this.f2971k = b8Var.f2971k;
            }
            if (this.f2978r == null) {
                this.f2978r = b8Var.f2978r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = b8Var.s;
            }
            if (!this.f2966e && b8Var.f2966e) {
                this.f2965d = b8Var.f2965d;
                this.f2966e = true;
            }
            if (this.f2973m != -1 || (i6 = b8Var.f2973m) == -1) {
                return;
            }
            this.f2973m = i6;
        }
    }
}
