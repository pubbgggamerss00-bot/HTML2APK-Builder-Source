package z;

import com.yalantis.ucrop.view.CropImageView;
import g2.g1;
import z.v;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g2.g1[] f34601a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f34602b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f34603c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g2.o0 f34604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int[] f34605e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(g2.g1[] g1VarArr, q qVar, int i10, g2.o0 o0Var, int[] iArr) {
        super(1);
        this.f34601a = g1VarArr;
        this.f34602b = qVar;
        this.f34603c = i10;
        this.f34604d = o0Var;
        this.f34605e = iArr;
    }

    @Override // eh.l
    public final pg.f0 invoke(g1.a aVar) {
        g1.a aVar2 = aVar;
        g2.g1[] g1VarArr = this.f34601a;
        int length = g1VarArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            g2.g1 g1Var = g1VarArr[i10];
            int i12 = i11 + 1;
            kotlin.jvm.internal.r.b(g1Var);
            Object objW = g1Var.w();
            j1 j1Var = objW instanceof j1 ? (j1) objW : null;
            f3.r layoutDirection = this.f34604d.getLayoutDirection();
            v.c cVar = j1Var != null ? j1Var.f34559c : null;
            int i13 = this.f34603c;
            aVar2.d(g1Var, cVar != null ? cVar.a(i13 - g1Var.f11382a, layoutDirection) : this.f34602b.f34614b.a(0, i13 - g1Var.f11382a, layoutDirection), this.f34605e[i11], CropImageView.DEFAULT_ASPECT_RATIO);
            i10++;
            i11 = i12;
        }
        return pg.f0.f21461a;
    }
}
