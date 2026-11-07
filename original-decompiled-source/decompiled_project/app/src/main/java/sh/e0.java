package sh;

import x8.h6;

@vg.e(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", f = "Zip.kt", l = {259, 258}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class e0 extends vg.i implements eh.q<g<Object>, Object[], tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f24974a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ g f24975b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f24976c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h6.b f24977d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(tg.e eVar, h6.b bVar) {
        super(3, eVar);
        this.f24977d = bVar;
    }

    @Override // eh.q
    public final Object b(g<Object> gVar, Object[] objArr, tg.e<? super pg.f0> eVar) {
        e0 e0Var = new e0(eVar, this.f24977d);
        e0Var.f24975b = gVar;
        e0Var.f24976c = objArr;
        return e0Var.invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007b, code lost:
    
        if (r1.c(r12, r11) == r0) goto L15;
     */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        g gVar;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f24974a;
        if (i10 == 0) {
            pg.q.b(obj);
            gVar = this.f24975b;
            Object[] objArr = this.f24976c;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            this.f24975b = gVar;
            this.f24974a = 1;
            h6.b bVar = this.f24977d;
            bVar.getClass();
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            int iIntValue = ((Number) obj3).intValue();
            boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
            long jLongValue = ((Number) obj5).longValue();
            h6.b bVar2 = new h6.b(bVar.f32727f, this);
            bVar2.f32722a = zBooleanValue;
            bVar2.f32723b = iIntValue;
            bVar2.f32724c = zBooleanValue2;
            bVar2.f32725d = jLongValue;
            bVar2.f32726e = (pg.n) obj6;
            obj = bVar2.invokeSuspend(pg.f0.f21461a);
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
        gVar = this.f24975b;
        pg.q.b(obj);
        this.f24975b = null;
        this.f24974a = 2;
    }
}
