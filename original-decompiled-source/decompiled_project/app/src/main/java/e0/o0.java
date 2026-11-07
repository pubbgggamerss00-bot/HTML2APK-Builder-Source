package e0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class o0 implements c0, g2.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final List<m> f8251a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8252b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8253c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8254d;

    /* renamed from: e, reason: collision with root package name */
    public final v.t0 f8255e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8256f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8257g;

    /* renamed from: h, reason: collision with root package name */
    public final int f8258h;

    /* renamed from: i, reason: collision with root package name */
    public final m f8259i;

    /* renamed from: j, reason: collision with root package name */
    public final m f8260j;

    /* renamed from: k, reason: collision with root package name */
    public final float f8261k;

    /* renamed from: l, reason: collision with root package name */
    public final int f8262l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f8263m;

    /* renamed from: n, reason: collision with root package name */
    public final w.n f8264n;

    /* renamed from: o, reason: collision with root package name */
    public final g2.m0 f8265o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f8266p;

    /* renamed from: q, reason: collision with root package name */
    public final List<m> f8267q;

    /* renamed from: r, reason: collision with root package name */
    public final List<m> f8268r;

    /* renamed from: s, reason: collision with root package name */
    public final ph.i0 f8269s;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ o0(int i10, int i11, int i12, int i13, int i14, int i15, w.n nVar, g2.m0 m0Var, ph.i0 i0Var) {
        v.t0 t0Var = v.t0.f30084b;
        qg.z zVar = qg.z.f22752a;
        this(zVar, i10, i11, i12, t0Var, i13, i14, i15, null, null, CropImageView.DEFAULT_ASPECT_RATIO, 0, false, nVar, m0Var, false, zVar, zVar, i0Var);
    }

    @Override // g2.m0
    public final int a() {
        return this.f8265o.a();
    }

    @Override // e0.c0
    public final long b() {
        g2.m0 m0Var = this.f8265o;
        return (m0Var.a() << 32) | (m0Var.getHeight() & BodyPartID.bodyIdMax);
    }

    @Override // e0.c0
    public final int c() {
        return this.f8254d;
    }

    @Override // e0.c0
    public final int d() {
        return -this.f8256f;
    }

    @Override // e0.c0
    public final boolean e() {
        return false;
    }

    @Override // e0.c0
    public final List<m> f() {
        return this.f8251a;
    }

    @Override // e0.c0
    public final int g() {
        return this.f8252b;
    }

    @Override // g2.m0
    public final int getHeight() {
        return this.f8265o.getHeight();
    }

    @Override // e0.c0
    public final v.t0 getOrientation() {
        return this.f8255e;
    }

    @Override // e0.c0
    public final int h() {
        return this.f8253c;
    }

    @Override // e0.c0
    public final w.n i() {
        return this.f8264n;
    }

    public final o0 j(int i10) {
        int i11;
        int i12 = this.f8252b + this.f8253c;
        if (this.f8266p) {
            return null;
        }
        List<m> list = this.f8251a;
        if (list.isEmpty() || this.f8259i == null || (i11 = this.f8262l - i10) < 0 || i11 >= i12) {
            return null;
        }
        float f10 = this.f8261k - (i12 != 0 ? i10 / i12 : CropImageView.DEFAULT_ASPECT_RATIO);
        if (this.f8260j == null || f10 >= 0.5f || f10 <= -0.5f) {
            return null;
        }
        m mVar = (m) qg.x.B(list);
        m mVar2 = (m) qg.x.J(list);
        int i13 = this.f8257g;
        int i14 = this.f8256f;
        if (i10 < 0) {
            if (Math.min((mVar.f8233l + i12) - i14, (mVar2.f8233l + i12) - i13) <= (-i10)) {
                return null;
            }
        } else if (Math.min(i14 - mVar.f8233l, i13 - mVar2.f8233l) <= i10) {
            return null;
        }
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            list.get(i15).a(i10);
        }
        List<m> list2 = this.f8267q;
        int size2 = list2.size();
        for (int i16 = 0; i16 < size2; i16++) {
            list2.get(i16).a(i10);
        }
        List<m> list3 = this.f8268r;
        int size3 = list3.size();
        for (int i17 = 0; i17 < size3; i17++) {
            list3.get(i17).a(i10);
        }
        return new o0(this.f8251a, this.f8252b, this.f8253c, this.f8254d, this.f8255e, this.f8256f, this.f8257g, this.f8258h, this.f8259i, this.f8260j, f10, i11, this.f8263m || i10 > 0, this.f8264n, this.f8265o, this.f8266p, this.f8267q, this.f8268r, this.f8269s);
    }

    @Override // g2.m0
    public final Map<g2.a, Integer> r() {
        return this.f8265o.r();
    }

    @Override // g2.m0
    public final void s() {
        this.f8265o.s();
    }

    @Override // g2.m0
    public final eh.l<Object, pg.f0> t() {
        return this.f8265o.t();
    }

    public o0(List list, int i10, int i11, int i12, v.t0 t0Var, int i13, int i14, int i15, m mVar, m mVar2, float f10, int i16, boolean z10, w.n nVar, g2.m0 m0Var, boolean z11, List list2, List list3, ph.i0 i0Var) {
        this.f8251a = list;
        this.f8252b = i10;
        this.f8253c = i11;
        this.f8254d = i12;
        this.f8255e = t0Var;
        this.f8256f = i13;
        this.f8257g = i14;
        this.f8258h = i15;
        this.f8259i = mVar;
        this.f8260j = mVar2;
        this.f8261k = f10;
        this.f8262l = i16;
        this.f8263m = z10;
        this.f8264n = nVar;
        this.f8265o = m0Var;
        this.f8266p = z11;
        this.f8267q = list2;
        this.f8268r = list3;
        this.f8269s = i0Var;
    }
}
