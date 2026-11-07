package x8;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.basitce.htmltoapk.R;
import java.io.File;

/* loaded from: classes.dex */
public final class c8 implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ File f32455a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f32456b;

    public c8(Context context, File file) {
        this.f32455a = file;
        this.f32456b = context;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        Context context = this.f32456b;
        File file = this.f32455a;
        try {
            Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", file);
            kotlin.jvm.internal.r.d(uriForFile, "getUriForFile(...)");
            String name = file.getName();
            kotlin.jvm.internal.r.d(name, "getName(...)");
            String str = mh.t.i(name, ".apk", true) ? "application/vnd.android.package-archive" : "application/octet-stream";
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(str);
            intent.putExtra("android.intent.extra.STREAM", uriForFile);
            intent.addFlags(1);
            context.startActivity(Intent.createChooser(intent, context.getString(R.string.output_share)));
        } catch (Exception e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = "";
            }
            Toast.makeText(context, context.getString(R.string.output_error_share, message), 1).show();
        }
        return pg.f0.f21461a;
    }
}
