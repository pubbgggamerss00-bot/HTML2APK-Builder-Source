package v;

@vg.e(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$untilNull$1", f = "MouseWheelScrollable.kt", l = {179}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class o0 extends vg.h implements eh.p<lh.i<Object>, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public Object f30009a;

    /* renamed from: b, reason: collision with root package name */
    public int f30010b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f30011c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0 f30012d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(n0 n0Var, tg.e eVar) {
        super(2, eVar);
        this.f30012d = n0Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        o0 o0Var = new o0(this.f30012d, eVar);
        o0Var.f30011c = obj;
        return o0Var;
    }

    @Override // eh.p
    public final Object invoke(lh.i<Object> iVar, tg.e<? super pg.f0> eVar) {
        return ((o0) create(iVar, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0037 -> B:14:0x0038). Please report as a decompilation issue!!! */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        lh.i iVar;
        Object objInvoke;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f30010b;
        if (i10 == 0) {
            pg.q.b(obj);
            iVar = (lh.i) this.f30011c;
            objInvoke = this.f30012d.invoke();
            if (objInvoke != null) {
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj2 = this.f30009a;
            iVar = (lh.i) this.f30011c;
            pg.q.b(obj);
            if (obj2 == null) {
                return pg.f0.f21461a;
            }
            objInvoke = this.f30012d.invoke();
            if (objInvoke != null) {
                this.f30011c = iVar;
                this.f30009a = objInvoke;
                this.f30010b = 1;
                iVar.c(objInvoke, this);
                ug.a aVar2 = ug.a.f29706a;
                return aVar;
            }
            obj2 = null;
            if (obj2 == null) {
            }
            objInvoke = this.f30012d.invoke();
            if (objInvoke != null) {
            }
        }
    }
}
