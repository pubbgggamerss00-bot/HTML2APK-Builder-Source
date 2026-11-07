package androidx.camera.core.processing.concurrent;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import android.widget.Toast;
import com.htmltoapk.template.R;
import com.htmltoapk.template.WebViewActivity;
import com.htmltoapk.template.j0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.json.JSONException;
import w2.q0;
import w2.y;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f597t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f598u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f599v;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i6) {
        this.s = i6;
        this.f597t = obj;
        this.f598u = obj2;
        this.f599v = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException, IOException {
        Long lValueOf;
        switch (this.s) {
            case 0:
                ((DualSurfaceProcessor) this.f597t).lambda$executeSafely$8((Runnable) this.f598u, (Runnable) this.f599v);
                return;
            case 1:
                WebViewActivity.deliverPhotoFile$lambda$16$lambda$15((WebViewActivity) this.f597t, (String) this.f598u, (Throwable) this.f599v);
                return;
            case 2:
                WebViewActivity.pickFileLauncher$lambda$20$lambda$19$lambda$17((WebViewActivity) this.f597t, (String) this.f598u, (WebViewActivity.UriReadResult.Content) this.f599v);
                return;
            case 3:
                WebViewActivity.pickFileLauncher$lambda$20$lambda$19((WebViewActivity) this.f597t, (Uri) this.f598u, (String) this.f599v);
                return;
            case 4:
                final Context context = (Context) this.f597t;
                Uri uri = (Uri) this.f598u;
                File file = (File) this.f599v;
                final boolean z6 = false;
                try {
                    OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uri, "w");
                    if (outputStreamOpenOutputStream != null) {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(file);
                            try {
                                long jF = f5.b.f(fileInputStream, outputStreamOpenOutputStream, 65536);
                                fileInputStream.close();
                                lValueOf = Long.valueOf(jF);
                                outputStreamOpenOutputStream.close();
                            } finally {
                            }
                        } finally {
                        }
                    } else {
                        lValueOf = null;
                    }
                    if (lValueOf != null) {
                        z6 = true;
                    }
                } catch (Exception e6) {
                    Log.w("PdfExport", "Save failed", e6);
                }
                y.f15051a.post(new Runnable() { // from class: w2.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        Toast.makeText(context, z6 ? R.string.pdf_document_saved : R.string.pdf_document_export_failed, 0).show();
                    }
                });
                return;
            default:
                q0 q0Var = (q0) this.f597t;
                j0 j0Var = (j0) this.f598u;
                Bitmap bitmap = (Bitmap) this.f599v;
                if (q0Var.f14977f) {
                    return;
                }
                j0Var.invoke(bitmap);
                return;
        }
    }
}
