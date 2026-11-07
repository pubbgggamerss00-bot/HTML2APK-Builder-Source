package t8;

import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.List;
import pg.p;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.ai.AiHistoryViewModel$delete$1", f = "AiHistoryScreen.kt", l = {112}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class o0 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f28358a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f28359b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ae.m f28360c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f28361d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q0 f28362e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(ae.m mVar, String str, q0 q0Var, tg.e<? super o0> eVar) {
        super(2, eVar);
        this.f28360c = mVar;
        this.f28361d = str;
        this.f28362e = q0Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        o0 o0Var = new o0(this.f28360c, this.f28361d, this.f28362e, eVar);
        o0Var.f28359b = obj;
        return o0Var;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((o0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        qg.z zVar;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f28358a;
        String str = this.f28361d;
        try {
            if (i10 == 0) {
                pg.q.b(obj);
                Task taskA = this.f28360c.a("deleteHistory").a(str != null ? qg.j0.b(new pg.n("sessionId", str)) : qg.a0.f22708a);
                this.f28358a = 1;
                obj = g8.c.a(taskA, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            objA = (ae.x) obj;
        } catch (Throwable th2) {
            objA = pg.q.a(th2);
        }
        boolean z10 = objA instanceof p.a;
        q0 q0Var = this.f28362e;
        if (!z10) {
            sh.z0 z0Var = q0Var.f28405d;
            if (str == null) {
                zVar = qg.z.f22752a;
            } else {
                List list = (List) z0Var.getValue();
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (!((x) obj2).f28557a.equals(str)) {
                            arrayList.add(obj2);
                        }
                    }
                    zVar = arrayList;
                } else {
                    zVar = null;
                }
            }
            z0Var.setValue(zVar);
        }
        if (pg.p.a(objA) != null) {
            sh.z0 z0Var2 = q0Var.f28407f;
            Boolean bool = Boolean.TRUE;
            z0Var2.getClass();
            z0Var2.j(null, bool);
        }
        return pg.f0.f21461a;
    }
}
