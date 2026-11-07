package b9;

import android.content.Context;
import android.net.Uri;
import b9.e3;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Set;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.preview.PreviewDataHolder$preparePaste$2", f = "PreviewDataHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class f3 extends vg.i implements eh.p<ph.i0, tg.e<? super e3.a>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f3833a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e3.a f3834b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(Context context, e3.a aVar, tg.e<? super f3> eVar) {
        super(2, eVar);
        this.f3833a = context;
        this.f3834b = aVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new f3(this.f3833a, this.f3834b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super e3.a> eVar) {
        return ((f3) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws Exception {
        e3.a aVar = this.f3834b;
        ug.a aVar2 = ug.a.f29706a;
        pg.q.b(obj);
        Context context = this.f3833a;
        File file = new File(context.getCacheDir(), "preview_paste.html");
        File fileCreateTempFile = File.createTempFile("preview_pending_", ".html", context.getCacheDir());
        try {
            kotlin.jvm.internal.r.b(fileCreateTempFile);
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileCreateTempFile), mh.a.f18238b), 8192);
            try {
                Set<String> set = l9.w.f16906a;
                bufferedWriter.write(l9.w.a(aVar.f3799c));
                pg.f0 f0Var = pg.f0.f21461a;
                bufferedWriter.close();
                ph.v1.e(getContext());
                Files.move(fileCreateTempFile.toPath(), file.toPath(), StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
                e3.b bVar = e3.b.f3811a;
                return e3.a.a(aVar, Uri.fromFile(file));
            } finally {
            }
        } catch (Exception e10) {
            fileCreateTempFile.delete();
            throw e10;
        }
    }
}
