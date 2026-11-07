package t0;

import com.yalantis.ucrop.view.CropImageView;
import g2.g1;

/* loaded from: classes.dex */
public final class i9 extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g2.g1 f26089a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f26090b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f26091c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g2.g1 f26092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f26093e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f26094f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f26095g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g2.g1 f26096h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f26097j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f26098k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g2.g1 f26099l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f26100m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f26101n;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f26102p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ g2.o0 f26103q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9(g2.g1 g1Var, boolean z10, float f10, g2.g1 g1Var2, int i10, float f11, float f12, g2.g1 g1Var3, int i11, float f13, g2.g1 g1Var4, int i12, float f14, int i13, g2.o0 o0Var) {
        super(1);
        this.f26089a = g1Var;
        this.f26090b = z10;
        this.f26091c = f10;
        this.f26092d = g1Var2;
        this.f26093e = i10;
        this.f26094f = f11;
        this.f26095g = f12;
        this.f26096h = g1Var3;
        this.f26097j = i11;
        this.f26098k = f13;
        this.f26099l = g1Var4;
        this.f26100m = i12;
        this.f26101n = f14;
        this.f26102p = i13;
        this.f26103q = o0Var;
    }

    @Override // eh.l
    public final pg.f0 invoke(g1.a aVar) {
        g1.a aVar2 = aVar;
        float f10 = this.f26098k;
        float f11 = this.f26095g;
        g2.g1 g1Var = this.f26089a;
        if (g1Var != null) {
            g1.a.g(aVar2, g1Var, (this.f26102p - g1Var.f11382a) / 2, gh.a.b((f10 - this.f26103q.N0(j9.f26156f)) + f11));
        }
        if (this.f26090b || this.f26091c != CropImageView.DEFAULT_ASPECT_RATIO) {
            g1.a.g(aVar2, this.f26092d, this.f26093e, gh.a.b(this.f26094f + f11));
        }
        g1.a.g(aVar2, this.f26096h, this.f26097j, gh.a.b(f10 + f11));
        g1.a.g(aVar2, this.f26099l, this.f26100m, gh.a.b(this.f26101n + f11));
        return pg.f0.f21461a;
    }
}
