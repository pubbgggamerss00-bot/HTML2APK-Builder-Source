package x8;

import com.basitce.htmltoapk.data.local.entity.FolderEntity;

/* loaded from: classes.dex */
public final class d0 implements eh.l<x0.l0, x0.k0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.p<Long, p1.e, pg.f0> f32487a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FolderEntity f32488b;

    /* JADX WARN: Multi-variable type inference failed */
    public d0(eh.p<? super Long, ? super p1.e, pg.f0> pVar, FolderEntity folderEntity) {
        this.f32487a = pVar;
        this.f32488b = folderEntity;
    }

    @Override // eh.l
    public final x0.k0 invoke(x0.l0 l0Var) {
        x0.l0 DisposableEffect = l0Var;
        kotlin.jvm.internal.r.e(DisposableEffect, "$this$DisposableEffect");
        return new c0(this.f32487a, this.f32488b);
    }
}
