package y8;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.basitce.htmltoapk.R;

/* loaded from: classes.dex */
public final /* synthetic */ class v0 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c.k f34278a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f34279b;

    public /* synthetic */ v0(h9.x xVar, c.k kVar, Context context) {
        this.f34278a = kVar;
        this.f34279b = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.l
    public final Object invoke(Object obj) {
        Object obj2 = ((pg.p) obj).f21471a;
        Throwable thA = pg.p.a(obj2);
        Context context = this.f34279b;
        if (thA == null) {
            pg.n nVar = (pg.n) obj2;
            Uri uri = (Uri) nVar.f21469a;
            String str = (String) nVar.f21470b;
            hf.a.a(this.f34278a, context, Intent.createChooser(h9.x.f(uri, str, "application/x-pem-file"), str), R.string.launch_no_app);
        } else {
            String message = thA.getMessage();
            if (message == null) {
                message = context.getString(R.string.keystore_operation_failed);
                kotlin.jvm.internal.r.d(message, "getString(...)");
            }
            Toast.makeText(context, message, 0).show();
        }
        return pg.f0.f21461a;
    }
}
