package h8;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import java.io.File;
import org.bouncycastle.asn1.eac.EACTags;
import pg.f0;
import ph.i0;

@vg.e(c = "com.basitce.htmltoapk.ai.AiProjectStore$readHtml$2", f = "AiProjectStore.kt", l = {EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class p extends vg.i implements eh.p<i0, tg.e<? super String>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f12434a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f12435b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f12436c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(m mVar, long j10, tg.e<? super p> eVar) {
        super(2, eVar);
        this.f12435b = mVar;
        this.f12436c = j10;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        return new p(this.f12435b, this.f12436c, eVar);
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super String> eVar) {
        return ((p) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        String sourcePath;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f12434a;
        if (i10 == 0) {
            pg.q.b(obj);
            n8.s sVar = this.f12435b.f12417b;
            this.f12434a = 1;
            obj = sVar.f18583a.getById(this.f12436c, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        ProjectEntity projectEntity = (ProjectEntity) obj;
        if (projectEntity != null && (sourcePath = projectEntity.getSourcePath()) != null) {
            File file = new File(sourcePath);
            if (!file.isFile()) {
                file = null;
            }
            if (file != null) {
                return ah.l.k(file, mh.a.f18238b);
            }
        }
        return null;
    }
}
