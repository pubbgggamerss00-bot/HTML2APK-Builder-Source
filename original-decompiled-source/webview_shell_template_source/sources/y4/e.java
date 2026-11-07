package y4;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import u4.g;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class e extends u4.g {

    /* renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ int f15251a0 = 0;
    public a Z;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b extends e {
        @Override // u4.g
        public final void g(Canvas canvas) {
            if (this.Z.f15252q.isEmpty()) {
                super.g(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.Z.f15252q);
            } else {
                canvas.clipRect(this.Z.f15252q, Region.Op.DIFFERENCE);
            }
            super.g(canvas);
            canvas.restore();
        }
    }

    @Override // u4.g, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.Z = new a(this.Z);
        return this;
    }

    public final void x(float f6, float f7, float f8, float f9) {
        RectF rectF = this.Z.f15252q;
        if (f6 == rectF.left && f7 == rectF.top && f8 == rectF.right && f9 == rectF.bottom) {
            return;
        }
        rectF.set(f6, f7, f8, f9);
        invalidateSelf();
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a extends g.c {

        /* renamed from: q, reason: collision with root package name */
        public final RectF f15252q;

        public a(u4.k kVar, RectF rectF) {
            super(kVar);
            this.f15252q = rectF;
        }

        @Override // u4.g.c, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            b bVar = new b(this);
            bVar.Z = this;
            bVar.invalidateSelf();
            return bVar;
        }

        public a(a aVar) {
            super(aVar);
            this.f15252q = aVar.f15252q;
        }
    }
}
