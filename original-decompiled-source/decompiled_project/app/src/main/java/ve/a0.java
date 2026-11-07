package ve;

import android.util.Log;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class a0 extends n0 {
    public int A;
    public int B;
    public int C;
    public long D;
    public long E;
    public int F;
    public int G;

    /* renamed from: f, reason: collision with root package name */
    public int f30755f;

    /* renamed from: g, reason: collision with root package name */
    public short f30756g;

    /* renamed from: h, reason: collision with root package name */
    public int f30757h;

    /* renamed from: i, reason: collision with root package name */
    public int f30758i;

    /* renamed from: j, reason: collision with root package name */
    public short f30759j;

    /* renamed from: k, reason: collision with root package name */
    public short f30760k;

    /* renamed from: l, reason: collision with root package name */
    public short f30761l;

    /* renamed from: m, reason: collision with root package name */
    public short f30762m;

    /* renamed from: n, reason: collision with root package name */
    public short f30763n;

    /* renamed from: o, reason: collision with root package name */
    public short f30764o;

    /* renamed from: p, reason: collision with root package name */
    public short f30765p;

    /* renamed from: q, reason: collision with root package name */
    public short f30766q;

    /* renamed from: r, reason: collision with root package name */
    public short f30767r;

    /* renamed from: s, reason: collision with root package name */
    public short f30768s;

    /* renamed from: t, reason: collision with root package name */
    public short f30769t;

    /* renamed from: u, reason: collision with root package name */
    public int f30770u;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f30771v;

    /* renamed from: w, reason: collision with root package name */
    public String f30772w;

    /* renamed from: x, reason: collision with root package name */
    public int f30773x;

    /* renamed from: y, reason: collision with root package name */
    public int f30774y;

    /* renamed from: z, reason: collision with root package name */
    public int f30775z;

    @Override // ve.n0
    public final void a(p0 p0Var, k0 k0Var) throws IOException {
        this.f30755f = k0Var.i0();
        this.f30756g = k0Var.Z();
        this.f30757h = k0Var.i0();
        this.f30758i = k0Var.i0();
        this.f30759j = k0Var.Z();
        this.f30760k = k0Var.Z();
        this.f30761l = k0Var.Z();
        this.f30762m = k0Var.Z();
        this.f30763n = k0Var.Z();
        this.f30764o = k0Var.Z();
        this.f30765p = k0Var.Z();
        this.f30766q = k0Var.Z();
        this.f30767r = k0Var.Z();
        this.f30768s = k0Var.Z();
        this.f30769t = k0Var.Z();
        this.f30770u = k0Var.Z();
        this.f30771v = k0Var.z(10);
        k0Var.g0();
        k0Var.g0();
        k0Var.g0();
        k0Var.g0();
        this.f30772w = k0Var.d0(4, xe.a.f33561a);
        this.f30773x = k0Var.i0();
        k0Var.i0();
        k0Var.i0();
        try {
            this.f30774y = k0Var.Z();
            this.f30775z = k0Var.Z();
            this.A = k0Var.Z();
            this.B = k0Var.i0();
            this.C = k0Var.i0();
            if (this.f30755f >= 1) {
                try {
                    this.D = k0Var.g0();
                    this.E = k0Var.g0();
                } catch (EOFException e10) {
                    this.f30755f = 0;
                    Log.w("PdfBox-Android", "Could not read all expected parts of version >= 1, setting version to 0", e10);
                    this.f30855d = true;
                    return;
                }
            }
            if (this.f30755f >= 2) {
                try {
                    this.F = k0Var.Z();
                    this.G = k0Var.Z();
                    k0Var.i0();
                    k0Var.i0();
                    k0Var.i0();
                } catch (EOFException e11) {
                    this.f30755f = 1;
                    Log.w("PdfBox-Android", "Could not read all expected parts of version >= 2, setting version to 1", e11);
                    this.f30855d = true;
                    return;
                }
            }
            this.f30855d = true;
        } catch (EOFException unused) {
            Log.d("PdfBox-Android", "EOF, probably some legacy TrueType font");
            this.f30855d = true;
        }
    }
}
