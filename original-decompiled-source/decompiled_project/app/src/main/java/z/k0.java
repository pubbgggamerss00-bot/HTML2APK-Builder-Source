package z;

import com.yalantis.ucrop.view.CropImageView;
import g2.g1;

/* loaded from: classes.dex */
public final class k0 extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int[] f34569a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f34570b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f34571c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f34572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g2.g1[] f34573e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l0 f34574f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f34575g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f3.r f34576h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int[] f34577j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(int[] iArr, int i10, int i11, int i12, g2.g1[] g1VarArr, l0 l0Var, int i13, f3.r rVar, int[] iArr2) {
        super(1);
        this.f34569a = iArr;
        this.f34570b = i10;
        this.f34571c = i11;
        this.f34572d = i12;
        this.f34573e = g1VarArr;
        this.f34574f = l0Var;
        this.f34575g = i13;
        this.f34576h = rVar;
        this.f34577j = iArr2;
    }

    @Override // eh.l
    public final pg.f0 invoke(g1.a aVar) {
        v vVarK;
        g1.a aVar2 = aVar;
        int[] iArr = this.f34569a;
        int i10 = iArr != null ? iArr[this.f34570b] : 0;
        int i11 = this.f34571c;
        for (int i12 = i11; i12 < this.f34572d; i12++) {
            g2.g1 g1Var = this.f34573e[i12];
            kotlin.jvm.internal.r.b(g1Var);
            l0 l0Var = this.f34574f;
            l0Var.getClass();
            Object objW = g1Var.w();
            j1 j1Var = objW instanceof j1 ? (j1) objW : null;
            if (j1Var == null || (vVarK = j1Var.f34559c) == null) {
                vVarK = l0Var.k();
            }
            int iA = vVarK.a(this.f34575g - l0Var.b(g1Var), this.f34576h) + i10;
            boolean zN = l0Var.n();
            int[] iArr2 = this.f34577j;
            if (zN) {
                aVar2.d(g1Var, iArr2[i12 - i11], iA, CropImageView.DEFAULT_ASPECT_RATIO);
            } else {
                aVar2.d(g1Var, iA, iArr2[i12 - i11], CropImageView.DEFAULT_ASPECT_RATIO);
            }
        }
        return pg.f0.f21461a;
    }
}
