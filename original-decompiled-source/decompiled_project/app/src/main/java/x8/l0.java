package x8;

import com.basitce.htmltoapk.data.local.entity.FolderEntity;
import t0.ff;

/* loaded from: classes.dex */
public final class l0 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FolderEntity f32904a;

    public l0(FolderEntity folderEntity) {
        this.f32904a = folderEntity;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            ff.b(this.f32904a.getName(), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
        }
        return pg.f0.f21461a;
    }
}
