package x8;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.basitce.htmltoapk.R;
import java.io.File;

/* loaded from: classes.dex */
public final class b8 implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f32338a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f32339b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c.k<Intent, e.a> f32340c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.n1<File> f32341d;

    public b8(Context context, File file, c.k<Intent, e.a> kVar, x0.n1<File> n1Var) {
        this.f32338a = context;
        this.f32339b = file;
        this.f32340c = kVar;
        this.f32341d = n1Var;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        Context context = this.f32338a;
        boolean zCanRequestPackageInstalls = context.getPackageManager().canRequestPackageInstalls();
        File file = this.f32339b;
        if (zCanRequestPackageInstalls) {
            k8.b(context, file);
        } else {
            this.f32341d.setValue(file);
            hf.a.a(this.f32340c, context, new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + context.getPackageName())), R.string.launch_no_app);
        }
        return pg.f0.f21461a;
    }
}
