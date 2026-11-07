package e9;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.apkgenerator.BuildLogger;
import s8.e2;
import t8.m3;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8454a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8455b;

    public /* synthetic */ k(Object obj, int i10) {
        this.f8454a = i10;
        this.f8455b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f8454a;
        Object obj = this.f8455b;
        switch (i10) {
            case 0:
                p5.x.c(e2.f.f24636c.f24627a, (p5.x) obj);
                break;
            case 1:
                ((m3) obj).g();
                break;
            default:
                Context context = (Context) obj;
                String strLocalizedEn = BuildLogger.INSTANCE.localizedEn(R.string.free_premium_email_subject, new Object[0]);
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:warzonevangard@gmail.com?subject=" + Uri.encode(strLocalizedEn)));
                intent.putExtra("android.intent.extra.EMAIL", new String[]{"warzonevangard@gmail.com"});
                intent.putExtra("android.intent.extra.SUBJECT", strLocalizedEn);
                try {
                    context.startActivity(Intent.createChooser(intent, context.getString(R.string.free_premium_email_chooser)));
                } catch (ActivityNotFoundException unused) {
                }
                break;
        }
        return pg.f0.f21461a;
    }
}
