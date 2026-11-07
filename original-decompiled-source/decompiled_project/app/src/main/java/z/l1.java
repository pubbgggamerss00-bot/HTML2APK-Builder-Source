package z;

import com.yalantis.ucrop.view.CropImageView;
import g2.g1;
import z.v;

/* loaded from: classes.dex */
public final class l1 extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g2.g1[] f34584a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m1 f34585b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f34586c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int[] f34587d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(g2.g1[] g1VarArr, m1 m1Var, int i10, int[] iArr) {
        super(1);
        this.f34584a = g1VarArr;
        this.f34585b = m1Var;
        this.f34586c = i10;
        this.f34587d = iArr;
    }

    @Override // eh.l
    public final pg.f0 invoke(g1.a aVar) {
        g1.a aVar2 = aVar;
        g2.g1[] g1VarArr = this.f34584a;
        int length = g1VarArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            g2.g1 g1Var = g1VarArr[i10];
            int i12 = i11 + 1;
            kotlin.jvm.internal.r.b(g1Var);
            Object objW = g1Var.w();
            j1 j1Var = objW instanceof j1 ? (j1) objW : null;
            v.c cVar = j1Var != null ? j1Var.f34559c : null;
            int i13 = this.f34586c;
            aVar2.d(g1Var, this.f34587d[i11], cVar != null ? cVar.a(i13 - g1Var.f11383b, f3.r.f8828a) : this.f34585b.f34597b.a(0, i13 - g1Var.f11383b), CropImageView.DEFAULT_ASPECT_RATIO);
            i10++;
            i11 = i12;
        }
        return pg.f0.f21461a;
    }
}
