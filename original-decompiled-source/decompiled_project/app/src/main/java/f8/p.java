package f8;

import com.basitce.htmltoapk.MainActivity;
import pg.f0;
import x0.n1;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8923a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8924b;

    public /* synthetic */ p(Object obj, int i10) {
        this.f8923a = i10;
        this.f8924b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f8923a) {
            case 0:
                ((MainActivity) this.f8924b).setIncomingHtml(null);
                break;
            default:
                ((n1) this.f8924b).setValue(Boolean.TRUE);
                break;
        }
        return f0.f21461a;
    }
}
