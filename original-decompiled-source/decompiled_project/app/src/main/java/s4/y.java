package s4;

@vg.e(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2", f = "DataStoreImpl.kt", l = {370, 371}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class y extends vg.i implements eh.p<Boolean, tg.e<? super d<Object>>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public Object f24427a;

    /* renamed from: b, reason: collision with root package name */
    public int f24428b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ boolean f24429c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m<Object> f24430d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f24431e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(m<Object> mVar, int i10, tg.e<? super y> eVar) {
        super(2, eVar);
        this.f24430d = mVar;
        this.f24431e = i10;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        y yVar = new y(this.f24430d, this.f24431e, eVar);
        yVar.f24429c = ((Boolean) obj).booleanValue();
        return yVar;
    }

    @Override // eh.p
    public final Object invoke(Boolean bool, tg.e<? super d<Object>> eVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((y) create(bool2, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        Object obj2;
        int iIntValue;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f24428b;
        m<Object> mVar = this.f24430d;
        if (i10 == 0) {
            pg.q.b(obj);
            z10 = this.f24429c;
            this.f24429c = z10;
            this.f24428b = 1;
            obj = mVar.i(this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = this.f24427a;
            pg.q.b(obj);
            iIntValue = ((Number) obj).intValue();
            return new d(obj2, obj2 != null ? obj2.hashCode() : 0, iIntValue);
        }
        z10 = this.f24429c;
        pg.q.b(obj);
        if (!z10) {
            obj2 = obj;
            iIntValue = this.f24431e;
            return new d(obj2, obj2 != null ? obj2.hashCode() : 0, iIntValue);
        }
        v0 v0VarG = mVar.g();
        this.f24427a = obj;
        this.f24428b = 2;
        Integer version = v0VarG.getVersion();
        if (version != aVar) {
            obj2 = obj;
            obj = version;
            iIntValue = ((Number) obj).intValue();
            return new d(obj2, obj2 != null ? obj2.hashCode() : 0, iIntValue);
        }
        return aVar;
    }
}
