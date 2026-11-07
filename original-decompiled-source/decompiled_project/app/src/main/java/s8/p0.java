package s8;

import android.content.Context;
import com.basitce.htmltoapk.R;
import q8.p2;
import t0.uc;

/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f24713a;

    @Override // eh.l
    public final Object invoke(Object obj) {
        String message = (String) obj;
        kotlin.jvm.internal.r.e(message, "message");
        uc ucVar = p2.f22362a;
        String string = this.f24713a.getString(R.string.document_create_failed, message);
        kotlin.jvm.internal.r.d(string, "getString(...)");
        p2.a(string, null, null);
        return pg.f0.f21461a;
    }
}
