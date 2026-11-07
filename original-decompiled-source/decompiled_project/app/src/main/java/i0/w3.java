package i0;

import androidx.compose.ui.d;
import x0.j;

/* loaded from: classes.dex */
public final class w3 extends kotlin.jvm.internal.s implements eh.q<androidx.compose.ui.d, x0.j, Integer, androidx.compose.ui.d> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i2 f13659a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0.x2 f13660b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y2.c0 f13661c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f13662d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f13663e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y2.v f13664f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y4 f13665g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ eh.l<y2.c0, pg.f0> f13666h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f13667j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w3(i2 i2Var, m0.x2 x2Var, y2.c0 c0Var, boolean z10, boolean z11, y2.v vVar, y4 y4Var, eh.l<? super y2.c0, pg.f0> lVar, int i10) {
        super(3);
        this.f13659a = i2Var;
        this.f13660b = x2Var;
        this.f13661c = c0Var;
        this.f13662d = z10;
        this.f13663e = z11;
        this.f13664f = vVar;
        this.f13665g = y4Var;
        this.f13666h = lVar;
        this.f13667j = i10;
    }

    @Override // eh.q
    public final androidx.compose.ui.d b(androidx.compose.ui.d dVar, x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        num.intValue();
        jVar2.L(851809892);
        Object objG = jVar2.g();
        j.a.C0321a c0321a = j.a.f31715a;
        if (objG == c0321a) {
            objG = new m0.p3();
            jVar2.C(objG);
        }
        m0.p3 p3Var = (m0.p3) objG;
        Object objG2 = jVar2.g();
        if (objG2 == c0321a) {
            objG2 = new s1();
            jVar2.C(objG2);
        }
        eh.l<y2.c0, pg.f0> lVar = this.f13666h;
        int i10 = this.f13667j;
        u3 u3Var = new u3(this.f13659a, this.f13660b, this.f13661c, this.f13662d, this.f13663e, p3Var, this.f13664f, this.f13665g, (s1) objG2, lVar, i10);
        boolean zL = jVar2.l(u3Var);
        Object objG3 = jVar2.g();
        if (zL || objG3 == c0321a) {
            v3 v3Var = new v3(1, u3Var, u3.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
            jVar2.C(v3Var);
            objG3 = v3Var;
        }
        androidx.compose.ui.d dVarA = androidx.compose.ui.input.key.a.a(d.a.f1143b, (eh.l) ((kh.e) objG3));
        jVar2.B();
        return dVarA;
    }
}
