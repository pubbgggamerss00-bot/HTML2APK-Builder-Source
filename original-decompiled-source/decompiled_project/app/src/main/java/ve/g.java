package ve;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f30793a;

    /* renamed from: b, reason: collision with root package name */
    public int f30794b;

    /* renamed from: c, reason: collision with root package name */
    public final short f30795c;

    /* renamed from: d, reason: collision with root package name */
    public final short f30796d;

    /* renamed from: e, reason: collision with root package name */
    public final short f30797e;

    /* renamed from: f, reason: collision with root package name */
    public final int f30798f;

    /* renamed from: g, reason: collision with root package name */
    public final double f30799g;

    /* renamed from: h, reason: collision with root package name */
    public final double f30800h;

    /* renamed from: i, reason: collision with root package name */
    public final double f30801i;

    /* renamed from: j, reason: collision with root package name */
    public final double f30802j;

    /* renamed from: k, reason: collision with root package name */
    public final int f30803k;

    /* renamed from: l, reason: collision with root package name */
    public final int f30804l;

    public g(k0 k0Var) throws IOException {
        this.f30799g = 1.0d;
        this.f30800h = 1.0d;
        this.f30801i = 0.0d;
        this.f30802j = 0.0d;
        this.f30803k = 0;
        this.f30804l = 0;
        short sZ = k0Var.Z();
        this.f30797e = sZ;
        this.f30798f = k0Var.i0();
        if ((sZ & 1) != 0) {
            this.f30795c = k0Var.Z();
            this.f30796d = k0Var.Z();
        } else {
            int i10 = k0Var.read();
            this.f30795c = (short) (i10 > 127 ? i10 - 256 : i10);
            int i11 = k0Var.read();
            this.f30796d = (short) (i11 > 127 ? i11 - 256 : i11);
        }
        if ((sZ & 2) != 0) {
            this.f30803k = this.f30795c;
            this.f30804l = this.f30796d;
        }
        if ((sZ & 8) != 0) {
            double dZ = k0Var.Z() / 16384.0d;
            this.f30800h = dZ;
            this.f30799g = dZ;
        } else if ((sZ & 64) != 0) {
            this.f30799g = k0Var.Z() / 16384.0d;
            this.f30800h = k0Var.Z() / 16384.0d;
        } else if ((sZ & 128) != 0) {
            this.f30799g = k0Var.Z() / 16384.0d;
            this.f30801i = k0Var.Z() / 16384.0d;
            this.f30802j = k0Var.Z() / 16384.0d;
            this.f30800h = k0Var.Z() / 16384.0d;
        }
    }
}
