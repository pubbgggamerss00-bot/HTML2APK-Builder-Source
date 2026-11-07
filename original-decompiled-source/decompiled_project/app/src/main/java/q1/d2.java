package q1;

import android.graphics.Shader;

/* loaded from: classes.dex */
public abstract class d2 extends u0 {

    /* renamed from: a, reason: collision with root package name */
    public Shader f21684a;

    /* renamed from: b, reason: collision with root package name */
    public long f21685b = 9205357640488583168L;

    @Override // q1.u0
    public final void a(float f10, long j10, h0 h0Var) {
        Shader shaderB = this.f21684a;
        if (shaderB == null || !p1.h.a(this.f21685b, j10)) {
            if (p1.h.e(j10)) {
                shaderB = null;
                this.f21684a = null;
                this.f21685b = 9205357640488583168L;
            } else {
                shaderB = b(j10);
                this.f21684a = shaderB;
                this.f21685b = j10;
            }
        }
        long jC = h0Var.c();
        long j11 = b1.f21648b;
        if (!b1.d(jC, j11)) {
            h0Var.i(j11);
        }
        if (!kotlin.jvm.internal.r.a(h0Var.d(), shaderB)) {
            h0Var.l(shaderB);
        }
        if (h0Var.b() == f10) {
            return;
        }
        h0Var.g(f10);
    }

    public abstract Shader b(long j10);
}
