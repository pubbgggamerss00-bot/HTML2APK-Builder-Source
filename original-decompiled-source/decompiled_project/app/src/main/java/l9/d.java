package l9;

import com.basitce.htmltoapk.MainActivity;
import com.basitce.htmltoapk.R;
import h9.c3;
import q8.p2;
import t0.uc;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f16787a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cc.b f16788b;

    public /* synthetic */ d(MainActivity mainActivity, cc.b bVar) {
        this.f16787a = mainActivity;
        this.f16788b = bVar;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        if (((cc.a) obj).f5358b == 11) {
            uc ucVar = p2.f22362a;
            MainActivity mainActivity = this.f16787a;
            String string = mainActivity.getString(R.string.update_downloaded_snack);
            kotlin.jvm.internal.r.d(string, "getString(...)");
            p2.a(string, mainActivity.getString(R.string.update_btn_restart), new c3(this.f16788b, 1));
        }
        return pg.f0.f21461a;
    }
}
