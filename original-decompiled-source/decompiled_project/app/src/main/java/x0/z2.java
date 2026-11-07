package x0;

import java.util.ArrayList;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import x0.j;

/* loaded from: classes.dex */
public final class z2 {

    /* renamed from: a, reason: collision with root package name */
    public final a3 f31990a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f31991b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31992c;

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f31993d;

    /* renamed from: e, reason: collision with root package name */
    public final int f31994e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f31995f;

    /* renamed from: g, reason: collision with root package name */
    public int f31996g;

    /* renamed from: h, reason: collision with root package name */
    public int f31997h;

    /* renamed from: i, reason: collision with root package name */
    public int f31998i;

    /* renamed from: j, reason: collision with root package name */
    public final t0 f31999j;

    /* renamed from: k, reason: collision with root package name */
    public int f32000k;

    /* renamed from: l, reason: collision with root package name */
    public int f32001l;

    /* renamed from: m, reason: collision with root package name */
    public int f32002m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f32003n;

    public z2(a3 a3Var) {
        this.f31990a = a3Var;
        this.f31991b = a3Var.f31609a;
        int i10 = a3Var.f31610b;
        this.f31992c = i10;
        this.f31993d = a3Var.f31611c;
        this.f31994e = a3Var.f31612d;
        this.f31997h = i10;
        this.f31998i = -1;
        this.f31999j = new t0();
    }

    public final b a(int i10) {
        ArrayList<b> arrayList = this.f31990a.f31617j;
        int iE = c3.e(arrayList, i10, this.f31992c);
        if (iE >= 0) {
            return arrayList.get(iE);
        }
        b bVar = new b(i10);
        arrayList.add(-(iE + 1), bVar);
        return bVar;
    }

    public final Object b(int[] iArr, int i10) {
        int i11 = i10 * 5;
        int i12 = iArr[i11 + 1];
        if ((268435456 & i12) != 0) {
            return this.f31993d[i11 >= iArr.length ? iArr.length : iArr[i11 + 4] + Integer.bitCount(i12 >> 29)];
        }
        return j.a.f31715a;
    }

    public final void c() {
        this.f31995f = true;
        a3 a3Var = this.f31990a;
        a3Var.getClass();
        if (this.f31990a != a3Var || a3Var.f31613e <= 0) {
            q.c("Unexpected reader close()");
        }
        a3Var.f31613e--;
    }

    public final boolean d(int i10) {
        return (this.f31991b[(i10 * 5) + 1] & 67108864) != 0;
    }

    public final void e() {
        if (this.f32000k == 0) {
            if (!(this.f31996g == this.f31997h)) {
                q.c("endGroup() not called at the end of a group");
            }
            int i10 = (this.f31998i * 5) + 2;
            int[] iArr = this.f31991b;
            int i11 = iArr[i10];
            this.f31998i = i11;
            int i12 = this.f31992c;
            this.f31997h = i11 < 0 ? i12 : c3.a(iArr, i11) + i11;
            int iB = this.f31999j.b();
            if (iB < 0) {
                this.f32001l = 0;
                this.f32002m = 0;
            } else {
                this.f32001l = iB;
                this.f32002m = i11 >= i12 - 1 ? this.f31994e : iArr[((i11 + 1) * 5) + 4];
            }
        }
    }

    public final Object f() {
        int i10 = this.f31996g;
        if (i10 < this.f31997h) {
            return b(this.f31991b, i10);
        }
        return 0;
    }

    public final int g() {
        int i10 = this.f31996g;
        if (i10 >= this.f31997h) {
            return 0;
        }
        return this.f31991b[i10 * 5];
    }

    public final Object h(int i10, int i11) {
        int[] iArr = this.f31991b;
        int iC = c3.c(iArr, i10);
        int i12 = i10 + 1;
        int i13 = iC + i11;
        return i13 < (i12 < this.f31992c ? iArr[(i12 * 5) + 4] : this.f31994e) ? this.f31993d[i13] : j.a.f31715a;
    }

    public final boolean i(int i10) {
        return (this.f31991b[(i10 * 5) + 1] & PKIFailureInfo.duplicateCertReq) != 0;
    }

    public final boolean j(int i10) {
        return (this.f31991b[(i10 * 5) + 1] & 1073741824) != 0;
    }

    public final Object k() {
        int i10;
        if (this.f32000k > 0 || (i10 = this.f32001l) >= this.f32002m) {
            this.f32003n = false;
            return j.a.f31715a;
        }
        this.f32003n = true;
        this.f32001l = i10 + 1;
        return this.f31993d[i10];
    }

    public final Object l(int i10) {
        int i11 = i10 * 5;
        int[] iArr = this.f31991b;
        int i12 = iArr[i11 + 1] & 1073741824;
        if (i12 == 0) {
            return null;
        }
        if (i12 == 0) {
            return j.a.f31715a;
        }
        return this.f31993d[iArr[i11 + 4]];
    }

    public final int m(int i10) {
        return this.f31991b[(i10 * 5) + 1] & 67108863;
    }

    public final Object n(int[] iArr, int i10) {
        int i11 = i10 * 5;
        int i12 = iArr[i11 + 1];
        if ((536870912 & i12) == 0) {
            return null;
        }
        return this.f31993d[Integer.bitCount(i12 >> 30) + iArr[i11 + 4]];
    }

    public final int o(int i10) {
        return this.f31991b[(i10 * 5) + 2];
    }

    public final void p(int i10) {
        if (!(this.f32000k == 0)) {
            q.c("Cannot reposition while in an empty region");
        }
        this.f31996g = i10;
        int[] iArr = this.f31991b;
        int i11 = this.f31992c;
        int i12 = i10 < i11 ? iArr[(i10 * 5) + 2] : -1;
        this.f31998i = i12;
        if (i12 < 0) {
            this.f31997h = i11;
        } else {
            this.f31997h = c3.a(iArr, i12) + i12;
        }
        this.f32001l = 0;
        this.f32002m = 0;
    }

    public final int q() {
        if (!(this.f32000k == 0)) {
            q.c("Cannot skip while in an empty region");
        }
        int i10 = this.f31996g;
        int[] iArr = this.f31991b;
        int i11 = (iArr[(i10 * 5) + 1] & 1073741824) == 0 ? iArr[(i10 * 5) + 1] & 67108863 : 1;
        this.f31996g = c3.a(iArr, i10) + i10;
        return i11;
    }

    public final void r() {
        if (!(this.f32000k == 0)) {
            q.c("Cannot skip the enclosing group while in an empty region");
        }
        this.f31996g = this.f31997h;
        this.f32001l = 0;
        this.f32002m = 0;
    }

    public final void s() {
        if (this.f32000k <= 0) {
            int i10 = this.f31998i;
            int i11 = this.f31996g;
            int[] iArr = this.f31991b;
            if (iArr[(i11 * 5) + 2] != i10) {
                b2.a("Invalid slot table detected");
            }
            int i12 = this.f32001l;
            int i13 = this.f32002m;
            t0 t0Var = this.f31999j;
            if (i12 == 0 && i13 == 0) {
                t0Var.c(-1);
            } else {
                t0Var.c(i12);
            }
            this.f31998i = i11;
            this.f31997h = c3.a(iArr, i11) + i11;
            int i14 = i11 + 1;
            this.f31996g = i14;
            this.f32001l = c3.c(iArr, i11);
            this.f32002m = i11 >= this.f31992c + (-1) ? this.f31994e : iArr[(i14 * 5) + 4];
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.f31996g);
        sb.append(", key=");
        sb.append(g());
        sb.append(", parent=");
        sb.append(this.f31998i);
        sb.append(", end=");
        return b.b.a(sb, this.f31997h, ')');
    }
}
