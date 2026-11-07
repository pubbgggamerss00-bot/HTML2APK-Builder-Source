package l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final g f13641a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f13642b = null;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f13643c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13644d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13645e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13646f;

    public h(g gVar) {
        this.f13641a = gVar;
    }

    public final void a() {
        g gVar = this.f13641a;
        Drawable checkMarkDrawable = gVar.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f13644d || this.f13645e) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f13644d) {
                    drawableMutate.setTintList(this.f13642b);
                }
                if (this.f13645e) {
                    drawableMutate.setTintMode(this.f13643c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(gVar.getDrawableState());
                }
                gVar.setCheckMarkDrawable(drawableMutate);
            }
        }
    }
}
