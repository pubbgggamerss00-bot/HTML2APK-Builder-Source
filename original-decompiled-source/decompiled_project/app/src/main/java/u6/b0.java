package u6;

import android.content.Context;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;

@vg.e(c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2", f = "UnfinishedWorkListener.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class b0 extends vg.i implements eh.p<Boolean, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f29260a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f29261b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Context context, tg.e<? super b0> eVar) {
        super(2, eVar);
        this.f29261b = context;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        b0 b0Var = new b0(this.f29261b, eVar);
        b0Var.f29260a = ((Boolean) obj).booleanValue();
        return b0Var;
    }

    @Override // eh.p
    public final Object invoke(Boolean bool, tg.e<? super pg.f0> eVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((b0) create(bool2, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        d7.p.a(this.f29261b, RescheduleReceiver.class, this.f29260a);
        return pg.f0.f21461a;
    }
}
