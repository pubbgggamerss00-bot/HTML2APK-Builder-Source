package androidx.room;

import tg.h;

@vg.e(c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1", f = "RoomDatabase.android.kt", l = {2015}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class i0 extends vg.i implements eh.p<ph.i0, tg.e<Object>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f2986a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2987b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b6.e f2988c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(b6.e eVar, tg.e eVar2) {
        super(2, eVar2);
        this.f2988c = eVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        i0 i0Var = new i0(this.f2988c, eVar);
        i0Var.f2987b = obj;
        return i0Var;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<Object> eVar) {
        return ((i0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        p0 p0Var;
        Throwable th2;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f2986a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p0Var = (p0) this.f2987b;
            try {
                pg.q.b(obj);
                if (p0Var.f3045b.decrementAndGet() < 0) {
                    return obj;
                }
                throw new IllegalStateException("Transaction was never started or was already released.");
            } catch (Throwable th3) {
                th2 = th3;
                if (p0Var.f3045b.decrementAndGet() < 0) {
                    throw th2;
                }
                throw new IllegalStateException("Transaction was never started or was already released.");
            }
        }
        pg.q.b(obj);
        h.a aVar2 = ((ph.i0) this.f2987b).getCoroutineContext().get(p0.f3043c);
        kotlin.jvm.internal.r.b(aVar2);
        p0 p0Var2 = (p0) aVar2;
        p0Var2.f3045b.incrementAndGet();
        try {
            b6.e eVar = this.f2988c;
            this.f2987b = p0Var2;
            this.f2986a = 1;
            Object objInvoke = eVar.invoke(this);
            if (objInvoke == aVar) {
                return aVar;
            }
            p0Var = p0Var2;
            obj = objInvoke;
            if (p0Var.f3045b.decrementAndGet() < 0) {
            }
        } catch (Throwable th4) {
            p0Var = p0Var2;
            th2 = th4;
            if (p0Var.f3045b.decrementAndGet() < 0) {
            }
        }
    }
}
