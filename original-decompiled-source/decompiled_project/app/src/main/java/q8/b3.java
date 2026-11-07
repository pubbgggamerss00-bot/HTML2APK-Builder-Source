package q8;

import java.util.List;

@vg.e(c = "com.basitce.htmltoapk.ui.components.WalkingPixelCatKt$WalkingPixelCat$1$3$1", f = "WalkingPixelCat.kt", l = {204}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class b3 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public List f22122a;

    /* renamed from: b, reason: collision with root package name */
    public long f22123b;

    /* renamed from: c, reason: collision with root package name */
    public int f22124c;

    /* renamed from: d, reason: collision with root package name */
    public int f22125d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f22126e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<Integer> f22127f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List<Integer> f22128g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ List<Integer> f22129h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List<Integer> f22130j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ x0.n1<k> f22131k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x0.l1 f22132l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(List<Integer> list, List<Integer> list2, List<Integer> list3, List<Integer> list4, x0.n1<k> n1Var, x0.l1 l1Var, tg.e<? super b3> eVar) {
        super(2, eVar);
        this.f22127f = list;
        this.f22128g = list2;
        this.f22129h = list3;
        this.f22130j = list4;
        this.f22131k = n1Var;
        this.f22132l = l1Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        b3 b3Var = new b3(this.f22127f, this.f22128g, this.f22129h, this.f22130j, this.f22131k, this.f22132l, eVar);
        b3Var.f22126e = obj;
        return b3Var;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((b3) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        List<Integer> list;
        long j10;
        int i10;
        List<Integer> list2;
        long j11;
        ph.i0 i0Var;
        ug.a aVar = ug.a.f29706a;
        int i11 = this.f22125d;
        if (i11 == 0) {
            pg.q.b(obj);
            ph.i0 i0Var2 = (ph.i0) this.f22126e;
            x0.n1<k> n1Var = this.f22131k;
            int iOrdinal = n1Var.getValue().ordinal();
            if (iOrdinal == 0) {
                list = this.f22127f;
            } else if (iOrdinal == 1) {
                list = this.f22128g;
            } else if (iOrdinal == 2) {
                list = this.f22129h;
            } else {
                if (iOrdinal != 3) {
                    throw new pg.l();
                }
                list = this.f22130j;
            }
            int iOrdinal2 = n1Var.getValue().ordinal();
            if (iOrdinal2 == 0) {
                j10 = 120;
            } else if (iOrdinal2 == 1) {
                j10 = 250;
            } else if (iOrdinal2 == 2) {
                j10 = 95;
            } else {
                if (iOrdinal2 != 3) {
                    throw new pg.l();
                }
                j10 = 160;
            }
            i10 = 0;
            list2 = list;
            j11 = j10;
            i0Var = i0Var2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.f22124c;
            j11 = this.f22123b;
            list2 = this.f22122a;
            i0Var = (ph.i0) this.f22126e;
            pg.q.b(obj);
        }
        while (ph.j0.d(i0Var)) {
            this.f22132l.f(i10 % list2.size());
            i10++;
            this.f22126e = i0Var;
            this.f22122a = list2;
            this.f22123b = j11;
            this.f22124c = i10;
            this.f22125d = 1;
            if (ph.t0.b(j11, this) == aVar) {
                return aVar;
            }
        }
        return pg.f0.f21461a;
    }
}
