package t8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;
import pg.p;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.ai.AiHistoryViewModel$load$1", f = "AiHistoryScreen.kt", l = {HeaderItem.METHOD_COUNT_OFFSET}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class p0 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f28378a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f28379b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q0 f28380c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(q0 q0Var, tg.e<? super p0> eVar) {
        super(2, eVar);
        this.f28380c = q0Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        p0 p0Var = new p0(this.f28380c, eVar);
        p0Var.f28379b = obj;
        return p0Var;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((p0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objH;
        q0 q0Var = this.f28380c;
        sh.z0 z0Var = q0Var.f28405d;
        sh.z0 z0Var2 = q0Var.f28407f;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f28378a;
        try {
            if (i10 == 0) {
                pg.q.b(obj);
                Boolean bool = Boolean.FALSE;
                z0Var2.getClass();
                z0Var2.j(null, bool);
                g8.p pVar = q0Var.f28403b;
                this.f28378a = 1;
                objH = pVar.h(this);
                if (objH == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                objH = obj;
            }
            objA = (List) objH;
        } catch (Throwable th2) {
            objA = pg.q.a(th2);
        }
        if (!(objA instanceof p.a)) {
            List<Map> list = (List) objA;
            ArrayList arrayList = new ArrayList(qg.p.h(list, 10));
            for (Map map : list) {
                Object obj2 = map.get("id");
                kotlin.jvm.internal.r.c(obj2, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj2;
                Object obj3 = map.get("title");
                String str2 = obj3 instanceof String ? (String) obj3 : null;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = str2;
                Object obj4 = map.get("updatedAt");
                Number number = obj4 instanceof Number ? (Number) obj4 : null;
                long jLongValue = number != null ? number.longValue() : 0L;
                Object obj5 = map.get("turnCount");
                Number number2 = obj5 instanceof Number ? (Number) obj5 : null;
                arrayList.add(new x(str, str3, jLongValue, number2 != null ? number2.intValue() : 0, q0Var.f28404c.g(str)));
            }
            z0Var.getClass();
            z0Var.j(null, arrayList);
        }
        if (pg.p.a(objA) != null) {
            Boolean bool2 = Boolean.TRUE;
            z0Var2.getClass();
            z0Var2.j(null, bool2);
            Object obj6 = (List) z0Var.getValue();
            if (obj6 == null) {
                obj6 = qg.z.f22752a;
            }
            z0Var.getClass();
            z0Var.j(null, obj6);
        }
        return pg.f0.f21461a;
    }
}
