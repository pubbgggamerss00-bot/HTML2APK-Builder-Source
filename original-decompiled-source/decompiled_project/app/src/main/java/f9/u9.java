package f9;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.basitce.htmltoapk.R;

/* loaded from: classes.dex */
public final /* synthetic */ class u9 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10722a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10723b;

    public /* synthetic */ u9(Object obj, int i10) {
        this.f10722a = i10;
        this.f10723b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f10722a;
        Object obj = this.f10723b;
        switch (i10) {
            case 0:
                ((x0.n1) obj).setValue(Boolean.valueOf(!((Boolean) r1.getValue()).booleanValue()));
                break;
            default:
                Context context = (Context) obj;
                String string = context.getString(R.string.settings_feedback_subject);
                kotlin.jvm.internal.r.d(string, "getString(...)");
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:warzonevangard@gmail.com?subject=" + Uri.encode(string)));
                intent.putExtra("android.intent.extra.EMAIL", new String[]{"warzonevangard@gmail.com"});
                intent.putExtra("android.intent.extra.SUBJECT", string);
                try {
                    context.startActivity(Intent.createChooser(intent, context.getString(R.string.settings_feedback_chooser)));
                } catch (ActivityNotFoundException unused) {
                    org.bouncycastle.crypto.engines.a.b(context, R.string.settings_feedback_no_app, context, 0);
                }
                break;
        }
        return pg.f0.f21461a;
    }
}
