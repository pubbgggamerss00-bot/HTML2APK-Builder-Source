package i0;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import j2.c3;
import org.bouncycastle.asn1.cmc.BodyPartID;
import x0.j;

/* loaded from: classes.dex */
public final class b1 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i2 f13157a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t2.l0 f13158b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13159c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f4 f13161e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y2.c0 f13162f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y2.q0 f13163g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d f13164h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d f13165j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d f13166k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d f13167l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f0.a f13168m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m0.x2 f13169n;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f13170p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f13171q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ eh.l<t2.h0, pg.f0> f13172r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y2.v f13173s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f3.d f13174t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b1(i2 i2Var, t2.l0 l0Var, int i10, int i11, f4 f4Var, y2.c0 c0Var, y2.q0 q0Var, androidx.compose.ui.d dVar, androidx.compose.ui.d dVar2, androidx.compose.ui.d dVar3, androidx.compose.ui.d dVar4, f0.a aVar, m0.x2 x2Var, boolean z10, boolean z11, eh.l<? super t2.h0, pg.f0> lVar, y2.v vVar, f3.d dVar5) {
        super(2);
        this.f13157a = i2Var;
        this.f13158b = l0Var;
        this.f13159c = i10;
        this.f13160d = i11;
        this.f13161e = f4Var;
        this.f13162f = c0Var;
        this.f13163g = q0Var;
        this.f13164h = dVar;
        this.f13165j = dVar2;
        this.f13166k = dVar3;
        this.f13167l = dVar4;
        this.f13168m = aVar;
        this.f13169n = x2Var;
        this.f13170p = z10;
        this.f13171q = z11;
        this.f13172r = lVar;
        this.f13173s = vVar;
        this.f13174t = dVar5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        int iE;
        androidx.compose.ui.d b5Var;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        if (jVar2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            i2 i2Var = this.f13157a;
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.g.h(d.a.f1143b, ((f3.h) i2Var.f13343g.getValue()).f8817a, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            c3.a aVar = j2.c3.f14686a;
            int i10 = this.f13159c;
            int i11 = this.f13160d;
            t2.l0 l0Var = this.f13158b;
            androidx.compose.ui.d dVarA = androidx.compose.ui.c.a(dVarH, aVar, new w1(i10, i11, l0Var));
            boolean zL = jVar2.l(i2Var);
            Object objG = jVar2.g();
            if (zL || objG == j.a.f31715a) {
                objG = new a1(i2Var);
                jVar2.C(objG);
            }
            eh.a aVar2 = (eh.a) objG;
            f4 f4Var = this.f13161e;
            v.t0 t0Var = (v.t0) f4Var.f13286f.getValue();
            y2.c0 c0Var = this.f13162f;
            long j10 = c0Var.f33683b;
            int i12 = t2.j0.f27838c;
            int i13 = (int) (j10 >> 32);
            long j11 = f4Var.f13285e;
            if (i13 != ((int) (j11 >> 32))) {
                iE = i13;
            } else {
                int i14 = (int) (j10 & BodyPartID.bodyIdMax);
                iE = i14 != ((int) (j11 & BodyPartID.bodyIdMax)) ? i14 : t2.j0.e(j10);
            }
            f4Var.f13285e = c0Var.f33683b;
            y2.o0 o0VarA = a5.a(this.f13163g, c0Var.f33682a);
            int iOrdinal = t0Var.ordinal();
            if (iOrdinal == 0) {
                b5Var = new b5(f4Var, iE, o0VarA, aVar2);
            } else {
                if (iOrdinal != 1) {
                    throw new pg.l();
                }
                b5Var = new y1(f4Var, iE, o0VarA, aVar2);
            }
            m0.q2.a(androidx.compose.foundation.relocation.a.a(androidx.compose.ui.c.a(e1.d.e(dVarA).h(b5Var).h(this.f13164h).h(this.f13165j), aVar, new j4(l0Var)).h(this.f13166k).h(this.f13167l), this.f13168m), f1.c.b(-1172467467, new z0(this.f13169n, i2Var, this.f13170p, this.f13171q, this.f13172r, this.f13162f, this.f13173s, this.f13174t, this.f13160d), jVar2), jVar2, 48);
        } else {
            jVar2.v();
        }
        return pg.f0.f21461a;
    }
}
