package j9;

import android.content.Context;
import j9.x1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.UUID;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.templates.TemplatesViewModel$useTemplateInternal$htmlFile$1", f = "TemplatesViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class b2 extends vg.i implements eh.p<ph.i0, tg.e<? super File>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f15296a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x1.a f15297b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(Context context, x1.a aVar, tg.e<? super b2> eVar) {
        super(2, eVar);
        this.f15296a = context;
        this.f15297b = aVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new b2(this.f15296a, this.f15297b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super File> eVar) {
        return ((b2) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws Exception {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        Context context = this.f15296a;
        File file = new File(context.getFilesDir(), "templates");
        file.mkdirs();
        x1.a aVar2 = this.f15297b;
        String str = aVar2.f15636a;
        String str2 = aVar2.f15641f;
        File file2 = new File(file, "template_" + str + "_" + UUID.randomUUID() + ".html");
        try {
            if (str2 == null) {
                ah.l.r(file2, aVar2.f15640e, mh.a.f18238b);
                return file2;
            }
            InputStream inputStreamOpen = context.getAssets().open(str2);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    kotlin.jvm.internal.r.b(inputStreamOpen);
                    long jA = ah.b.a(inputStreamOpen, fileOutputStream, 8192);
                    fileOutputStream.close();
                    i.a.b(jA);
                    inputStreamOpen.close();
                    return file2;
                } finally {
                }
            } finally {
            }
        } catch (Exception e10) {
            file2.delete();
            throw e10;
        }
    }
}
