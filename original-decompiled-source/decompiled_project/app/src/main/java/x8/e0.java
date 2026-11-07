package x8;

import com.basitce.htmltoapk.data.local.entity.FolderEntity;

/* loaded from: classes.dex */
public final class e0 implements eh.l<g2.v, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.p<Long, p1.e, pg.f0> f32534a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FolderEntity f32535b;

    /* JADX WARN: Multi-variable type inference failed */
    public e0(eh.p<? super Long, ? super p1.e, pg.f0> pVar, FolderEntity folderEntity) {
        this.f32534a = pVar;
        this.f32535b = folderEntity;
    }

    @Override // eh.l
    public final pg.f0 invoke(g2.v vVar) {
        g2.v it = vVar;
        kotlin.jvm.internal.r.e(it, "it");
        this.f32534a.invoke(Long.valueOf(this.f32535b.getId()), g2.w.c(it).N(it, true));
        return pg.f0.f21461a;
    }
}
