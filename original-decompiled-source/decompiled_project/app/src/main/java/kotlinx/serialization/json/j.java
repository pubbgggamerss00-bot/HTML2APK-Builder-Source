package kotlinx.serialization.json;

import kotlin.jvm.internal.h0;
import s5.c;

/* loaded from: classes2.dex */
public final /* synthetic */ class j implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16450a;

    public /* synthetic */ j(int i10) {
        this.f16450a = i10;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f16450a) {
            case 0:
                return JsonElementSerializer.descriptor$lambda$5$lambda$1();
            default:
                j5.c cVar = new j5.c();
                cVar.a(h0.a(c.a.class), new s5.b());
                return cVar.b();
        }
    }
}
