package q1;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class e0 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f21686a;

    public e0(Bitmap bitmap) {
        this.f21686a = bitmap;
    }

    @Override // q1.n1
    public final int a() {
        return this.f21686a.getWidth();
    }

    public final int b() {
        Bitmap.Config config = this.f21686a.getConfig();
        kotlin.jvm.internal.r.b(config);
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        if (config == Bitmap.Config.RGBA_F16) {
            return 3;
        }
        return config == Bitmap.Config.HARDWARE ? 4 : 0;
    }

    public final void c() {
        this.f21686a.prepareToDraw();
    }

    @Override // q1.n1
    public final int getHeight() {
        return this.f21686a.getHeight();
    }
}
