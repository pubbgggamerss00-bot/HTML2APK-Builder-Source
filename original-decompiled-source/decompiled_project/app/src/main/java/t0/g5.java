package t0;

import com.yalantis.ucrop.view.CropImageView;
import g2.g1;

/* loaded from: classes.dex */
public final class g5 extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g2.g1 f25916a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g2.g1 f25917b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f25918c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f25919d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f25920e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g2.g1 f25921f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g2.g1 f25922g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g2.g1 f25923h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f25924j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f25925k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f25926l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(g2.g1 g1Var, g2.g1 g1Var2, int i10, boolean z10, int i11, g2.g1 g1Var3, g2.g1 g1Var4, g2.g1 g1Var5, int i12, int i13, int i14) {
        super(1);
        this.f25916a = g1Var;
        this.f25917b = g1Var2;
        this.f25918c = i10;
        this.f25919d = z10;
        this.f25920e = i11;
        this.f25921f = g1Var3;
        this.f25922g = g1Var4;
        this.f25923h = g1Var5;
        this.f25924j = i12;
        this.f25925k = i13;
        this.f25926l = i14;
    }

    @Override // eh.l
    public final pg.f0 invoke(g1.a aVar) {
        g1.a aVar2 = aVar;
        int i10 = this.f25918c;
        int i11 = this.f25924j;
        int iA = this.f25920e;
        boolean z10 = this.f25919d;
        g2.g1 g1Var = this.f25916a;
        if (g1Var != null) {
            g1.a.g(aVar2, g1Var, i10, z10 ? iA : org.bouncycastle.asn1.x509.a.a(1, CropImageView.DEFAULT_ASPECT_RATIO, (i11 - g1Var.f11383b) / 2.0f));
        }
        g2.g1 g1Var2 = this.f25917b;
        if (g1Var2 != null) {
            g1.a.g(aVar2, g1Var2, (this.f25925k - this.f25926l) - g1Var2.f11382a, z10 ? iA : org.bouncycastle.asn1.x509.a.a(1, CropImageView.DEFAULT_ASPECT_RATIO, (i11 - g1Var2.f11383b) / 2.0f));
        }
        float f10 = u0.t1.f29148b;
        int i12 = i10 + (g1Var != null ? g1Var.f11382a : 0);
        g2.g1 g1Var3 = this.f25923h;
        g2.g1 g1Var4 = this.f25922g;
        g2.g1 g1Var5 = this.f25921f;
        if (!z10) {
            iA = org.bouncycastle.asn1.x509.a.a(1, CropImageView.DEFAULT_ASPECT_RATIO, (i11 - (((g1Var5 != null ? g1Var5.f11383b : 0) + (g1Var4 != null ? g1Var4.f11383b : 0)) + (g1Var3 != null ? g1Var3.f11383b : 0))) / 2.0f);
        }
        if (g1Var4 != null) {
            g1.a.g(aVar2, g1Var4, i12, iA);
        }
        int i13 = iA + (g1Var4 != null ? g1Var4.f11383b : 0);
        if (g1Var5 != null) {
            g1.a.g(aVar2, g1Var5, i12, i13);
        }
        int i14 = i13 + (g1Var5 != null ? g1Var5.f11383b : 0);
        if (g1Var3 != null) {
            g1.a.g(aVar2, g1Var3, i12, i14);
        }
        return pg.f0.f21461a;
    }
}
