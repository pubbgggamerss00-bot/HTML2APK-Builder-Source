package t0;

import com.yalantis.ucrop.view.CropImageView;
import g2.g1;

/* loaded from: classes.dex */
public final class r8 extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g2.g1 f26870a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f26871b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f26872c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g2.g1 f26873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f26874e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f26875f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f26876g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g2.g1 f26877h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f26878j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f26879k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g2.g1 f26880l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f26881m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f26882n;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f26883p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ g2.o0 f26884q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8(g2.g1 g1Var, boolean z10, float f10, g2.g1 g1Var2, int i10, float f11, float f12, g2.g1 g1Var3, int i11, float f13, g2.g1 g1Var4, int i12, float f14, int i13, g2.o0 o0Var) {
        super(1);
        this.f26870a = g1Var;
        this.f26871b = z10;
        this.f26872c = f10;
        this.f26873d = g1Var2;
        this.f26874e = i10;
        this.f26875f = f11;
        this.f26876g = f12;
        this.f26877h = g1Var3;
        this.f26878j = i11;
        this.f26879k = f13;
        this.f26880l = g1Var4;
        this.f26881m = i12;
        this.f26882n = f14;
        this.f26883p = i13;
        this.f26884q = o0Var;
    }

    @Override // eh.l
    public final pg.f0 invoke(g1.a aVar) {
        g1.a aVar2 = aVar;
        float f10 = this.f26879k;
        float f11 = this.f26876g;
        g2.g1 g1Var = this.f26870a;
        if (g1Var != null) {
            g1.a.g(aVar2, g1Var, (this.f26883p - g1Var.f11382a) / 2, gh.a.b((f10 - this.f26884q.b1(s8.f26948e)) + f11));
        }
        if (this.f26871b || this.f26872c != CropImageView.DEFAULT_ASPECT_RATIO) {
            g1.a.g(aVar2, this.f26873d, this.f26874e, gh.a.b(this.f26875f + f11));
        }
        g1.a.g(aVar2, this.f26877h, this.f26878j, gh.a.b(f10 + f11));
        g1.a.g(aVar2, this.f26880l, this.f26881m, gh.a.b(this.f26882n + f11));
        return pg.f0.f21461a;
    }
}
