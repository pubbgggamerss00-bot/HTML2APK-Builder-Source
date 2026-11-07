package y2;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final w f33737a;

    /* renamed from: b, reason: collision with root package name */
    public int f33738b;

    /* renamed from: c, reason: collision with root package name */
    public int f33739c;

    /* renamed from: d, reason: collision with root package name */
    public int f33740d;

    /* renamed from: e, reason: collision with root package name */
    public int f33741e;

    public k(t2.b bVar, long j10) {
        String str = bVar.f27761b;
        w wVar = new w();
        wVar.f33770a = str;
        wVar.f33772c = -1;
        wVar.f33773d = -1;
        this.f33737a = wVar;
        this.f33738b = t2.j0.e(j10);
        this.f33739c = t2.j0.d(j10);
        this.f33740d = -1;
        this.f33741e = -1;
        int iE = t2.j0.e(j10);
        int iD = t2.j0.d(j10);
        if (iE < 0 || iE > str.length()) {
            StringBuilder sbB = p.i0.b(iE, "start (", ") offset is outside of text region ");
            sbB.append(str.length());
            throw new IndexOutOfBoundsException(sbB.toString());
        }
        if (iD < 0 || iD > str.length()) {
            StringBuilder sbB2 = p.i0.b(iD, "end (", ") offset is outside of text region ");
            sbB2.append(str.length());
            throw new IndexOutOfBoundsException(sbB2.toString());
        }
        if (iE > iD) {
            throw new IllegalArgumentException(e1.c.a(iE, iD, "Do not set reversed range: ", " > "));
        }
    }

    public final void a(int i10, int i11) {
        long jA = t2.k0.a(i10, i11);
        this.f33737a.b(i10, i11, "");
        long jC = hf.a.c(t2.k0.a(this.f33738b, this.f33739c), jA);
        h(t2.j0.e(jC));
        g(t2.j0.d(jC));
        int i12 = this.f33740d;
        if (i12 != -1) {
            long jC2 = hf.a.c(t2.k0.a(i12, this.f33741e), jA);
            if (t2.j0.b(jC2)) {
                this.f33740d = -1;
                this.f33741e = -1;
            } else {
                this.f33740d = t2.j0.e(jC2);
                this.f33741e = t2.j0.d(jC2);
            }
        }
    }

    public final char b(int i10) {
        w wVar = this.f33737a;
        m mVar = wVar.f33771b;
        if (mVar != null && i10 >= wVar.f33772c) {
            int iA = mVar.f33744a - mVar.a();
            int i11 = wVar.f33772c;
            if (i10 >= iA + i11) {
                return wVar.f33770a.charAt(i10 - ((iA - wVar.f33773d) + i11));
            }
            int i12 = i10 - i11;
            int i13 = mVar.f33746c;
            return i12 < i13 ? mVar.f33745b[i12] : mVar.f33745b[(i12 - i13) + mVar.f33747d];
        }
        return wVar.f33770a.charAt(i10);
    }

    public final t2.j0 c() {
        int i10 = this.f33740d;
        if (i10 != -1) {
            return new t2.j0(t2.k0.a(i10, this.f33741e));
        }
        return null;
    }

    public final void d(int i10, int i11, String str) {
        w wVar = this.f33737a;
        if (i10 < 0 || i10 > wVar.a()) {
            StringBuilder sbB = p.i0.b(i10, "start (", ") offset is outside of text region ");
            sbB.append(wVar.a());
            throw new IndexOutOfBoundsException(sbB.toString());
        }
        if (i11 < 0 || i11 > wVar.a()) {
            StringBuilder sbB2 = p.i0.b(i11, "end (", ") offset is outside of text region ");
            sbB2.append(wVar.a());
            throw new IndexOutOfBoundsException(sbB2.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(e1.c.a(i10, i11, "Do not set reversed range: ", " > "));
        }
        wVar.b(i10, i11, str);
        h(str.length() + i10);
        g(str.length() + i10);
        this.f33740d = -1;
        this.f33741e = -1;
    }

    public final void e(int i10, int i11) {
        w wVar = this.f33737a;
        if (i10 < 0 || i10 > wVar.a()) {
            StringBuilder sbB = p.i0.b(i10, "start (", ") offset is outside of text region ");
            sbB.append(wVar.a());
            throw new IndexOutOfBoundsException(sbB.toString());
        }
        if (i11 < 0 || i11 > wVar.a()) {
            StringBuilder sbB2 = p.i0.b(i11, "end (", ") offset is outside of text region ");
            sbB2.append(wVar.a());
            throw new IndexOutOfBoundsException(sbB2.toString());
        }
        if (i10 >= i11) {
            throw new IllegalArgumentException(e1.c.a(i10, i11, "Do not set reversed or empty range: ", " > "));
        }
        this.f33740d = i10;
        this.f33741e = i11;
    }

    public final void f(int i10, int i11) {
        w wVar = this.f33737a;
        if (i10 < 0 || i10 > wVar.a()) {
            StringBuilder sbB = p.i0.b(i10, "start (", ") offset is outside of text region ");
            sbB.append(wVar.a());
            throw new IndexOutOfBoundsException(sbB.toString());
        }
        if (i11 < 0 || i11 > wVar.a()) {
            StringBuilder sbB2 = p.i0.b(i11, "end (", ") offset is outside of text region ");
            sbB2.append(wVar.a());
            throw new IndexOutOfBoundsException(sbB2.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(e1.c.a(i10, i11, "Do not set reversed range: ", " > "));
        }
        h(i10);
        g(i11);
    }

    public final void g(int i10) {
        if (!(i10 >= 0)) {
            z2.a.a("Cannot set selectionEnd to a negative value: " + i10);
        }
        this.f33739c = i10;
    }

    public final void h(int i10) {
        if (!(i10 >= 0)) {
            z2.a.a("Cannot set selectionStart to a negative value: " + i10);
        }
        this.f33738b = i10;
    }

    public final String toString() {
        return this.f33737a.toString();
    }
}
