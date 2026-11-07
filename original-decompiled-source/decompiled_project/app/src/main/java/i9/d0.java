package i9;

import java.util.List;
import ph.i0;
import ph.j0;
import ph.t0;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.support.SupportThankYouOverlayKt$SupportThankYouOverlay$4$2$1$1", f = "SupportThankYouOverlay.kt", l = {407}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class d0 extends vg.i implements eh.p<i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public List f14302a;

    /* renamed from: b, reason: collision with root package name */
    public long f14303b;

    /* renamed from: c, reason: collision with root package name */
    public int f14304c;

    /* renamed from: d, reason: collision with root package name */
    public int f14305d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f14306e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f0 f14307f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k8.b f14308g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(f0 f0Var, k8.b bVar, tg.e<? super d0> eVar) {
        super(2, eVar);
        this.f14307f = f0Var;
        this.f14308g = bVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        d0 d0Var = new d0(this.f14307f, this.f14308g, eVar);
        d0Var.f14306e = obj;
        return d0Var;
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((d0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        List<Integer> list;
        long j10;
        int i10;
        i0 i0Var;
        ug.a aVar = ug.a.f29706a;
        int i11 = this.f14305d;
        f0 f0Var = this.f14307f;
        if (i11 == 0) {
            pg.q.b(obj);
            i0 i0Var2 = (i0) this.f14306e;
            int iOrdinal = f0Var.a().ordinal();
            k8.b bVar = this.f14308g;
            if (iOrdinal == 0) {
                list = bVar.f16067a;
            } else if (iOrdinal == 1) {
                list = bVar.f16068b;
            } else {
                if (iOrdinal != 2) {
                    throw new pg.l();
                }
                list = bVar.f16070d;
            }
            int iOrdinal2 = f0Var.a().ordinal();
            if (iOrdinal2 == 0) {
                j10 = 110;
            } else if (iOrdinal2 == 1) {
                j10 = 240;
            } else {
                if (iOrdinal2 != 2) {
                    throw new pg.l();
                }
                j10 = 160;
            }
            i10 = 0;
            i0Var = i0Var2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i12 = this.f14304c;
            j10 = this.f14303b;
            List<Integer> list2 = this.f14302a;
            i0Var = (i0) this.f14306e;
            pg.q.b(obj);
            i10 = i12;
            list = list2;
        }
        while (j0.d(i0Var)) {
            f0Var.f14334k.f(i10 % list.size());
            int i13 = i10 + 1;
            this.f14306e = i0Var;
            this.f14302a = list;
            this.f14303b = j10;
            this.f14304c = i13;
            this.f14305d = 1;
            if (t0.b(j10, this) == aVar) {
                return aVar;
            }
            i10 = i13;
        }
        return pg.f0.f21461a;
    }
}
