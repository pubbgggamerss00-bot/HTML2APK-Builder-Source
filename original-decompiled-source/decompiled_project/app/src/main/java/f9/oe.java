package f9;

import h8.v;
import java.net.HttpURLConnection;

/* loaded from: classes.dex */
public final /* synthetic */ class oe implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10198a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10199b;

    public /* synthetic */ oe(Object obj, int i10) {
        this.f10198a = i10;
        this.f10199b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f10198a) {
            case 0:
                ((eh.l) this.f10199b).invoke(Integer.valueOf((int) ((Float) obj).floatValue()));
                return pg.f0.f21461a;
            case 1:
                ((HttpURLConnection) this.f10199b).disconnect();
                return pg.f0.f21461a;
            default:
                h8.v vVar = (h8.v) this.f10199b;
                t8.y3 y3Var = (t8.y3) obj;
                Integer num = y3Var.f28591k;
                v.b bVar = (v.b) vVar;
                return t8.y3.a(y3Var, null, null, null, null, null, Integer.valueOf((num != null ? num.intValue() : 0) + bVar.f12476c), y3Var.f28592l || bVar.f12479f, null, null, null, null, 0, null, null, null, 4191231);
        }
    }
}
