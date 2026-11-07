package f9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Set;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel$persistPastedHtml$2", f = "ProjectEditorViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class tg extends vg.i implements eh.p<ph.i0, tg.e<? super pg.n<? extends String, ? extends File>>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f10649a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fg f10650b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f10651c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg(String str, fg fgVar, long j10, tg.e<? super tg> eVar) {
        super(2, eVar);
        this.f10649a = str;
        this.f10650b = fgVar;
        this.f10651c = j10;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new tg(this.f10649a, this.f10650b, this.f10651c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.n<? extends String, ? extends File>> eVar) {
        return ((tg) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws IOException {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        Set<String> set = l9.w.f16906a;
        String strA = l9.w.a(this.f10649a);
        File file = new File(this.f10650b.w(this.f10651c), "content");
        file.mkdirs();
        File file2 = new File(file, "index.html");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2), mh.a.f18238b), 8192);
        try {
            bufferedWriter.write(strA);
            pg.f0 f0Var = pg.f0.f21461a;
            bufferedWriter.close();
            return new pg.n(strA, file2);
        } finally {
        }
    }
}
