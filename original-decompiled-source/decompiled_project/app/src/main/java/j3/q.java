package j3;

import j2.y2;
import j2.z2;
import x0.f1;

@vg.e(c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1", f = "AndroidPopup.android.kt", l = {371}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class q extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f15107a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f15108b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0 f15109c;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<Long, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15110a = new a(1);

        @Override // eh.l
        public final /* bridge */ /* synthetic */ pg.f0 invoke(Long l10) {
            l10.longValue();
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(g0 g0Var, tg.e<? super q> eVar) {
        super(2, eVar);
        this.f15109c = g0Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        q qVar = new q(this.f15109c, eVar);
        qVar.f15108b = obj;
        return qVar;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((q) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        if (r9.M() == r0) goto L16;
     */
    /* JADX WARN: Path cross not found for [B:19:0x0067, B:21:0x006b], limit reached: 25 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ph.i0 i0Var;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f15107a;
        if (i10 == 0) {
            pg.q.b(obj);
            i0Var = (ph.i0) this.f15108b;
            if (ph.j0.d(i0Var)) {
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i0Var = (ph.i0) this.f15108b;
            pg.q.b(obj);
            g0 g0Var = this.f15109c;
            int[] iArr = g0Var.D;
            int i11 = iArr[0];
            int i12 = iArr[1];
            g0Var.f15061m.getLocationOnScreen(iArr);
            if (i11 == iArr[0] || i12 != iArr[1]) {
                g0Var.m();
            }
            if (ph.j0.d(i0Var)) {
                this.f15108b = i0Var;
                this.f15107a = 1;
                y2 y2Var = (y2) getContext().get(y2.a.f14991a);
                a aVar2 = a.f15110a;
                if (y2Var != null) {
                    new z2(aVar2, null);
                } else if (f1.a(getContext()).f0(aVar2, this) == aVar) {
                    return aVar;
                }
                g0 g0Var2 = this.f15109c;
                int[] iArr2 = g0Var2.D;
                int i112 = iArr2[0];
                int i122 = iArr2[1];
                g0Var2.f15061m.getLocationOnScreen(iArr2);
                if (i112 == iArr2[0]) {
                }
                g0Var2.m();
                if (ph.j0.d(i0Var)) {
                    return pg.f0.f21461a;
                }
            }
        }
    }
}
