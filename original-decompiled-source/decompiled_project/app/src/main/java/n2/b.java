package n2;

import android.content.Context;
import f3.q;
import i2.g1;
import java.io.File;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
import p1.e;
import p1.f;

/* loaded from: classes.dex */
public final class b extends s implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18328a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18329b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18330c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        super(0);
        this.f18328a = i10;
        this.f18329b = obj;
        this.f18330c = obj2;
    }

    @Override // eh.a
    public final Object invoke() {
        e eVar;
        switch (this.f18328a) {
            case 0:
                eh.a aVar = (eh.a) this.f18329b;
                if (aVar != null && (eVar = (e) aVar.invoke()) != null) {
                    return eVar;
                }
                g1 g1Var = (g1) this.f18330c;
                if (!g1Var.l1().f1157p) {
                    g1Var = null;
                }
                if (g1Var != null) {
                    return f.a(0L, q.e(g1Var.f11384c));
                }
                return null;
            default:
                Context context = (Context) this.f18329b;
                ((u4.b) this.f18330c).getClass();
                String fileName = "settings".concat(".preferences_pb");
                r.e(fileName, "fileName");
                return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(fileName));
        }
    }
}
