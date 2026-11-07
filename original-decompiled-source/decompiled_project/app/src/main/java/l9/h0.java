package l9;

import java.io.File;
import java.io.IOException;

@vg.e(c = "com.basitce.htmltoapk.util.ProjectFolderImporter$import$4", f = "ProjectFolderImporter.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class h0 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ File f16836a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f16837b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(File file, File file2, tg.e<? super h0> eVar) {
        super(2, eVar);
        this.f16836a = file;
        this.f16837b = file2;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new h0(this.f16836a, this.f16837b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((h0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws IOException {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        File file = this.f16837b;
        File file2 = new File(file.getParentFile(), "content.previous");
        ah.l.f(file2);
        if (file.exists() && !file.renameTo(file2)) {
            throw new IOException("Cannot move old content aside");
        }
        if (this.f16836a.renameTo(file)) {
            ah.l.f(file2);
            return pg.f0.f21461a;
        }
        file2.renameTo(file);
        throw new IOException("Cannot move imported content into place");
    }
}
