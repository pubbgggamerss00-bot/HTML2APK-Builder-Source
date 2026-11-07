package x8;

import com.basitce.htmltoapk.data.local.entity.FolderEntity;

/* loaded from: classes.dex */
public final class c0 implements x0.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.p f32422a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FolderEntity f32423b;

    public c0(eh.p pVar, FolderEntity folderEntity) {
        this.f32422a = pVar;
        this.f32423b = folderEntity;
    }

    @Override // x0.k0
    public final void a() {
        this.f32422a.invoke(Long.valueOf(this.f32423b.getId()), null);
    }
}
