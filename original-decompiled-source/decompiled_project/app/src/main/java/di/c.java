package di;

import java.util.ArrayList;
import yh.c;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7990a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7991b;

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f7990a) {
            case 0:
                f fVar = (f) this.f7991b;
                kotlinx.serialization.json.h node = (kotlinx.serialization.json.h) obj;
                kotlin.jvm.internal.r.e(node, "node");
                fVar.d0((String) qg.x.J((ArrayList) fVar.f4646a), node);
                break;
            default:
                ((yh.c) this.f7991b).l(null);
                break;
        }
        return pg.f0.f21461a;
    }

    public /* synthetic */ c(yh.c cVar, c.a aVar) {
        this.f7991b = cVar;
    }
}
