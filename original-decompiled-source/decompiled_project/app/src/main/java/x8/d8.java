package x8;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;
import com.basitce.htmltoapk.R;
import java.io.File;

/* loaded from: classes.dex */
public final class d8 implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ File f32526a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f32527b;

    public d8(Context context, File file) {
        this.f32526a = file;
        this.f32527b = context;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        File file = this.f32526a;
        kotlin.jvm.internal.r.b(file);
        Context context = this.f32527b;
        Object systemService = context.getSystemService("clipboard");
        kotlin.jvm.internal.r.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("output_path", file.getAbsolutePath()));
        Toast.makeText(context, context.getString(R.string.output_path_copied), 0).show();
        return pg.f0.f21461a;
    }
}
