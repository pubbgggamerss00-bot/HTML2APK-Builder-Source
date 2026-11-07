package n1;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import g2.g1;
import g2.k0;
import g2.m0;
import g2.n1;
import g2.o0;
import i2.b0;
import i2.h0;
import i2.l0;
import i2.r;
import kotlin.jvm.internal.s;
import org.bouncycastle.asn1.cmc.BodyPartID;
import pg.f0;
import q1.c1;
import qg.a0;

/* loaded from: classes.dex */
public final class n extends d.c implements b0, r {

    /* renamed from: q, reason: collision with root package name */
    public v1.c f18318q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f18319r;

    /* renamed from: s, reason: collision with root package name */
    public j1.d f18320s;

    /* renamed from: t, reason: collision with root package name */
    public g2.j f18321t;

    /* renamed from: v, reason: collision with root package name */
    public float f18322v;

    /* renamed from: w, reason: collision with root package name */
    public c1 f18323w;

    public static final class a extends s implements eh.l<g1.a, f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g1 f18324a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g1 g1Var) {
            super(1);
            this.f18324a = g1Var;
        }

        @Override // eh.l
        public final f0 invoke(g1.a aVar) {
            g1.a.g(aVar, this.f18324a, 0, 0);
            return f0.f21461a;
        }
    }

    public static boolean U1(long j10) {
        return !p1.h.a(j10, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean V1(long j10) {
        return !p1.h.a(j10, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // i2.b0
    public final int F(l0 l0Var, g2.p pVar, int i10) {
        if (!T1()) {
            return pVar.O(i10);
        }
        long jW1 = W1(f3.c.b(0, i10, 7));
        return Math.max(f3.b.k(jW1), pVar.O(i10));
    }

    @Override // i2.b0
    public final int G(l0 l0Var, g2.p pVar, int i10) {
        if (!T1()) {
            return pVar.J(i10);
        }
        long jW1 = W1(f3.c.b(0, i10, 7));
        return Math.max(f3.b.k(jW1), pVar.J(i10));
    }

    @Override // androidx.compose.ui.d.c
    public final boolean I1() {
        return false;
    }

    public final boolean T1() {
        return this.f18319r && this.f18318q.h() != 9205357640488583168L;
    }

    public final long W1(long j10) {
        boolean z10 = false;
        boolean z11 = f3.b.e(j10) && f3.b.d(j10);
        if (f3.b.g(j10) && f3.b.f(j10)) {
            z10 = true;
        }
        if ((!T1() && z11) || z10) {
            return f3.b.b(j10, f3.b.i(j10), 0, f3.b.h(j10), 0, 10);
        }
        long jH = this.f18318q.h();
        int iRound = V1(jH) ? Math.round(Float.intBitsToFloat((int) (jH >> 32))) : f3.b.k(j10);
        int iRound2 = U1(jH) ? Math.round(Float.intBitsToFloat((int) (jH & BodyPartID.bodyIdMax))) : f3.b.j(j10);
        int iG = f3.c.g(iRound, j10);
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f3.c.f(iRound2, j10)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(iG) << 32);
        if (T1()) {
            long jFloatToRawIntBits2 = (Float.floatToRawIntBits(!V1(this.f18318q.h()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.f18318q.h() >> 32))) << 32) | (Float.floatToRawIntBits(!U1(this.f18318q.h()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & BodyPartID.bodyIdMax)) : Float.intBitsToFloat((int) (this.f18318q.h() & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == CropImageView.DEFAULT_ASPECT_RATIO || Float.intBitsToFloat((int) (jFloatToRawIntBits & BodyPartID.bodyIdMax)) == CropImageView.DEFAULT_ASPECT_RATIO) ? 0L : n1.a(jFloatToRawIntBits2, this.f18321t.a(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return f3.b.b(j10, f3.c.g(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j10), 0, f3.c.f(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & BodyPartID.bodyIdMax))), j10), 0, 10);
    }

    @Override // i2.b0
    public final m0 m(o0 o0Var, k0 k0Var, long j10) {
        g1 g1VarP = k0Var.P(W1(j10));
        return o0Var.i0(g1VarP.f11382a, g1VarP.f11383b, a0.f22708a, new a(g1VarP));
    }

    @Override // i2.b0
    public final int r(l0 l0Var, g2.p pVar, int i10) {
        if (!T1()) {
            return pVar.z(i10);
        }
        long jW1 = W1(f3.c.b(i10, 0, 13));
        return Math.max(f3.b.j(jW1), pVar.z(i10));
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f18318q + ", sizeToIntrinsics=" + this.f18319r + ", alignment=" + this.f18320s + ", alpha=" + this.f18322v + ", colorFilter=" + this.f18323w + ')';
    }

    @Override // i2.b0
    public final int w(l0 l0Var, g2.p pVar, int i10) {
        if (!T1()) {
            return pVar.b0(i10);
        }
        long jW1 = W1(f3.c.b(i10, 0, 13));
        return Math.max(f3.b.j(jW1), pVar.b0(i10));
    }

    @Override // i2.r
    public final void z(h0 h0Var) {
        s1.a aVar = h0Var.f13901a;
        long jH = this.f18318q.h();
        long jFloatToRawIntBits = (Float.floatToRawIntBits(V1(jH) ? Float.intBitsToFloat((int) (jH >> 32)) : Float.intBitsToFloat((int) (aVar.i() >> 32))) << 32) | (Float.floatToRawIntBits(U1(jH) ? Float.intBitsToFloat((int) (jH & BodyPartID.bodyIdMax)) : Float.intBitsToFloat((int) (aVar.i() & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax);
        long jA = (Float.intBitsToFloat((int) (aVar.i() >> 32)) == CropImageView.DEFAULT_ASPECT_RATIO || Float.intBitsToFloat((int) (aVar.i() & BodyPartID.bodyIdMax)) == CropImageView.DEFAULT_ASPECT_RATIO) ? 0L : n1.a(jFloatToRawIntBits, this.f18321t.a(jFloatToRawIntBits, aVar.i()));
        long jA2 = this.f18320s.a((Math.round(Float.intBitsToFloat((int) (jA >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (jA & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax), (Math.round(Float.intBitsToFloat((int) (aVar.i() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (aVar.i() & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax), h0Var.getLayoutDirection());
        float f10 = (int) (jA2 >> 32);
        float f11 = (int) (jA2 & BodyPartID.bodyIdMax);
        aVar.f24173b.f24180a.f(f10, f11);
        try {
            this.f18318q.g(h0Var, jA, this.f18322v, this.f18323w);
            aVar.f24173b.f24180a.f(-f10, -f11);
            h0Var.z1();
        } catch (Throwable th2) {
            aVar.f24173b.f24180a.f(-f10, -f11);
            throw th2;
        }
    }
}
