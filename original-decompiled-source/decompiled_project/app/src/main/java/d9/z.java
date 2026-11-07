package d9;

import com.basitce.htmltoapk.MainActivity;
import pg.f0;
import x0.n1;

/* loaded from: classes.dex */
public final /* synthetic */ class z implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7667a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7668b;

    public /* synthetic */ z(Object obj, int i10) {
        this.f7667a = i10;
        this.f7668b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f7667a;
        Object obj = this.f7668b;
        switch (i10) {
            case 0:
                h0.e eVar = m.f7624a;
                ((n1) obj).setValue(Boolean.FALSE);
                break;
            case 1:
                ((n1) obj).setValue(Boolean.FALSE);
                break;
            default:
                ((MainActivity) obj).setPendingRoute(null);
                break;
        }
        return f0.f21461a;
    }
}
