package b3;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import c2.n0;
import com.yalantis.ucrop.view.CropImageView;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
import org.bouncycastle.asn1.cmc.BodyPartID;
import q1.b1;
import q1.d2;
import q1.e2;
import q1.h0;
import q1.i2;
import q1.u0;
import x0.g0;

/* loaded from: classes.dex */
public final class d extends TextPaint {

    /* renamed from: a, reason: collision with root package name */
    public h0 f3549a;

    /* renamed from: b, reason: collision with root package name */
    public e3.i f3550b;

    /* renamed from: c, reason: collision with root package name */
    public int f3551c;

    /* renamed from: d, reason: collision with root package name */
    public e2 f3552d;

    /* renamed from: e, reason: collision with root package name */
    public b1 f3553e;

    /* renamed from: f, reason: collision with root package name */
    public u0 f3554f;

    /* renamed from: g, reason: collision with root package name */
    public g0 f3555g;

    /* renamed from: h, reason: collision with root package name */
    public p1.h f3556h;

    /* renamed from: i, reason: collision with root package name */
    public s1.f f3557i;

    public static final class a extends s implements eh.a<Shader> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u0 f3558a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f3559b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u0 u0Var, long j10) {
            super(0);
            this.f3558a = u0Var;
            this.f3559b = j10;
        }

        @Override // eh.a
        public final Shader invoke() {
            return ((d2) this.f3558a).b(this.f3559b);
        }
    }

    public final h0 a() {
        h0 h0Var = this.f3549a;
        if (h0Var != null) {
            return h0Var;
        }
        h0 h0Var2 = new h0(this);
        this.f3549a = h0Var2;
        return h0Var2;
    }

    public final void b(int i10) {
        if (i10 == this.f3551c) {
            return;
        }
        a().h(i10);
        this.f3551c = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(u0 u0Var, long j10, float f10) {
        if (u0Var == null) {
            this.f3555g = null;
            this.f3554f = null;
            this.f3556h = null;
            setShader(null);
            return;
        }
        if (u0Var instanceof i2) {
            d(e3.k.a(f10, ((i2) u0Var).f21711a));
            return;
        }
        if (u0Var instanceof d2) {
            if (r.a(this.f3554f, u0Var)) {
                p1.h hVar = this.f3556h;
                if (!(hVar == null ? false : p1.h.a(hVar.f21143a, j10))) {
                }
            } else {
                if (j10 != 9205357640488583168L) {
                    this.f3554f = u0Var;
                    this.f3556h = new p1.h(j10);
                    this.f3555g = bg.b.d(new a(u0Var, j10));
                }
            }
            h0 h0VarA = a();
            g0 g0Var = this.f3555g;
            h0VarA.l(g0Var != null ? (Shader) g0Var.getValue() : null);
            this.f3553e = null;
            e.e(this, f10);
        }
    }

    public final void d(long j10) {
        b1 b1Var = this.f3553e;
        if (b1Var == null ? false : b1.d(b1Var.f21656a, j10)) {
            return;
        }
        if (j10 != 16) {
            this.f3553e = new b1(j10);
            setColor(n0.j(j10));
            this.f3555g = null;
            this.f3554f = null;
            this.f3556h = null;
            setShader(null);
        }
    }

    public final void e(s1.f fVar) {
        if (fVar == null || r.a(this.f3557i, fVar)) {
            return;
        }
        this.f3557i = fVar;
        if (fVar.equals(s1.h.f24186a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (fVar instanceof s1.i) {
            a().q(1);
            s1.i iVar = (s1.i) fVar;
            a().p(iVar.f24187a);
            a().o(iVar.f24188b);
            a().n(iVar.f24190d);
            a().m(iVar.f24189c);
            a().f21694a.setPathEffect(null);
        }
    }

    public final void f(e2 e2Var) {
        if (e2Var == null || r.a(this.f3552d, e2Var)) {
            return;
        }
        this.f3552d = e2Var;
        if (e2Var.equals(e2.f21687d)) {
            clearShadowLayer();
            return;
        }
        e2 e2Var2 = this.f3552d;
        float f10 = e2Var2.f21690c;
        if (f10 == CropImageView.DEFAULT_ASPECT_RATIO) {
            f10 = Float.MIN_VALUE;
        }
        setShadowLayer(f10, Float.intBitsToFloat((int) (e2Var2.f21689b >> 32)), Float.intBitsToFloat((int) (this.f3552d.f21689b & BodyPartID.bodyIdMax)), n0.j(this.f3552d.f21688a));
    }

    public final void g(e3.i iVar) {
        if (iVar == null || r.a(this.f3550b, iVar)) {
            return;
        }
        this.f3550b = iVar;
        int i10 = iVar.f8367a;
        setUnderlineText((i10 | 1) == i10);
        int i11 = this.f3550b.f8367a;
        setStrikeThruText((i11 | 2) == i11);
    }
}
