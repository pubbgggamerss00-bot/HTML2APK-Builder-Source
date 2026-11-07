package s4;

import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;

@vg.e(c = "androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3", f = "DataStoreImpl.kt", l = {DilithiumEngine.DilithiumPolyT0PackedBytes}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class p extends vg.i implements eh.l<tg.e<Object>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f24359a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f24360b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(z zVar, tg.e eVar) {
        super(1, eVar);
        this.f24360b = zVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(tg.e<?> eVar) {
        return new p(this.f24360b, eVar);
    }

    @Override // eh.l
    public final Object invoke(tg.e<Object> eVar) {
        return ((p) create(eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f24359a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return obj;
        }
        pg.q.b(obj);
        this.f24359a = 1;
        Object objInvoke = this.f24360b.invoke(this);
        return objInvoke == aVar ? aVar : objInvoke;
    }
}
