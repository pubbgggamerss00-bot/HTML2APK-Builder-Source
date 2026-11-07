package x8;

import com.basitce.htmltoapk.data.local.entity.FolderEntity;

/* loaded from: classes.dex */
public final class g0 implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.l<FolderEntity, pg.f0> f32629a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FolderEntity f32630b;

    /* JADX WARN: Multi-variable type inference failed */
    public g0(eh.l<? super FolderEntity, pg.f0> lVar, FolderEntity folderEntity) {
        this.f32629a = lVar;
        this.f32630b = folderEntity;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        this.f32629a.invoke(this.f32630b);
        return pg.f0.f21461a;
    }
}
