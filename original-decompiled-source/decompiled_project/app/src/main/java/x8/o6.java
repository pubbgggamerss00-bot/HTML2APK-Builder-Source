package x8;

import java.util.List;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$createFolder$1", f = "HomeViewModel.kt", l = {374, 375}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class o6 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f33051a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j6 f33052b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f33053c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<Long> f33054d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(j6 j6Var, String str, List<Long> list, tg.e<? super o6> eVar) {
        super(2, eVar);
        this.f33052b = j6Var;
        this.f33053c = str;
        this.f33054d = list;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new o6(this.f33052b, this.f33053c, this.f33054d, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((o6) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r7 == r1) goto L20;
     */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        n8.i iVar = this.f33052b.f32779f;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f33051a;
        if (i10 == 0) {
            pg.q.b(obj);
            this.f33051a = 1;
            obj = iVar.a(this.f33053c, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return pg.f0.f21461a;
        }
        pg.q.b(obj);
        long jLongValue = ((Number) obj).longValue();
        List<Long> list = this.f33054d;
        if (!list.isEmpty()) {
            Long l10 = new Long(jLongValue);
            this.f33051a = 2;
            Object objMoveToFolder = iVar.f18470b.moveToFolder(list, l10, this);
            if (objMoveToFolder != aVar) {
                objMoveToFolder = pg.f0.f21461a;
            }
        }
        return pg.f0.f21461a;
    }
}
