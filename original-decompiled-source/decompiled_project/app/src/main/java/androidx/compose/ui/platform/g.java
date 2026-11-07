package androidx.compose.ui.platform;

import eh.p;
import kotlin.jvm.internal.s;
import pg.f0;
import x0.j;

/* loaded from: classes.dex */
public final class g extends s implements p<j, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f1362a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p<j, Integer, f0> f1363b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(i iVar, p<? super j, ? super Integer, f0> pVar) {
        super(2);
        this.f1362a = iVar;
        this.f1363b = pVar;
    }

    @Override // eh.p
    public final f0 invoke(j jVar, Integer num) {
        j jVar2 = jVar;
        int iIntValue = num.intValue();
        if (jVar2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            AndroidCompositionLocals_androidKt.a(this.f1362a.f1366a, this.f1363b, jVar2, 0);
        } else {
            jVar2.v();
        }
        return f0.f21461a;
    }
}
