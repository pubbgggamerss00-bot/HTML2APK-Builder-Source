package l9;

import android.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

@vg.e(c = "com.basitce.htmltoapk.util.FileBackedTextStateKt$fileBackedTextState$1$1$1", f = "FileBackedTextState.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class r extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f16875a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f16876b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ File f16877c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f16878d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str, File file, File file2, String str2, tg.e<? super r> eVar) {
        super(2, eVar);
        this.f16875a = str;
        this.f16876b = file;
        this.f16877c = file2;
        this.f16878d = str2;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new r(this.f16875a, this.f16876b, this.f16877c, this.f16878d, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((r) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws IOException {
        File file = this.f16877c;
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        String str = this.f16875a;
        int length = str.length();
        File file2 = this.f16876b;
        if (length == 0 && !file2.isFile()) {
            return pg.f0.f21461a;
        }
        try {
            file.mkdirs();
            File file3 = new File(file, this.f16878d + ".tmp");
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file3), mh.a.f18238b), 8192);
            try {
                bufferedWriter.write(str);
                pg.f0 f0Var = pg.f0.f21461a;
                bufferedWriter.close();
                Files.move(file3.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
            } finally {
            }
        } catch (IOException e10) {
            Log.w("HtmlDraft", "Unable to persist draft", e10);
        }
        return pg.f0.f21461a;
    }
}
