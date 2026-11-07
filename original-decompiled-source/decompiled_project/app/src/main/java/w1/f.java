package w1;

import android.graphics.PathMeasure;
import com.yalantis.ucrop.view.CropImageView;
import e9.w0;
import java.util.List;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
import q1.j0;
import q1.k0;
import q1.l0;
import q1.u0;
import q1.v1;
import qg.z;

/* loaded from: classes.dex */
public final class f extends j {

    /* renamed from: b, reason: collision with root package name */
    public u0 f31101b;

    /* renamed from: c, reason: collision with root package name */
    public float f31102c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public List<? extends g> f31103d;

    /* renamed from: e, reason: collision with root package name */
    public float f31104e;

    /* renamed from: f, reason: collision with root package name */
    public float f31105f;

    /* renamed from: g, reason: collision with root package name */
    public u0 f31106g;

    /* renamed from: h, reason: collision with root package name */
    public int f31107h;

    /* renamed from: i, reason: collision with root package name */
    public int f31108i;

    /* renamed from: j, reason: collision with root package name */
    public float f31109j;

    /* renamed from: k, reason: collision with root package name */
    public float f31110k;

    /* renamed from: l, reason: collision with root package name */
    public float f31111l;

    /* renamed from: m, reason: collision with root package name */
    public float f31112m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f31113n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f31114o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f31115p;

    /* renamed from: q, reason: collision with root package name */
    public s1.i f31116q;

    /* renamed from: r, reason: collision with root package name */
    public final j0 f31117r;

    /* renamed from: s, reason: collision with root package name */
    public j0 f31118s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f31119t;

    public static final class a extends s implements eh.a<v1> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f31120a = new a(0);

        @Override // eh.a
        public final v1 invoke() {
            return new k0(new PathMeasure());
        }
    }

    public f() {
        int i10 = m.f31210a;
        this.f31103d = z.f22752a;
        this.f31104e = 1.0f;
        this.f31107h = 0;
        this.f31108i = 0;
        this.f31109j = 4.0f;
        this.f31111l = 1.0f;
        this.f31113n = true;
        this.f31114o = true;
        j0 j0VarA = l0.a();
        this.f31117r = j0VarA;
        this.f31118s = j0VarA;
        this.f31119t = w0.a(pg.k.f21467b, a.f31120a);
    }

    @Override // w1.j
    public final void a(s1.e eVar) {
        s1.e eVar2;
        s1.i iVar;
        if (this.f31113n) {
            i.b(this.f31103d, this.f31117r);
            e();
        } else if (this.f31115p) {
            e();
        }
        this.f31113n = false;
        this.f31115p = false;
        u0 u0Var = this.f31101b;
        if (u0Var != null) {
            eVar2 = eVar;
            s1.e.W(eVar2, this.f31118s, u0Var, this.f31102c, null, 56);
        } else {
            eVar2 = eVar;
        }
        u0 u0Var2 = this.f31106g;
        if (u0Var2 != null) {
            s1.i iVar2 = this.f31116q;
            if (this.f31114o || iVar2 == null) {
                s1.i iVar3 = new s1.i(this.f31105f, this.f31109j, this.f31107h, this.f31108i, 16);
                this.f31116q = iVar3;
                this.f31114o = false;
                iVar = iVar3;
            } else {
                iVar = iVar2;
            }
            s1.e.W(eVar2, this.f31118s, u0Var2, this.f31104e, iVar, 48);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, pg.j] */
    public final void e() {
        float f10 = this.f31110k;
        j0 j0Var = this.f31117r;
        if (f10 == CropImageView.DEFAULT_ASPECT_RATIO && this.f31111l == 1.0f) {
            this.f31118s = j0Var;
            return;
        }
        if (r.a(this.f31118s, j0Var)) {
            this.f31118s = l0.a();
        } else {
            int iJ = this.f31118s.j();
            this.f31118s.n();
            this.f31118s.h(iJ);
        }
        ?? r02 = this.f31119t;
        ((v1) r02.getValue()).b(j0Var);
        float length = ((v1) r02.getValue()).getLength();
        float f11 = this.f31110k;
        float f12 = this.f31112m;
        float f13 = ((f11 + f12) % 1.0f) * length;
        float f14 = ((this.f31111l + f12) % 1.0f) * length;
        if (f13 <= f14) {
            ((v1) r02.getValue()).a(f13, f14, this.f31118s);
        } else {
            ((v1) r02.getValue()).a(f13, length, this.f31118s);
            ((v1) r02.getValue()).a(CropImageView.DEFAULT_ASPECT_RATIO, f14, this.f31118s);
        }
    }

    public final String toString() {
        return this.f31117r.toString();
    }
}
