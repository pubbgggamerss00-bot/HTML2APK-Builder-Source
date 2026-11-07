package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class cy {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f3686m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public static final tc f3687n;

    /* renamed from: a, reason: collision with root package name */
    public Object f3688a = f3686m;

    /* renamed from: b, reason: collision with root package name */
    public tc f3689b = f3687n;

    /* renamed from: c, reason: collision with root package name */
    public long f3690c;

    /* renamed from: d, reason: collision with root package name */
    public long f3691d;

    /* renamed from: e, reason: collision with root package name */
    public long f3692e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3693f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3694g;
    public t7 h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3695i;

    /* renamed from: j, reason: collision with root package name */
    public long f3696j;

    /* renamed from: k, reason: collision with root package name */
    public int f3697k;

    /* renamed from: l, reason: collision with root package name */
    public int f3698l;

    static {
        zn1 zn1Var = bo1.f3236t;
        cp1 cp1Var = cp1.f3636w;
        List list = Collections.EMPTY_LIST;
        cp1 cp1Var2 = cp1.f3636w;
        ga gaVar = ga.f4956a;
        Uri uri = Uri.EMPTY;
        f3687n = new tc("androidx.media3.common.Timeline", new l5(), uri != null ? new q8(uri, cp1Var2) : null, new t7(), lf.f6679z);
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
    }

    public final void a(tc tcVar, boolean z6, boolean z7, t7 t7Var, long j6) {
        this.f3688a = f3686m;
        if (tcVar == null) {
            tcVar = f3687n;
        }
        this.f3689b = tcVar;
        this.f3690c = -9223372036854775807L;
        this.f3691d = -9223372036854775807L;
        this.f3692e = -9223372036854775807L;
        this.f3693f = z6;
        this.f3694g = z7;
        this.h = t7Var;
        this.f3696j = j6;
        this.f3697k = 0;
        this.f3698l = 0;
        this.f3695i = false;
    }

    public final boolean b() {
        return this.h != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !cy.class.equals(obj.getClass())) {
            return false;
        }
        cy cyVar = (cy) obj;
        return Objects.equals(this.f3688a, cyVar.f3688a) && Objects.equals(this.f3689b, cyVar.f3689b) && Objects.equals(this.h, cyVar.h) && this.f3690c == cyVar.f3690c && this.f3691d == cyVar.f3691d && this.f3692e == cyVar.f3692e && this.f3693f == cyVar.f3693f && this.f3694g == cyVar.f3694g && this.f3695i == cyVar.f3695i && this.f3696j == cyVar.f3696j && this.f3697k == cyVar.f3697k && this.f3698l == cyVar.f3698l;
    }

    public final int hashCode() {
        int iHashCode = ((this.f3688a.hashCode() + 217) * 31) + this.f3689b.hashCode();
        t7 t7Var = this.h;
        int iHashCode2 = ((iHashCode * 961) + (t7Var == null ? 0 : t7Var.hashCode())) * 31;
        long j6 = this.f3690c;
        int i6 = (iHashCode2 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.f3691d;
        int i7 = (i6 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.f3692e;
        int i8 = ((((((i7 + ((int) (j8 ^ (j8 >>> 32)))) * 31) + (this.f3693f ? 1 : 0)) * 31) + (this.f3694g ? 1 : 0)) * 31) + (this.f3695i ? 1 : 0);
        long j9 = this.f3696j;
        return ((((((i8 * 961) + ((int) (j9 ^ (j9 >>> 32)))) * 31) + this.f3697k) * 31) + this.f3698l) * 31;
    }
}
