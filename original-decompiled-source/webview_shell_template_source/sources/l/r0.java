package l;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.view.menu.f f13718a;

    /* renamed from: b, reason: collision with root package name */
    public final View f13719b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.appcompat.view.menu.i f13720c;

    public r0(Context context, View view, int i6, int i7) {
        this.f13719b = view;
        androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(context);
        this.f13718a = fVar;
        fVar.f174e = new p0(this);
        androidx.appcompat.view.menu.i iVar = new androidx.appcompat.view.menu.i(i6, i7, context, view, fVar, false);
        this.f13720c = iVar;
        iVar.f225g = 17;
        iVar.f228k = new q0(this);
    }
}
