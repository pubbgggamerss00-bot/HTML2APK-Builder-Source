package z;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1.b f34548a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.layout.c f34549b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(f1.b bVar, androidx.compose.foundation.layout.c cVar) {
        super(2);
        this.f34548a = bVar;
        this.f34549b = cVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        if (jVar2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            this.f34548a.b(this.f34549b, jVar2, 0);
        } else {
            jVar2.v();
        }
        return pg.f0.f21461a;
    }
}
