package h8;

import android.graphics.Bitmap;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;
import pg.f0;
import ph.i0;

@vg.e(c = "com.basitce.htmltoapk.ai.AiProjectStore$saveIcon$2", f = "AiProjectStore.kt", l = {HeaderItem.DATA_START_OFFSET, 111}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class q extends vg.i implements eh.p<i0, tg.e<? super f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f12437a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f12438b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f12439c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bitmap f12440d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(m mVar, long j10, Bitmap bitmap, tg.e<? super q> eVar) {
        super(2, eVar);
        this.f12438b = mVar;
        this.f12439c = j10;
        this.f12440d = bitmap;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        return new q(this.f12438b, this.f12439c, this.f12440d, eVar);
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
        return ((q) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0102, code lost:
    
        if (r2.c(r0, r84) == r3) goto L24;
     */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws IOException {
        Object byId;
        m mVar = this.f12438b;
        n8.s sVar = mVar.f12417b;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f12437a;
        long j10 = this.f12439c;
        if (i10 == 0) {
            pg.q.b(obj);
            this.f12437a = 1;
            byId = sVar.f18583a.getById(j10, this);
            if (byId != aVar) {
            }
            return aVar;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return f0.f21461a;
        }
        pg.q.b(obj);
        byId = obj;
        ProjectEntity projectEntity = (ProjectEntity) byId;
        if (projectEntity == null) {
            return f0.f21461a;
        }
        File file = new File(mVar.f12416a.getFilesDir(), c2.u.a("projects/", "/icon/ai_icon.png", j10));
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            this.f12440d.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.close();
            ProjectEntity projectEntityCopy$default = ProjectEntity.copy$default(projectEntity, 0L, null, null, null, 0, null, 0, 0, null, null, null, null, null, file.getAbsolutePath(), null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, 0L, -8193, -1, 15, null);
            this.f12437a = 2;
        } finally {
        }
    }
}
