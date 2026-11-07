package d0;

import x0.r3;
import x0.u3;

/* loaded from: classes.dex */
public final class w0 implements r3<jh.g> {

    /* renamed from: a, reason: collision with root package name */
    public final int f7289a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7290b;

    /* renamed from: c, reason: collision with root package name */
    public final x0.x1 f7291c;

    /* renamed from: d, reason: collision with root package name */
    public int f7292d;

    public static final class a {
    }

    public w0(int i10, int i11, int i12) {
        this.f7289a = i11;
        this.f7290b = i12;
        int i13 = (i10 / i11) * i11;
        this.f7291c = new x0.x1(jh.j.q(Math.max(i13 - i12, 0), i13 + i11 + i12), u3.f31923a);
        this.f7292d = i10;
    }

    public final void c(int i10) {
        if (i10 != this.f7292d) {
            this.f7292d = i10;
            int i11 = this.f7289a;
            int i12 = (i10 / i11) * i11;
            int i13 = this.f7290b;
            this.f7291c.setValue(jh.j.q(Math.max(i12 - i13, 0), i12 + i11 + i13));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x0.r3
    public final jh.g getValue() {
        return (jh.g) this.f7291c.getValue();
    }
}
