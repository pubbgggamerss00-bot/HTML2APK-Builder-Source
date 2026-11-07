package g9;

import android.content.Context;
import com.basitce.htmltoapk.R;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11763a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11764b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11765c;

    public /* synthetic */ n(int i10, Object obj, Object obj2) {
        this.f11763a = i10;
        this.f11764b = obj;
        this.f11765c = obj2;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f11763a;
        Object obj = this.f11765c;
        Object obj2 = this.f11764b;
        switch (i10) {
            case 0:
                hf.a.a((c.k) obj2, (Context) obj, "text/html", R.string.launch_no_app);
                break;
            default:
                ((eh.l) obj2).invoke(((z8.f0) obj).f34807a);
                break;
        }
        return pg.f0.f21461a;
    }
}
