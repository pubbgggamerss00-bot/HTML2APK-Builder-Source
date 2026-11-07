package m9;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.local.entity.KeystoreEntity;
import java.io.File;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17933a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f17934b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17935c;

    public /* synthetic */ t(Context context, Object obj, int i10) {
        this.f17933a = i10;
        this.f17934b = context;
        this.f17935c = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        String message;
        int i10 = this.f17933a;
        Object obj2 = this.f17935c;
        Context context = this.f17934b;
        switch (i10) {
            case 0:
                final Activity activity = (Activity) context;
                final String str = (String) obj2;
                final File it = (File) obj;
                kotlin.jvm.internal.r.e(it, "it");
                Handler handler = r0.f17892a;
                new Thread(new Runnable() { // from class: m9.l0
                    @Override // java.lang.Runnable
                    public final void run() {
                        final Activity activity2 = activity;
                        String str2 = str;
                        File file = it;
                        Handler handler2 = r0.f17892a;
                        try {
                            File file2 = new File(activity2.getCacheDir(), "pdf_share");
                            ah.l.f(file2);
                            file2.mkdirs();
                            final File file3 = new File(file2, r0.a(str2));
                            ah.l.e(file, file3);
                            final Uri uriForFile = FileProvider.getUriForFile(activity2, activity2.getPackageName() + ".fileprovider", file3);
                            handler2.post(new Runnable() { // from class: m9.m0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Activity activity3 = activity2;
                                    if (activity3.isFinishing() || activity3.isDestroyed()) {
                                        return;
                                    }
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("application/pdf");
                                    Uri uri = uriForFile;
                                    intent.putExtra("android.intent.extra.STREAM", uri);
                                    File file4 = file3;
                                    intent.putExtra("android.intent.extra.TITLE", file4.getName());
                                    intent.setClipData(ClipData.newRawUri(file4.getName(), uri));
                                    intent.addFlags(1);
                                    try {
                                        activity3.startActivity(Intent.createChooser(intent, activity3.getString(R.string.pdf_document_share)));
                                    } catch (Exception e10) {
                                        Handler handler3 = r0.f17892a;
                                        Log.w("PdfExport", "Export failed", e10);
                                        Toast.makeText(activity3, R.string.pdf_document_export_failed, 0).show();
                                    }
                                }
                            });
                        } catch (Exception e10) {
                            handler2.post(new Runnable() { // from class: m9.n0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Handler handler3 = r0.f17892a;
                                    Log.w("PdfExport", "Export failed", e10);
                                    Toast.makeText(activity2, R.string.pdf_document_export_failed, 0).show();
                                }
                            });
                        }
                    }
                }).start();
                break;
            default:
                KeystoreEntity keystoreEntity = (KeystoreEntity) obj2;
                Object obj3 = ((pg.p) obj).f21471a;
                Throwable thA = pg.p.a(obj3);
                if (thA == null) {
                    message = context.getString(R.string.keystore_deleted, keystoreEntity.getAlias());
                    kotlin.jvm.internal.r.d(message, "getString(...)");
                } else {
                    message = thA.getMessage();
                    if (message == null) {
                        message = context.getString(R.string.keystore_operation_failed);
                        kotlin.jvm.internal.r.d(message, "getString(...)");
                    }
                }
                Toast.makeText(context, message, 0).show();
                break;
        }
        return pg.f0.f21461a;
    }
}
