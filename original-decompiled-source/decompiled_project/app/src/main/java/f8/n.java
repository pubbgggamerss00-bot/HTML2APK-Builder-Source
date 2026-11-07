package f8;

import com.basitce.htmltoapk.MainActivity;
import j9.x1;
import pg.f0;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8919a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8920b;

    public /* synthetic */ n(Object obj, int i10) {
        this.f8919a = i10;
        this.f8920b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f8919a) {
            case 0:
                return MainActivity.jankMonitor$lambda$0((MainActivity) this.f8920b);
            default:
                ((x1) this.f8920b).g();
                return f0.f21461a;
        }
    }
}
