package u8;

import java.util.ListIterator;
import x0.v1;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.catgame.CatGameScreenKt$FarmStage$2$5$1", f = "CatGameScreen.kt", l = {936}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class q0 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f29511a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f29512b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h1.u<f1> f29513c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(h1.u<f1> uVar, tg.e<? super q0> eVar) {
        super(2, eVar);
        this.f29513c = uVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        q0 q0Var = new q0(this.f29513c, eVar);
        q0Var.f29512b = obj;
        return q0Var;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((q0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0021 A[EDGE_INSN: B:34:0x0021->B:9:0x0021 BREAK  A[LOOP:0: B:15:0x003a->B:31:0x0080], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0031 -> B:14:0x0034). Please report as a decompilation issue!!! */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ph.i0 i0Var;
        ListIterator<f1> listIterator;
        h1.c0 c0Var;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f29511a;
        if (i10 == 0) {
            pg.q.b(obj);
            i0Var = (ph.i0) this.f29512b;
            if (!ph.j0.d(i0Var)) {
                return pg.f0.f21461a;
            }
            this.f29512b = i0Var;
            this.f29511a = 1;
            if (ph.t0.b(150L, this) == aVar) {
                return aVar;
            }
            listIterator = this.f29513c.listIterator();
            while (true) {
                c0Var = (h1.c0) listIterator;
                if (c0Var.hasNext()) {
                }
                v1Var.f((v1Var.g() + 1) % 12);
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i0Var = (ph.i0) this.f29512b;
            pg.q.b(obj);
            listIterator = this.f29513c.listIterator();
            while (true) {
                c0Var = (h1.c0) listIterator;
                if (c0Var.hasNext()) {
                    break;
                }
                f1 f1Var = (f1) c0Var.next();
                a aVarA = f1Var.a();
                v1 v1Var = f1Var.f29458j;
                v1 v1Var2 = f1Var.f29456h;
                int iOrdinal = aVarA.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                        throw new pg.l();
                    }
                    if (v1Var.g() > 0) {
                        int iG = v1Var.g();
                        v1Var.f(iG - 1);
                        i.a.a(iG);
                    } else {
                        f1Var.f29455g.setValue(a.f29388a);
                    }
                }
                v1Var2.f((v1Var2.g() + 1) % 12);
            }
        }
    }
}
