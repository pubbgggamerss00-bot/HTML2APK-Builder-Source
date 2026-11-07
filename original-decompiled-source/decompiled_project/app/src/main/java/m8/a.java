package m8;

import eh.l;
import kh.i;
import kotlin.jvm.internal.r;
import kotlinx.serialization.json.d;
import pg.f0;
import q2.a0;
import q2.c0;
import q2.d0;
import q2.w;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17707a;

    public /* synthetic */ a(int i10) {
        this.f17707a = i10;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f17707a) {
            case 0:
                d Json = (d) obj;
                r.e(Json, "$this$Json");
                Json.f16440a = true;
                return f0.f21461a;
            default:
                d0 semantics = (d0) obj;
                r.e(semantics, "$this$semantics");
                i<Object>[] iVarArr = a0.f21754a;
                c0<f0> c0Var = w.f21827h;
                f0 f0Var = f0.f21461a;
                semantics.c(c0Var, f0Var);
                return f0Var;
        }
    }
}
