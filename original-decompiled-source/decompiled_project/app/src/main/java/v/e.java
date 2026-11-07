package v;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yalantis.ucrop.view.CropImageView;
import v.d;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final x0.d0 f29814a = new x0.d0(a.f29816a);

    /* renamed from: b, reason: collision with root package name */
    public static final b f29815b = new b();

    public static final class a extends kotlin.jvm.internal.s implements eh.l<x0.x, d> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f29816a = new a(1);

        @Override // eh.l
        public final d invoke(x0.x xVar) {
            if (((Context) xVar.a(AndroidCompositionLocals_androidKt.f1281b)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                return e.f29815b;
            }
            d.f29799a.getClass();
            return d.a.f29802c;
        }
    }

    public static final class b implements d {
        @Override // v.d
        public final float a(float f10, float f11, float f12) {
            float fAbs = Math.abs((f11 + f10) - f10);
            boolean z10 = fAbs <= f12;
            float f13 = (0.3f * f12) - (CropImageView.DEFAULT_ASPECT_RATIO * fAbs);
            float f14 = f12 - f13;
            if (z10 && f14 < fAbs) {
                f13 = f12 - fAbs;
            }
            return f10 - f13;
        }
    }
}
