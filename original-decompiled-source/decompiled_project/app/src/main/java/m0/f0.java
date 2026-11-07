package m0;

import m0.z;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class f0 extends kotlin.jvm.internal.s implements eh.a<z.a> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f17315a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17316b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17317c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i1 f17318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f17319e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(y yVar, int i10, int i11, i1 i1Var, pg.j<Integer> jVar) {
        super(0);
        this.f17315a = yVar;
        this.f17316b = i10;
        this.f17317c = i11;
        this.f17318d = i1Var;
        this.f17319e = jVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, pg.j] */
    @Override // eh.a
    public final z.a invoke() {
        int iIntValue = ((Number) this.f17319e.getValue()).intValue();
        i1 i1Var = this.f17318d;
        boolean zA = i1Var.a();
        boolean z10 = i1Var.i() == n.f17423a;
        y yVar = this.f17315a;
        t2.h0 h0Var = yVar.f17579f;
        int i10 = this.f17316b;
        long j10 = h0Var.j(i10);
        t2.h0 h0Var2 = yVar.f17579f;
        t2.l lVar = h0Var2.f27820b;
        int i11 = t2.j0.f27838c;
        int iG = (int) (j10 >> 32);
        int iD = lVar.d(iG);
        int i12 = lVar.f27848f;
        if (iD != iIntValue) {
            iG = iIntValue >= i12 ? h0Var2.g(i12 - 1) : h0Var2.g(iIntValue);
        }
        int iC = (int) (j10 & BodyPartID.bodyIdMax);
        if (lVar.d(iC) != iIntValue) {
            iC = iIntValue >= i12 ? lVar.c(i12 - 1, false) : lVar.c(iIntValue, false);
        }
        int i13 = this.f17317c;
        if (iG == i13) {
            return yVar.a(iC);
        }
        if (iC == i13) {
            return yVar.a(iG);
        }
        if (!(zA ^ z10) ? i10 >= iG : i10 > iC) {
            iG = iC;
        }
        return yVar.a(iG);
    }
}
